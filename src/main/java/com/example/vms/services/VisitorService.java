package com.example.vms.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vms.models.Visitor;
import com.example.vms.repositories.VisitorRepository;

@Service
public class VisitorService {
	
	@Autowired
	private VisitorRepository visitorRepository;
	
	//Get All Visitors
		public List<Visitor> findAll(){
			return visitorRepository.findAll();
		}
		
	//Save Visitor
		public void save( Visitor visitor) {
			visitorRepository.save(visitor);
		}
		
	//Get Visitor By Id
		public Optional<Visitor> findById(Long id) {
			return visitorRepository.findById(id);
		}	
		
		
		public void delete(Long id) {
	        visitorRepository.deleteById(id);
	    }
		
		public Visitor getById(Long id) {
	        return visitorRepository.findById(id).orElse(null);
	    }

	    public void update(Visitor visitor) {
	    	visitorRepository.save(visitor);
	    }

}
