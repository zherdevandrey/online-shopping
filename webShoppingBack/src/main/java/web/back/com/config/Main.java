package web.back.com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import web.back.com.dao.CategoryDAO;
import web.back.com.dto.Category;

public class Main {

	@Autowired
	@Qualifier("categoryDAOImpl")
	private static CategoryDAO categoryDAO;
	
	private static AnnotationConfigApplicationContext context;
	
	public static void main(String[] args) {

		categoryDAO.add(new Category());
	}

}
