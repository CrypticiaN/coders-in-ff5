package org.factoriaf5.codersinff5.controllers;

import org.factoriaf5.codersinff5.repository.Coder;
import org.factoriaf5.codersinff5.repository.CoderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CodersController {

    private CoderRepository coderRepository;

    @Autowired
    public CodersController(CoderRepository coderRepository) {
        this.coderRepository = coderRepository;
    }

    @GetMapping("/")
    String listCoders(Model model) {
        List<Coder> coders = (List<Coder>) coderRepository.findAll();
        model.addAttribute("nombre", "Coder list");
        model.addAttribute("coders", coders);
        return "home";
    }

}
