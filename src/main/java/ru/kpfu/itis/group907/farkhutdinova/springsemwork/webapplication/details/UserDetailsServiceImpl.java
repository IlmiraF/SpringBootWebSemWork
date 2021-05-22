package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.User;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos.UserRepo;

@Component("customUserDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepo usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = usersRepository.findByUsername(username);
        return new UserDetailsImpl(user);
    }
}
