package com.ben.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import com.ben.services.HomePageServiceImplementations;
import com.ben.vo.HomePageJsonFomat;

@RestController
@EnableWebMvc
public class HomePageController {
	
	@Autowired
	private HomePageServiceImplementations homePageService;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HomePageJsonFomat> responseCheck() {
		
		try {
			HomePageJsonFomat homePageDetails = homePageService.getHomePageDetails();
			return new ResponseEntity<HomePageJsonFomat>(homePageDetails, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<HomePageJsonFomat>(HttpStatus.EXPECTATION_FAILED);
		}
	}
}
