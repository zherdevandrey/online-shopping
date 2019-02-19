package web.net.com.daoImpl;

import java.util.ArrayList;
import java.util.List;

import web.net.com.dao.CategoryDAO;
import web.net.com.dto.Category;

public class CategoryDAOImpl implements CategoryDAO{

	private static List<Category> categories = new ArrayList<Category>();
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
	
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("TV");
		category.setDescription("descr for TV");
		category.setImageURL("CAT_1.png");
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("descr for Mobile");
		category.setImageURL("CAT_2.png");

		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("descr for Laptop");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
	}

}
