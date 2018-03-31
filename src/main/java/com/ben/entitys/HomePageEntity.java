package com.ben.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "home_page")
public class HomePageEntity {
	
	@Id
	@Column(name = "idhome_page")
	private Long id;
	@Column(name = "navigations")
	private String navigations;
	@Column(name = "locations")
	private String locations;
	@Column(name = "useroptions")
	private String useroptions;
	
	public HomePageEntity(Long id, String navigations, String locations, String useroptions) {
		super();
		this.id = id;
		this.navigations = navigations;
		this.locations = locations;
		this.useroptions = useroptions;
	}
	
	public HomePageEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getnavigations() {
		return navigations;
	}
	public void setnavigations(String navigations) {
		this.navigations = navigations;
	}
	public String getLocations() {
		return locations;
	}
	public void setLocations(String locations) {
		this.locations = locations;
	}
	public String getUseroptions() {
		return useroptions;
	}
	public void setUseroptions(String useroptions) {
		this.useroptions = useroptions;
	}
}
