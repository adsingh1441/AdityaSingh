package com.niit.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.SupplierDao;
import com.niit.model.Supplier;



public class SupplierDAOTestCase {

	static SupplierDao supplierDao;

	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit");
		context.refresh();
		
		supplierDao=(SupplierDao)context.getBean("supplierDao");
	}
	
	@Ignore
	@Test
	public void addProductTest()
	{
		Supplier supplier=new Supplier();
		supplier.setSubpplierName("WindowCurtain");
		supplier.setSubpplierAddress("WindowCurtain");
		supplier.setSubpplierContact("WindowCurtain");
		supplier.setSubpplierGmail("WindowCurtain");
	
		
		
		assertTrue("Problem in Adding the Product",supplierDao.add(supplier));
	}
	

}
