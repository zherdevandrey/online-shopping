package web.net.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import web.back.com.dao.CategoryDAO;
import web.back.com.dao.ProductDAO;
import web.back.com.dto.Category;
import web.back.com.dto.Product;

@Controller
@RequestMapping("/manage")
public class ManageController {

	@Autowired
	CategoryDAO categoryDAO;
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ModelAndView showManageProducst() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickManageProduct",true);
		mv.addObject("title", "Manage Products");
		Product nProduct = new Product();
		nProduct.setSupplierId(1);
		nProduct.setActive(true);
		mv.addObject("product",nProduct);
		return mv;
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public String handleProductSubmition(@ModelAttribute("product") Product nProduct) {
		productDAO.add(nProduct);
		return "redirect:/manage/products";
	}
	
	@ModelAttribute("categories")
	public List<Category> getCategoriesList() {
		return categoryDAO.list();
	}
}
