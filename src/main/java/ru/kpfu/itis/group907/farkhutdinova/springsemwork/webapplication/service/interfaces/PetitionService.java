package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service.interfaces;

import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.User;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.PetitionForm;

import java.time.LocalDate;

public interface PetitionService {
    void newPetition(PetitionForm form, LocalDate date);
    void addUserIntoPetition(Long petitionId, User user);
}
