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


import com.example.vms.models.Visitor;
import com.example.vms.services.EventService;
import com.example.vms.services.HostService;
import com.example.vms.services.VisitorService;

@Controller
public class VisitorController {
	@Autowired 
	private VisitorService visitorService;
	@Autowired
	private HostService hostService;
	@Autowired
	private EventService eventService;
	
	public  Model addModelAttribute(Model model){
		model.addAttribute("visitors", visitorService.findAll());
		model.addAttribute("hosts", hostService.findAll());
		model.addAttribute("events", eventService.findAll());
		return model;
	}
	
	@GetMapping("/visitor/visitors")
	public String getAll(Model model) {
		
		List<Visitor> visitorList = visitorService.findAll();

		
		model.addAttribute("visitors",visitorList);
		
		return "visitor/visitors";
	}
	 @GetMapping("/visitor/visitorAdd")
	    public String addVisitor(Model model){
		 addModelAttribute(model);
	        return "visitor/visitorAdd";
	    }
	 
	 @GetMapping("/visitor/visitorEdit/{id}")
	    public String editVisitor(@PathVariable Long id, Model model){
		    Visitor visitor = visitorService.getById(id);
		    addModelAttribute(model);
		    model.addAttribute("visitor", visitor);
	        return "visitor/visitorEdit";
	    }
	 
	@PostMapping(value="visitor/visitors")
	public String save(Visitor visitor) {
		visitorService.save(visitor);
		return "redirect:/visitor/visitors";
		}	
	
	
	@RequestMapping(value = "/visitor/visitors/delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public  String delete(@PathVariable Long id){
		visitorService.delete(id);
        return "redirect:/visitor/visitors";
    }
	
	@RequestMapping(value = "/visitor/visitors/update/{id}", method = {RequestMethod.GET, RequestMethod.PUT})
    public  String update(Visitor visitor){
		visitorService.save(visitor);
        return "redirect:/visitor/visitors";
    }

}
