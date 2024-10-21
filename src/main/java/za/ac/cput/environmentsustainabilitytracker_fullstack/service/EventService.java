package za.ac.cput.environmentsustainabilitytracker_fullstack.service;

import za.ac.cput.environmentsustainabilitytracker_fullstack.model.Event;

import java.util.List;

public interface EventService {
    List<Event> getAllEvents();
    void saveEvent(Event event);
    Event getEventById(long eventId);
    void deleteEventById(long eventId);
}
