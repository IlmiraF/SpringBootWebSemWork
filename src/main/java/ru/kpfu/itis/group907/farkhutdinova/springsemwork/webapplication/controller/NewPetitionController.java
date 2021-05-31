package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.details.UserDetailsImpl;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.dto.PetitionForm;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service.interfaces.PetitionService;

import java.time.LocalDate;

@Controller
public class NewPetitionController {
    @Autowired
    private PetitionService petitionService;

    @GetMapping("/newPetition")
    public String getNewPetitionPage() {
        return "newPetition";
    }

    @PostMapping("/newPetition")
    public String postNewPetitionPage(PetitionForm form, @AuthenticationPrincipal UserDetailsImpl user) {
        LocalDate localDate = LocalDate.now();
        petitionService.newPetition(form, localDate);
        return "redirect:/petition";
    }
}
