package za.ac.cput.environmentsustainabilitytracker_fullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import za.ac.cput.environmentsustainabilitytracker_fullstack.model.Review;
import za.ac.cput.environmentsustainabilitytracker_fullstack.model.User;
import za.ac.cput.environmentsustainabilitytracker_fullstack.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/eco-track")
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "LoginPageWEB";
    }

    @PostMapping("/loginSubmit")
    public String loginSubmit(String username,
                              String password,
                              Model model) {
        return "redirect:/eco-track/home";
    }


    @GetMapping("/register")
    public String registerPage(Model model) {
        model.addAttribute("user", new User());
        return "RegistrationPageWEB";
    }

    @PostMapping("/registerSubmit")
    public String registerSubmit(@ModelAttribute
                                 User user,
                                 Model model) {
        userService.createUser(user);
        model.addAttribute("user", user);
        return "redirect:/eco-track/login";
    }

    @GetMapping("/usersList")
    public String viewUserList(Model model){
        model.addAttribute("userList", userService.findAllUsers());
        return "UserListWEB";
    }

    @GetMapping("/usersList/edit/{userId}")
    public String editUser(@PathVariable("userId") Long userId, Model model) {
        User user = userService.getById(userId);
        model.addAttribute("user", user);
        return "RegistrationPageWEB";
    }

    @GetMapping("/usersList/delete/{userId}")
    public String deleteUser(@PathVariable("userId")Long userId) {
        userService.deleteUser(userId);
        return "redirect:/eco-track/usersList";
    }

}
