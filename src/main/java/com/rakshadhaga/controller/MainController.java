package com.rakshadhaga.controller;

import com.rakshadhaga.model.RakhiMessage;
import com.rakshadhaga.repository.RakhiMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @Autowired
    private RakhiMessageRepository repository;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("rakhiMessage", new RakhiMessage());
        return "index";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute RakhiMessage rakhiMessage, Model model) {
        repository.save(rakhiMessage);
        model.addAttribute("brotherName", rakhiMessage.getBrotherName());
        model.addAttribute("sisterName", rakhiMessage.getSisterName());

        return "rakhi";
    }
}
