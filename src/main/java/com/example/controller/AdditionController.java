package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdditionController {

    @PostMapping("/add")
    public String addNumbers(
            @RequestParam int num1,
            @RequestParam int num2,
            Model model) {

        int result = num1 + num2;

        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("result", result);

        return "index";
    }
}
