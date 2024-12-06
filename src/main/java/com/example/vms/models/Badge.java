package com.example.vms.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Badge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String visitorName;
    private String barcodeOrQrCode;


    @OneToOne(mappedBy = "badge")
    private Security security;
    
    @ManyToOne
    @JoinColumn(name="visitorid", insertable=false, updatable=false)
    private Visitor visitor;
    private Long visitorid;
    
    @ManyToOne
    @JoinColumn(name="eventid", insertable=false, updatable=false)
    private Event event;
    private Long eventid;
    
    @Column(nullable = true, length = 64)
    private String eventLogo;
    
    @Column(nullable = true, length = 64)
    private String visitorPhoto;
    
    // Getters et setters

    // Constructors
    public Badge() {}

    public Badge(String visitorName,String eventLogo, String visitorPhoto, String barcodeOrQrCode) {
        this.visitorName = visitorName;
        this.eventLogo = eventLogo;
        this.visitorPhoto = visitorPhoto;
        this.barcodeOrQrCode = barcodeOrQrCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getEventLogo() {
        return eventLogo;
    }

    public void setEventLogo(String  eventLogo) {
        this.eventLogo = eventLogo;
    }

    public String  getVisitorPhoto() {
        return visitorPhoto;
    }

    public void setVisitorPhoto(String visitorPhoto) {
        this.visitorPhoto = visitorPhoto;
    }

    public String getBarcodeOrQrCode() {
        return barcodeOrQrCode;
    }

    public void setBarcodeOrQrCode(String barcodeOrQrCode) {
        this.barcodeOrQrCode = barcodeOrQrCode;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }
    
    public Long getVisitorid() {
		return visitorid;
	}

	public void setVisitorid(Long visitorid) {
		this.visitorid = visitorid;
	}
	
	public Long getEventid() {
		return eventid;
	}

	public void setEventid(Long eventid) {
		this.eventid = eventid;
	}
}
