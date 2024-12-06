package com.example.vms.services;
import java.util.List;
import java.util.Optional;

import com.example.vms.models.Badge;
import com.example.vms.repositories.BadgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BadgeService {

    @Autowired
    private BadgeRepository badgeRepository;

    // Get All Badges
    public List<Badge> findAll() {
        return badgeRepository.findAll();
    }
    
    //Save Badge
  		public void save(Badge badge) {
  			badgeRepository.save(badge);
  		}
  		
  	//Get Visitor By Id
  		public Optional<Badge> findById(Long id) {
  			return badgeRepository.findById(id);
  		}	
  		
  		
  		public void delete(Long id) {
  			badgeRepository.deleteById(id);
  	    }
  		
  		public Badge getById(Long id) {
  	        return badgeRepository.findById(id).orElse(null);
  	    }

  	    public void update(Badge badge) {
  	    	badgeRepository.save(badge);
  	    }

}





