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
import com.example.vms.models.Badge;
import com.example.vms.services.VisitorService;
import com.example.vms.services.BadgeService;
import com.example.vms.services.EventService;

@Controller
public class BadgeController {
	@Autowired 
	private BadgeService badgeService;
	@Autowired
	private VisitorService visitorService;
	@Autowired
	private EventService eventService;
	
	public  Model addModelAttribute(Model model){
		model.addAttribute("badges", badgeService.findAll());
		model.addAttribute("visitors", visitorService.findAll());
		model.addAttribute("events", eventService.findAll());
		return model;
	}
	
	@GetMapping("/badge/badges")
	public String getAll(Model model) {
		
		List<Badge> badgeList = badgeService.findAll();

		
		model.addAttribute("badges",badgeList);
		
		return "badge/badges";
	}
	 @GetMapping("/badge/badgeAdd")
	    public String addBadge(Model model){
		 addModelAttribute(model);
	        return "badge/badgeAdd";
	    }
	 
	 @GetMapping("/badge/badgeEdit/{id}")
	    public String editBadge(@PathVariable Long id, Model model){
		    Badge badge = badgeService.getById(id);
		    model.addAttribute("badge", badge);
		    addModelAttribute(model);
	        return "badge/badgeEdit";
	    }
	 
	 
	 
	@PostMapping(value="badge/badges")
	public String save(Badge badge) {
		badgeService.save(badge);
		return "redirect:/badge/badges";
		}	
	
	
	@RequestMapping(value = "/badge/badges/delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public  String delete(@PathVariable Long id){
		badgeService.delete(id);
        return "redirect:/badge/badges";
    }
	
	@RequestMapping(value = "/badge/badges/update/{id}", method = {RequestMethod.GET, RequestMethod.PUT})
    public  String update(Badge badge){
		badgeService.save(badge);
        return "redirect:/badge/badges";
    }

}
