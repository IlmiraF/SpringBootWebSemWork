package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos.PetitionRepo;

@Controller
public class PetitionController {
    @Autowired
    private PetitionRepo petitionRepo;

    @GetMapping("/petition")
    public String getPetitionPage(Model model) {
        model.addAttribute("petitions", petitionRepo.findAll());
        return "petitions";
    }
}
