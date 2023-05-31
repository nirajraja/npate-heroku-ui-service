package com.npate.heroku.service.model;



import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "NPATE_SHORT_RSVP_LIST")
public class GuestShortRsvpModel {

	private long id;
	private String lastName;
	private String firstName;
	private String phone;
	private Integer guestCount;
	private String locationContinent;
	private boolean includeRsvpInCountList;
	private String timezone;
	private String RSVP_CREATE_DATE;
	
	public GuestShortRsvpModel() {
		
	}
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "NSRL_LASTNAME", nullable = false)
	public String getLastName() {
		return lastName;
	}

	@Column(name = "NSRL_FIRSTNAME", nullable = false)
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "NSRL_RSVP_GUEST_COUNT", nullable = false)
	public Integer getGuestCount() {
		return guestCount;
	}

	@Column(name = "NSRL_PHONENUMBER", nullable = false)
	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "NSRL_LOC_CONTINENT", nullable = false)
	public String getLocationContinent() {
		return locationContinent;
	}


	public void setLocationContinent(String locationContinent) {
		this.locationContinent = locationContinent;
	}

	@Column(name = "NSRL_INCLUDE_IN_TOTAL_RSVP_COUNT", nullable = false)
	public boolean isIncludeRsvpInCountList() {
		return includeRsvpInCountList;
	}


	public void setIncludeRsvpInCountList(boolean includeRsvpInCountList) {
		this.includeRsvpInCountList = includeRsvpInCountList;
	}


	@Column(name = "NSRL_TIMEZONE", nullable = false)
	public String getTimezone() {
		return timezone;
	}


	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}


	public void setGuestCount(Integer guestCount) {
		this.guestCount = guestCount;
	}

	@CreationTimestamp
	@Column(name = "NSRL_RSVP_CREATE_DATE", nullable = false)
	public String getRSVP_CREATE_DATE() {
		return RSVP_CREATE_DATE;
	}


	public void setRSVP_CREATE_DATE(String rSVP_CREATE_DATE) {
		RSVP_CREATE_DATE = rSVP_CREATE_DATE;
	}

}