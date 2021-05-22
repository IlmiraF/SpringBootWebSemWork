package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service;

import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.User;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.UserForm;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos.UserRepo;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;

@Component
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UserRepo usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void signUp(UserForm form, String siteURL) {
        String randomCode = RandomString.make(64);
        User newUser = User.builder()
                .username(form.getUsername())
                .hashPassword(passwordEncoder.encode(form.getPassword()))
                .email(form.getEmail())
                .role(User.Role.USER)
                .state(User.State.ACTIVE)
                .verificationCode(randomCode)
                .enabled(false)
                .build();

        usersRepository.save(newUser);
        sendVerificationEmail(newUser, siteURL);
    }

    private void sendVerificationEmail(User user, String siteURL) {
        String toAddress = user.getEmail();
        String fromAddress = "ilmira.springweb@gmail.com";
        String senderName = "Your company name";
        String subject = "Please verify your registration";
        String content = "Dear {name},<br>"
                + "Please click the link below to verify your registration:<br>"
                + "<h3><a href=\"{URL}\" target=\"_self\">VERIFY</a></h3>"
                + "Thank you,<br>"
                + "Your company name.";

        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        try {
            helper.setFrom(fromAddress, senderName);
            helper.setTo(toAddress);
            helper.setSubject(subject);

            content = content.replace("{name}", user.getUsername());
            String verifyURL = siteURL + "/verify?code=" + user.getVerificationCode();

            content = content.replace("{URL}", verifyURL);

            helper.setText(content, true);
        } catch (MessagingException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        mailSender.send(message);

    }

    public boolean verify(String verificationCode) {
        User user = usersRepository.findByVerificationCode(verificationCode);

        if (user == null || user.isEnabled()) {
            return false;
        } else {
            user.setVerificationCode(null);
            user.setEnabled(true);
            usersRepository.save(user);

            return true;
        }
    }
}
