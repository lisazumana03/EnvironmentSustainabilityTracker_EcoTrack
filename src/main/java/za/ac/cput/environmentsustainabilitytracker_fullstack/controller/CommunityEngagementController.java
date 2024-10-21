package za.ac.cput.environmentsustainabilitytracker_fullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import za.ac.cput.environmentsustainabilitytracker_fullstack.model.Event;
import za.ac.cput.environmentsustainabilitytracker_fullstack.service.EventService;

@Controller
@RequestMapping("/eco-track")
public class CommunityEngagementController {

    @Autowired
    private EventService eventService;

    @GetMapping("/communityPage")
    public String communityEngagement(Model model) {
        model.addAttribute("comment", new Event());
        return "CommunityEngagementWEB";
    }

    @PostMapping("/communitySubmit")
    public String saveEvent(@ModelAttribute
                                  Event event,
                             Model model) {
        eventService.saveEvent(event);
        model.addAttribute("event", event);
        return "redirect:/eco-track/communityList";

    }

    @GetMapping("/communityList")
    public String viewCommentList(Model model){
        model.addAttribute("communityList", eventService.getAllEvents());
        return "EventList";
    }

    @GetMapping("/communityList/edit/{eventId}")
    public String editComment(@PathVariable("eventId") Long eventId, Model model) {
        Event event = eventService.getEventById(eventId);
        model.addAttribute("event", event);
        return "CommunityEngagementWEB";
    }

    @GetMapping("/communityList/delete/{eventId}")
    public String deleteReview(@PathVariable("eventId")Long eventId) {
        eventService.deleteEventById(eventId);
        return "redirect:/eco-track/communityList";
    }

}
