package com.ben.vo;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class HomePageJsonFomat {

	private List<String> navigations;
	private List<String> locations;
	private List<String> useroptions;
	private String headerLabel = "Summa!";
	

	public HomePageJsonFomat(List<String> navigations, List<String> locations, List<String> useroptions,
			String headerLabel) {
		super();
		this.navigations = navigations;
		this.locations = locations;
		this.useroptions = useroptions;
		this.headerLabel = headerLabel;
	}
	public String getHeaderLabel() {
		return headerLabel;
	}
	public void setHeaderLabel(String headerLabel) {
		this.headerLabel = headerLabel;
	}
	public List<String> getnavigations() {
		return navigations;
	}
	public void setnavigations(List<String> navigations) {
		this.navigations = navigations;
	}
	public List<String> getLocations() {
		return locations;
	}
	public void setLocations(List<String> locations) {
		this.locations = locations;
	}
	public List<String> getUseroptions() {
		return useroptions;
	}
	public void setUseroptions(List<String> useroptions) {
		this.useroptions = useroptions;
	}
	public HomePageJsonFomat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return null;
	}
}
