package web.net.com.webShoppingBack;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import web.back.com.config.HibernateConfig;
import web.back.com.daoImpl.CategoryDAOImpl;
import web.back.com.daoImpl.ProductDAOImpl;
import web.back.com.dto.Category;
import web.back.com.dto.Product;

public class ProductTest {
	private static ApplicationContext context;

	private static ProductDAOImpl productDAOImpl;	
	private static Product product;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		productDAOImpl = (ProductDAOImpl)context.getBean("productDAOImpl");
	}
	
//	 Product get(int productId)
//	 List<Product> list() X
//	 add(Product product)
//	 update(Product product)
//	 delete(Product product) 
//	 List<Product> listActiveProducts()
//	 List<Product> listActiveProductsByCategory(int categoryId)
//	 List<Product> getLatestActiveProducts(int count) 
	
	@Test
	public  void testProductDAOImpl() {
//		Product product = new Product();
//		product.setName("product10");
//		product.setActive(true);
//		product.setCategoryId(1);
//		product.setSupplierId(1);
		
//		productDAOImpl.delete(product)
//		productDAOImpl.add(product);
//		product.setActive(false);
//		productDAOImpl.update(product);

		//product = productDAOImpl.get(1);
		//assertEquals("success select from product ", "iPhone 5s" , product.getName());
		
		List<Product> productList = productDAOImpl.listActiveProductsByCategory(1);
		for (Product product : productList) {
			System.out.println(product.getName());
		}
		
	}
}
