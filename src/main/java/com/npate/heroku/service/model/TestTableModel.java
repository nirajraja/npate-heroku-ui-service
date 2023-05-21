package com.npate.heroku.service.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "employees")
public class TestTableModel {

	private long id;
	private String tt_name;
	private Integer tt_guest_count;
	
	public TestTableModel() {
		
	}
	
	public TestTableModel(String tt_name, Integer tt_guest_count) {
		this.tt_name = tt_name;
		this.tt_guest_count = tt_guest_count;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	@Column(name = "TT_NAME", nullable = false)
	public String getTt_name() {
		return tt_name;
	}

	public void setTt_name(String tt_name) {
		this.tt_name = tt_name;
	}

	@Column(name = "TT_GUEST_COUNT", nullable = false)
	public Integer getTt_guest_count() {
		return tt_guest_count;
	}

	public void setTt_guest_count(Integer tt_guest_count) {
		this.tt_guest_count = tt_guest_count;
	}
}