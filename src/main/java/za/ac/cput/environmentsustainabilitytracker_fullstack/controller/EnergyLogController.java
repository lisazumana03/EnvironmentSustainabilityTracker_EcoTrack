package za.ac.cput.environmentsustainabilitytracker_fullstack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/eco-track")
public class EnergyLogController {

    @GetMapping("/energy")
    public String showEnergyLog(Model model){
        model.addAttribute("energyType", "enery");
        return "EnergyLogWEB";
    }

}
