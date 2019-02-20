package web.back.com.dao;

import java.util.List;
import web.back.com.dto.Category;


public interface CategoryDAO {
	List<Category> list();
	Category get(int id);
	
}
