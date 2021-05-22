package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.User;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
    @Modifying
    @Query("delete from User u where u.id=?1")
    void deleteById(String id);
    Optional<User> findByEmail(String email);

    @Query("SELECT u FROM User u WHERE u.verificationCode = ?1")
    public User findByVerificationCode(String code);
}
