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
@Table(name = "NPATE_RSVP_LIST")
public class GuestRsvpModel {

	private long id;
	private String lastName;
	private String fistName;
	private String fullName;
	private String address_line_one;
	private String address_line_two;
	private String city;
	private String zipcode;
	private String state;
	private String full_address;
	private String phoneNumber;
	private String email;
	private boolean isRsvpConfirmed;
	private String rsvpType;
	private Integer guestCount;
	private String RSVP_REGISTERATION_CODE;
	private String RSVP_CONFIRMED_DATE;
	private String RSVP_CREATE_DATE;
	private String RSVP_CREATE_BY;
	private String RSVP_UPDATE_DATE;
	private String RSVP_UPDATE_BY;

	
	public GuestRsvpModel() {
		
	}
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "NRL_LASTNAME", nullable = false)
	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "NRL_FIRSTNAME", nullable = false)
	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	@Column(name = "NRL_FULLNAME", nullable = false)
	public String getFullName() {
		return fullName;
	}

	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name = "NRL_ADDRESS_LINE_ONE", nullable = true)
	public String getAddress_line_one() {
		return address_line_one;
	}


	public void setAddress_line_one(String address_line_one) {
		this.address_line_one = address_line_one;
	}

	@Column(name = "NRL_ADDRESS_LINE_TWO", nullable = true)
	public String getAddress_line_two() {
		return address_line_two;
	}


	public void setAddress_line_two(String address_line_two) {
		this.address_line_two = address_line_two;
	}

	@Column(name = "NRL_CITY", nullable = true)
	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "NRL_ZIPCODE", nullable = true)
	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name = "NRL_STATE", nullable = true)
	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "NRL_FULL_ADDRESS", nullable = true)
	public String getFull_address() {
		return full_address;
	}


	public void setFull_address(String full_address) {
		this.full_address = full_address;
	}

	@Column(name = "NRL_PHONENUMBER", nullable = false)
	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "NRL_EMAIL", nullable = false)
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "NRL_RSVP_CONFIRMED", nullable = false)
	public boolean isRsvpConfirmed() {
		return isRsvpConfirmed;
	}


	public void setRsvpConfirmed(boolean isRsvpConfirmed) {
		this.isRsvpConfirmed = isRsvpConfirmed;
	}


	@Column(name = "NRL_RSVP_TYPE", nullable = true)
	public String getRsvpType() {
		return rsvpType;
	}


	public void setRsvpType(String rsvpType) {
		this.rsvpType = rsvpType;
	}

	@Column(name = "NRL_RSVP_GUEST_COUNT", nullable = true)
	public Integer getGuestCount() {
		return guestCount;
	}


	public void setGuestCount(Integer guestCount) {
		this.guestCount = guestCount;
	}

	@Column(name = "NRL_RSVP_REGISTERATION_CODE", nullable = true)
	public String getRSVP_REGISTERATION_CODE() {
		return RSVP_REGISTERATION_CODE;
	}


	public void setRSVP_REGISTERATION_CODE(String rSVP_REGISTERATION_CODE) {
		RSVP_REGISTERATION_CODE = rSVP_REGISTERATION_CODE;
		//RSVP_REGISTERATION_CODE = "rSVP_REGISTERATION_CODE";
	}

	@Column(name = "NRL_RSVP_CONFIRMED_DATE", nullable = true)
	public String getRSVP_CONFIRMED_DATE() {
		return RSVP_CONFIRMED_DATE;
	}


	public void setRSVP_CONFIRMED_DATE(String rSVP_CONFIRMED_DATE) {
		RSVP_CONFIRMED_DATE = rSVP_CONFIRMED_DATE;
	}

	@CreationTimestamp
	@Column(name = "NRL_RSVP_CREATE_DATE", nullable = true)
	public String getRSVP_CREATE_DATE() {
		return RSVP_CREATE_DATE;
	}


	public void setRSVP_CREATE_DATE(String rSVP_CREATE_DATE) {
		RSVP_CREATE_DATE = rSVP_CREATE_DATE;
	}

	@Column(name = "NRL_RSVP_CREATE_BY", nullable = true)
	public String getRSVP_CREATE_BY() {
		return RSVP_CREATE_BY;
	}


	public void setRSVP_CREATE_BY(String rSVP_CREATE_BY) {
		RSVP_CREATE_BY = rSVP_CREATE_BY;
	}

	@UpdateTimestamp
	@Column(name = "NRL_RSVP_UPDATE_DATE", nullable = true)
	public String getRSVP_UPDATE_DATE() {
		return RSVP_UPDATE_DATE;
	}


	public void setRSVP_UPDATE_DATE(String rSVP_UPDATE_DATE) {
		RSVP_UPDATE_DATE = rSVP_UPDATE_DATE;
	}

	@Column(name = "NRL_RSVP_UPDATE_BY", nullable = true)
	public String getRSVP_UPDATE_BY() {
		return RSVP_UPDATE_BY;
	}


	public void setRSVP_UPDATE_BY(String rSVP_UPDATE_BY) {
		RSVP_UPDATE_BY = rSVP_UPDATE_BY;
	}
}