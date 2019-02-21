package web.back.com.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import web.back.com.dto.Category;

public interface CategoryDAO {
	List<Category> list();
	Category get(int id);
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
}
