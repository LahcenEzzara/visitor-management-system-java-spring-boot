package com.example.vms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.vms.models.Event;
import com.example.vms.services.EventService;

@Controller
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/event/events")
    public String getAll(Model model) {
        List<Event> eventList = eventService.findAll();
        model.addAttribute("events", eventList);
        return "event/events";
    }

    @GetMapping("/event/eventAdd")
    public String addEvent(Model model) {
        model.addAttribute("events", eventService.findAll());
        return "event/eventAdd";
    }

    @GetMapping("/event/eventEdit/{id}")
    public String editEvent(@PathVariable Long id, Model model) {
        Event event = eventService.getById(id);
        model.addAttribute("event", event);
        return "event/eventEdit";
    }

    @PostMapping(value = "event/events")
    public String save(Event event) {
        eventService.save(event);
        return "redirect:/event/events";
    }

    @RequestMapping(value = "/event/events/delete/{id}", method = { RequestMethod.GET, RequestMethod.DELETE })
    public String delete(@PathVariable Long id) {
        eventService.delete(id);
        return "redirect:/event/events";
    }

    @RequestMapping(value = "/event/events/update/{id}", method = { RequestMethod.POST, RequestMethod.PUT })
    public String update(@PathVariable Long id,Event event) {
    	event.setId(id);
        eventService.save(event);
        return "redirect:/event/events";
    }
}
