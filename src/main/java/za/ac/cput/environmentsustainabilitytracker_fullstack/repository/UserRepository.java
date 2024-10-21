package za.ac.cput.environmentsustainabilitytracker_fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.ac.cput.environmentsustainabilitytracker_fullstack.model.User;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
