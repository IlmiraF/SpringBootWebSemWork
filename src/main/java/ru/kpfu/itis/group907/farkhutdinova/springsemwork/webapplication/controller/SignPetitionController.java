package ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.details.UserDetailsImpl;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.Petition;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.domain.User;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.repos.PetitionRepo;
import ru.kpfu.itis.group907.farkhutdinova.springsemwork.webapplication.service.impl.PetitionServiceImpl;

@Controller
public class SignPetitionController {
    @Autowired
    private PetitionRepo petitionRepo;

    @Autowired
    private PetitionServiceImpl petitionService;

    @GetMapping("/petition/{petition_id}")
    public String getPetition(@PathVariable("petition_id") Long id, @AuthenticationPrincipal UserDetailsImpl user, Model model) {
        Petition petition = petitionRepo.findById(id).get();
        model.addAttribute("petition", petition);
        int count = petition.getWriters().size();
        String size = "" + count;
        boolean isExist = false;
        for(User list : petition.getWriters()) {
            if(list.getUsername().equals(user.getUsername())) {
                isExist = true;
            }
        }
        model.addAttribute("isExist", "" + isExist);
        model.addAttribute("count", size);
        return "petitionPage";
    }

    @GetMapping("/petition/{petition_id}/subscribe")
    public String postPetition(@PathVariable("petition_id") Long id, @AuthenticationPrincipal UserDetailsImpl user) {
        petitionService.addUserIntoPetition(id, user.getUser());
        return "redirect:/petition/" + id;
    }
}
