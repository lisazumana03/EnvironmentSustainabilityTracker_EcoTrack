package za.ac.cput.environmentsustainabilitytracker_fullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.environmentsustainabilitytracker_fullstack.model.Review;
import za.ac.cput.environmentsustainabilitytracker_fullstack.service.ReviewService;

import java.util.List;

@Controller
@RequestMapping("/eco-track")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;



    @GetMapping("/reviewPage")
    public String showReviewPage(Model model) {
        model.addAttribute("review", new Review());
        return "ReviewWEB";
    }

    @PostMapping("/submit")
    public String saveReview(@ModelAttribute
                                 Review rev,
                                 Model model) {
        reviewService.createReview(rev);
        model.addAttribute("review", rev);
        return "redirect:/eco-track/reviewsList";

    }

    @GetMapping("/reviewsList")
    public String viewReviewList(Model model){
        model.addAttribute("reviewList", reviewService.findAllReviews());
        return "ReviewList";
    }

    @GetMapping("/reviewsList/edit/{reviewId}")
    public String editReview(@PathVariable("reviewId") Long reviewId, Model model) {
        Review rev = reviewService.getReviewById(reviewId);
        model.addAttribute("review", rev);
        return "ReviewWEB";
    }

    @GetMapping("/reviewsList/delete/{reviewId}")
    public String deleteReview(@PathVariable("reviewId")Long reviewId) {
        reviewService.deleteReviewById(reviewId);
        return "redirect:/eco-track/reviewsList";
    }
}
