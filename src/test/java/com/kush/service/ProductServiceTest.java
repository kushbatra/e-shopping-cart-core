package com.kush.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kush.beans.Category;
import com.kush.beans.ProductType;
import com.kush.dao.ProductDAOImpl;


/**
 * Junit for Product Service Implementation
 * @author kush
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/testApplicationContext.xml"})
public class ProductServiceTest {

	@InjectMocks
	private ProductServiceImpl productServiceImpl;
	
	@Mock
	private ProductDAOImpl productDAOImpl;
	
	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);
		List<Category> categories = new ArrayList<Category>();
		List<ProductType> productTypes = new ArrayList<ProductType>();
		
		Category category = new Category(1, "living area", productTypes);
		categories.add(category);
		
		category = new Category(2, "bedroom", productTypes);
		categories.add(category);
		
		Mockito.when(productDAOImpl.getCategoryType()).thenReturn(categories);
	}
	
	/**
	 * Test Class for Category Type Service Implementation
	 * @throws Exception 
	 */
	@Test
	public void getCategoryTypeTest() throws Exception {
		List<Category> categories = productServiceImpl.getCategoryType();
		Assert.assertNotNull(categories);
	}
}
