package com.yaremchuk.springbootmvc.controller;

import com.yaremchuk.springbootmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;


@Controller
public class RegisterController {

    @GetMapping("/register")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);

        List<String> professionList = Arrays.asList("Developer", "Designer", "Architect");
        model.addAttribute("professionList", professionList);
        return "register-form";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute User user) {
        System.out.println(user);
        return "register-success";
    }

}
