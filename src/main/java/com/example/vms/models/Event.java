package com.example.vms.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventName;
    private String location;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String eventProgram;
    private String venueInformation;
    
    @OneToMany(mappedBy = "event")
    private List<Visitor> visitors;

    // Constructors
    public Event() {}

    public Event(String eventName, String location, LocalDateTime startTime,
                 LocalDateTime endTime, String eventProgram, String venueInformation) {
        this.eventName = eventName;
        this.location = location;
        this.startTime = startTime;
        this.endTime = endTime;
        this.eventProgram = eventProgram;
        this.venueInformation = venueInformation;
    }

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public String getEventProgram() {
		return eventProgram;
	}

	public void setEventProgram(String eventProgram) {
		this.eventProgram = eventProgram;
	}

	public String getVenueInformation() {
		return venueInformation;
	}

	public void setVenueInformation(String venueInformation) {
		this.venueInformation = venueInformation;
	}

    
}
