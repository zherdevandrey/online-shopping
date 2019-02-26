package web.back.com.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import web.back.com.dao.CategoryDAO;
import web.back.com.dto.Category;

@Repository
@Transactional
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
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("descr for Mobile");
		category.setImageURL("CAT_2.png");
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("descr for Laptop");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
	}

	public Category get(int id) {
		for (Category category : categories) {
			if (category.getId() == id) {
				return category;
			}
		}
		return null;
	}

}
