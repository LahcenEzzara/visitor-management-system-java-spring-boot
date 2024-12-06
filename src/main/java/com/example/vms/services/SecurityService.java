package com.example.vms.services;

import com.example.vms.models.Security;
import com.example.vms.repositories.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecurityService {

    @Autowired
    private SecurityRepository securityRepository;

    // Get All Securities
    public List<Security> findAll() {
        return securityRepository.findAll();
    }
}
