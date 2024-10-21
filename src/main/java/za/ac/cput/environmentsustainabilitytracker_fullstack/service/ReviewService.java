package za.ac.cput.environmentsustainabilitytracker_fullstack.service;

import za.ac.cput.environmentsustainabilitytracker_fullstack.model.Review;

import java.util.List;

public interface ReviewService {
    void createReview(Review rev);
    Review getReviewById(Long reviewId);
    List<Review> findAllReviews();
    void deleteReviewById(Long reviewId);
}
