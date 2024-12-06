package com.example.vms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vms.models.Visitor;
@Repository
public interface VisitorRepository extends JpaRepository<Visitor, Long> {

}
