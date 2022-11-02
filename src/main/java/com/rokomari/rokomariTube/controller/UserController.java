package com.rokomari.rokomariTube.controller;


import com.rokomari.rokomariTube.model.User;
import com.rokomari.rokomariTube.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public String showUsers(Model model) {

        List<User> users = userService.findAll();
        model.addAttribute("users",users);

        return "users/list";
    }

}
