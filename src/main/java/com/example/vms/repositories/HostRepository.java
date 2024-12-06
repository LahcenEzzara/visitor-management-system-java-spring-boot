package com.example.vms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.example.vms.models.Host;
@Repository
public interface HostRepository extends JpaRepository<Host, Long> {

}
