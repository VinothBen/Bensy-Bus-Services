package com.ben.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ben.dao.HomePageDaoImplementations;
import com.ben.vo.HomePageJsonFomat;
@Service
public class HomePageServiceImplementations implements HomePageServiceInterface {
	
	@Autowired
	private HomePageDaoImplementations homePageDao;
	@Autowired
	private HomePageJsonFomat homePageJsonFomat;

	public HomePageJsonFomat getHomePageDetails() {
		try {
			homePageJsonFomat = homePageDao.getHomePageDetails();			
		} catch (Exception e) {
			System.out.println("...Error while procesing service!");
		}
		return homePageJsonFomat;
	}

}
