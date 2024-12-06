package com.example.vms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vms.models.Security;

@Repository
public interface SecurityRepository extends JpaRepository<Security, Long> {
    // Ajoutez des méthodes personnalisées si nécessaire
}