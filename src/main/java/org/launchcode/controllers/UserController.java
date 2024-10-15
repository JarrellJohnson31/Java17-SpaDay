package org.launchcode.controllers;

import org.launchcode.data.UserData;
import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.launchcode.data.UserData.user;

@Controller
@RequestMapping("user")

public class UserController{

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Users");
        model.addAttribute("users", UserData.getAll());
        return “user/index";
    }

    @GetMapping String displayAddUserForm(Model model) {

        model.addAttribute("title", "Create User");
        return “user/add";
    }

    @GetMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        UserData.add(newUser);
        return "redirect:";
    }
}
