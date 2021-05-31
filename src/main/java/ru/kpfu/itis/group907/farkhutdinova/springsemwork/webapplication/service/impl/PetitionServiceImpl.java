package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.Petition;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.User;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.PetitionForm;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos.PetitionRepo;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos.UserRepo;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service.interfaces.PetitionService;

import java.time.LocalDate;

@Component
public class PetitionServiceImpl implements PetitionService {
    @Autowired
    private PetitionRepo petitionRepo;

    @Autowired
    private UserRepo userRepo;

    @Override
    public void newPetition(PetitionForm form, LocalDate date) {
        Petition petition = Petition.builder()
                .title(form.getTitle())
                .date(date)
                .build();
        petitionRepo.save(petition);
    }

    @Override
    public void addUserIntoPetition(Long petitionId, User user) {
        Petition petition = petitionRepo.findById(petitionId).orElseThrow(IllegalArgumentException::new);
        User currentUser = userRepo.findById(user.getId()).orElseThrow(IllegalArgumentException::new);

        petition.getWriters().add(currentUser);
        petitionRepo.save(petition);
    }
}
