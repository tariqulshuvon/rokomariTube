package com.rokomari.rokomariTube.controller;


import com.rokomari.rokomariTube.form.UserRegistrationForm;
import com.rokomari.rokomariTube.model.User;
import com.rokomari.rokomariTube.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admins")
public class AdminController {

    @Autowired
    UserService userService;

    @GetMapping
    public String showAdminPanel(){
        return "adminDashBoard";
    }


    @GetMapping("/list")
    public String showAdmins(Authentication authentication, Model model) {

        List<User> admins = userService.findAll();

        model.addAttribute("admins",admins);

        return "admins/list";
    }

    @GetMapping("/new")
    public String showCreate(Model model) {
        model.addAttribute("admins", UserRegistrationForm.builder().build());
        return "admins/form";
    }


    @GetMapping("/edit/{id}")
    public String editBookForm(Model model, @PathVariable(name = "id") long id) {
        userService.findById(id).ifPresent(form-> {
            UserRegistrationForm userRegistrationForm = UserRegistrationForm.builder()
                    .id(form.getId())
                    .username(form.getUsername())
                    .build();
            model.addAttribute("admins",userRegistrationForm);
        });
        return "admins/form";
    }

    @RequestMapping("/delete/{id}")
    public String deleteBook(@PathVariable(name = "id") long id) {
        userService.delete(id);
        return "redirect:/admins";
    }


}
