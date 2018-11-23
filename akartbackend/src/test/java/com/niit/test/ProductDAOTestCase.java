package com.niit.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDao;
import com.niit.model.Product;



public class ProductDAOTestCase {

	static ProductDao productDao;

	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit");
		context.refresh();
		
		productDao=(ProductDao)context.getBean("productDao");
	}
	
	@Ignore
	@Test
	public void addProductTest()
	{
		Product product=new Product();
		product.setProductname("WindowCurtain");
		product.setPrice("WindowCurtain");
		product.setQuantity("WindowCurtain");
		product.setProductdetails("WindowCurtain");
	
		
		
		assertTrue("Problem in Adding the Product",productDao.add(product));
	}
	
	/*@Ignore
	@Test
	public void updateProductTest()
	{	
		Product product=productDao.getCategory(2);
		product.setProductDesc("Wash Basin and Front Glasses");	
		assertTrue("Problem in Updating the Product",productDao.update(product));
	}
	@Ignore
	@Test
	public void deleteProductTest()
	{
		Product productDao=productDao.getProduct(2);
		assertTrue("Problem in Updating the ProductC",productDao.delete(product));
	}
	
	@Test
	public void listProductesTest()
	{
		List<Product> listProductes=productDao.listProductes();
		
		assertTrue("Problem in Listing the Productes",listProductes.size()>0);
		
		for(Product productDao:listProducts)
		{
			System.out.print("ProductID:"+product.getProductId());
			System.out.print("Product Name:"+product.getProductName());
			System.out.println("Product Desc:"+product.getProductDesc());
		}
	}
*/

}
