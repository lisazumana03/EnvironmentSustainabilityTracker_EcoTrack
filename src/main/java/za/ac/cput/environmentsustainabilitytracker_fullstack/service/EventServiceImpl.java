package za.ac.cput.environmentsustainabilitytracker_fullstack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.environmentsustainabilitytracker_fullstack.model.Event;
import za.ac.cput.environmentsustainabilitytracker_fullstack.repository.EventRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public void saveEvent(Event event) {
        eventRepository.save(event);
    }

    @Override
    public Event getEventById(long eventId) {
        Optional<Event> opt = eventRepository.findById(eventId);
        Event event = null;
        if(opt.isPresent()){
            event = opt.get();
        } else {
            throw new RuntimeException("Event id not found!");
        }
        return event;
    }

    @Override
    public void deleteEventById(long eventId) {
        eventRepository.deleteById(eventId);
    }
}
