package com.example.vms.services;

import com.example.vms.models.Host;
import com.example.vms.repositories.HostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;



@Service
public class HostService {

    @Autowired
    private HostRepository hostRepository;

    // Get All Hosts
    public List<Host> findAll() {
        return hostRepository.findAll();
    }
    
  //Save Host
  		public void save( Host host) {
  			hostRepository.save(host);
  		}
  		
  	//Get Host By Id
  		public Optional<Host> findById(Long id) {
  			return hostRepository.findById(id);
  		}	
  		
  		
  		public void delete(Long id) {
  	        hostRepository.deleteById(id);
  	    }
  		
  		public Host getById(Long id) {
  	        return hostRepository.findById(id).orElse(null);
  	    }

  	    public void update(Host host) {
  	    	hostRepository.save(host);
  	    }

}


