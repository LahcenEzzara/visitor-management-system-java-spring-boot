package com.example.vms.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vms.models.Event;
import com.example.vms.repositories.EventRepository;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    // Get All Events
    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    // Save Event
    public void save(Event event) {
        eventRepository.save(event);
    }

    // Get Event By Id
    public Optional<Event> findById(Long id) {
        return eventRepository.findById(id);
    }

    public void delete(Long id) {
        eventRepository.deleteById(id);
    }

    public Event getById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    public void update(Event event) {
        eventRepository.save(event);
    }
}
