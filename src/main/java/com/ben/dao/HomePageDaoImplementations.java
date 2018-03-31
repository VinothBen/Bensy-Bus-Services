package com.ben.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ben.vo.HomePageJsonFomat;

@Repository
public class HomePageDaoImplementations implements HomePageDaoInterface {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HomePageJsonFomat homePageJsonFormat;
	
	@Autowired(required = true)
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	public HomePageJsonFomat getHomePageDetails() {
		Session curentSession = sessionFactory.openSession();
		try {
//			listDetails = curentSession.createQuery("from HomePageEntity").list();
			List<String> useroptions = curentSession.createQuery("select useroptions from HomePageEntity").list();
			homePageJsonFormat.setUseroptions(useroptions);
			List<String> locations = curentSession.createQuery("select locations from HomePageEntity").list();
			homePageJsonFormat.setLocations(locations);
			List<String> navigations = curentSession.createQuery("select navigations from HomePageEntity").list();
			homePageJsonFormat.setnavigations(navigations);
			System.out.println("...db fetch for Home Page Details success!");
		} catch (Exception e) {
			System.out.println("...Error while fetching Data!");
		}finally {
			curentSession.close();
		}
		return homePageJsonFormat;
	}
}
