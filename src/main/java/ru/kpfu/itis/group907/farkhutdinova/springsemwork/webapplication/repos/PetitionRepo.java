package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.Petition;

public interface PetitionRepo extends JpaRepository<Petition, Long> {
}
