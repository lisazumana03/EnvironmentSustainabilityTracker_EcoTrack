package za.ac.cput.environmentsustainabilitytracker_fullstack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/eco-track")
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "HomePageWEB";
    }
}
