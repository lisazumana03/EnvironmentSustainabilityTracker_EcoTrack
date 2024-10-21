package za.ac.cput.environmentsustainabilitytracker_fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.ac.cput.environmentsustainabilitytracker_fullstack.model.Review;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

}
