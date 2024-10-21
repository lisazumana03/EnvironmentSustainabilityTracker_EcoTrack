package za.ac.cput.environmentsustainabilitytracker_fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.environmentsustainabilitytracker_fullstack.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
