package za.ac.cput.environmentsustainabilitytracker_fullstack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.ac.cput.environmentsustainabilitytracker_fullstack.model.Review;
import za.ac.cput.environmentsustainabilitytracker_fullstack.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public void createReview(Review rev) {
        reviewRepository.save(rev);
    }

    @Override
    public Review getReviewById(Long reviewId) {
        Optional <Review> opt = reviewRepository.findById(reviewId);
        Review rev = null;
        if(opt.isPresent()) {
            rev = opt.get();
        }
            else {
                throw new RuntimeException("Sorry, unable to find review's id: " + reviewId);
            }
        return rev;
    }

    @Override
    public List<Review> findAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public void deleteReviewById(Long reviewId) {
        reviewRepository.deleteById(reviewId);
    }
}
