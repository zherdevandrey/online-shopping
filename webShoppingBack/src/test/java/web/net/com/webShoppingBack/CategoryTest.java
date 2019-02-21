package web.net.com.webShoppingBack;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import web.back.com.config.HibernateConfig;
import web.back.com.dao.CategoryDAO;
import web.back.com.daoImpl.CategoryDAOImpl;
import web.back.com.dto.Category;

public class CategoryTest {
	
	private static ApplicationContext context;

	private static CategoryDAOImpl categoryDAOImpl;	
	private static Category category;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext(HibernateConfig.class);
	
		categoryDAOImpl = (CategoryDAOImpl)context.getBean("categoryDAOImpl");
	}
	
	
//	@Test
//	public  void testAddCategory() {
//		assertEquals("susscessfully added category to DB!", true, categoryDAOImpl.add(category));
//	}

//	@Test
//	public  void testGetCategory() {
//		category = categoryDAOImpl.get(2);
//		assertEquals("susscessfully fetched category from DB!", "Mobile", categoryDAOImpl.get(2).getName());
//	}
	
//	@Test
//	public void testUpdateCategory() {	
//		category = categoryDAOImpl.get(2);
//		category.setName("Television");
//		assertEquals("susscessfully updated category", true, categoryDAOImpl.update(category));
//	}
//	@Test
//	public void testDeleteCategory() {	
//		category = categoryDAOImpl.get(2);
//		assertEquals("susscessfully deleted category", true, categoryDAOImpl.delete(category));
//	}
//	@Test
//	public void testListCategory() {	
//		category = categoryDAOImpl.get(2);
//		assertEquals("susscessfully fetched list of categories", 3, categoryDAOImpl.list().size());
//	}
	
	
}
