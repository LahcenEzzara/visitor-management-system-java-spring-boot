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

import com.example.vms.models.Host;
import com.example.vms.services.HostService;

@Controller
public class HostController {

    @Autowired
    private HostService hostService;

    @GetMapping("/host/hosts")
    public String getAll(Model model) {
        List<Host> hostList = hostService.findAll();
        model.addAttribute("hosts", hostList);
        return "host/hosts";
    }

    @GetMapping("/host/hostAdd")
    public String addHost(Model model) {
        model.addAttribute("hosts", hostService.findAll());
        return "host/hostAdd";
    }

    @GetMapping("/host/hostEdit/{id}")
    public String editHost(@PathVariable Long id, Model model) {
        Host host = hostService.getById(id);
        model.addAttribute("hosts", hostService.findAll());
        model.addAttribute("host", host);
        return "host/hostEdit";
    }

    @PostMapping(value = "host/hosts")
    public String save(Host host) {
        hostService.save(host);
        return "redirect:/host/hosts";
    }

    @RequestMapping(value = "/host/hosts/delete/{id}", method = { RequestMethod.GET, RequestMethod.DELETE })
    public String delete(@PathVariable Long id) {
        hostService.delete(id);
        return "redirect:/host/hosts";
    }

    @RequestMapping(value = "/host/hosts/update/{id}", method = { RequestMethod.POST, RequestMethod.PUT })
    public String update(@PathVariable Long id, Host host) {
    	host.setId(id);
        hostService.save(host);
        return "redirect:/host/hosts";
    }
}
