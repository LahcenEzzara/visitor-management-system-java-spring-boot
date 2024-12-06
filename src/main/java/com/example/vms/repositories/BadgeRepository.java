package com.example.vms.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vms.models.Badge;

@Repository
public interface BadgeRepository extends JpaRepository<Badge, Long> {
    // Ajoutez des méthodes personnalisées si nécessaire
}
