package za.ac.cput.environmentsustainabilitytracker_fullstack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/eco-track")
public class WaterLogController {
    @GetMapping("/water")
    public String showWaterLog(Model model) {
        model.addAttribute("H20", "water");
        return "WaterLogWEB";
    }
}
