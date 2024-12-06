package com.example.vms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Visitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String reasonForVisit;
    private LocalDateTime arrivalDateTime;
    private LocalDateTime departureDateTime;
    
    

    @ManyToOne
    @JoinColumn(name="hostid", insertable=false, updatable=false)
    private Host host;
    private Long hostid;
    
    @ManyToOne
    @JoinColumn(name="eventid", insertable=false, updatable=false)
    private Event event;
    private Long eventid;
    
    // Constructors
    public Visitor() {}

    public Visitor(String firstName, String lastName, String phoneNumber, String email,
                   String reasonForVisit, LocalDateTime arrivalDateTime, LocalDateTime departureDateTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.reasonForVisit = reasonForVisit;
        this.arrivalDateTime = arrivalDateTime;
        this.departureDateTime = departureDateTime;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReasonForVisit() {
		return reasonForVisit;
	}

	public void setReasonForVisit(String reasonForVisit) {
		this.reasonForVisit = reasonForVisit;
	}

	public LocalDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public LocalDateTime getDepartureDateTime() {
		return departureDateTime;
	}

	public void setDepartureDateTime(LocalDateTime departureDateTime) {
		this.departureDateTime = departureDateTime;
	}

	public Host getHost() {
		return host;
	}

	public void setHost(Host host) {
		this.host = host;
	}
	
	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Long getHostid() {
		return hostid;
	}

	public void setHostid(Long hostid) {
		this.hostid = hostid;
	}
	
	public Long getEventid() {
		return eventid;
	}

	public void setEventid(Long eventid) {
		this.eventid = eventid;
	}

	

   

}
