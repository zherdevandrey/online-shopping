package web.net.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import web.back.com.dao.CategoryDAO;
import web.back.com.dto.Category;


@Controller
public class PageController {

	
	@Autowired
	private CategoryDAO categoryDAO;
	
	
	@RequestMapping(value = {"/", "/home"})
	public ModelAndView index() {
		System.out.println("home");
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("categoties", categoryDAO.list());
		modelAndView.addObject("title", "Home");
		modelAndView.addObject("userClickHome", true);
		return modelAndView;
	}
		
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "All Products");
		modelAndView.addObject("categoties", categoryDAO.list());
		modelAndView.addObject("userClickAllProducts",true);
		System.out.println("test");
		return modelAndView;
	}	
	
	
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView modelAndView = new ModelAndView("page");
		Category category = null;
		category = categoryDAO.get(id);
		modelAndView.addObject("category", category);
		modelAndView.addObject("categoties", categoryDAO.list());
		modelAndView.addObject("title", category.getName());
		modelAndView.addObject("userClicCategoryProducts", true);
		return modelAndView;
	}
	
	@RequestMapping("/about")
	public ModelAndView about() {
		System.out.println("about");
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "About us");
		modelAndView.addObject("userClicAbout", true);
		return modelAndView;
	}	
	
	@RequestMapping("/contact")
	public ModelAndView contact() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "Contact us");
		modelAndView.addObject("userClicContact", true);
		return modelAndView;
	}	

	@RequestMapping("/listProducts")
	public ModelAndView products() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "All Products");
		modelAndView.addObject("userClicProducts", true);
		return modelAndView;
	}	
	

}
