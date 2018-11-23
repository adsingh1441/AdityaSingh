package com.niit.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.UserDao;
import com.niit.model.User;



public class UserDAOTestCase {
	static UserDao userDao;

	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit");
		context.refresh();
		
		userDao=( UserDao)context.getBean("userDao");
	}
	
	@Ignore
	@Test
	public void addUserTest()
	{
		User user=new User();
		user.setUserEmailId("WindowCurtain");
		user.setUserName("WindowCurtain");
		user.setUserContact("WindowCurtain");
		user.setUserAddress("WindowCurtain");
		user.setUserPassword("WindowCurtain");
	
		
		
		assertTrue("Problem in Adding the Product",userDao.add(user));
	}
}
