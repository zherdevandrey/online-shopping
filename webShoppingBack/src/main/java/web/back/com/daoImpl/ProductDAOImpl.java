package web.back.com.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import web.back.com.dao.ProductDAO;
import web.back.com.dto.Product;


@Repository("productDAOImpl")
@Transactional
public class ProductDAOImpl implements ProductDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	public Product get(int productId) {
		return sessionFactory.getCurrentSession().get(Product.class, productId);
	}

	public List<Product> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean add(Product product) {
		try {
			sessionFactory.getCurrentSession().persist(product);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	public boolean update(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	public boolean delete(Product product) {
		product.setActive(false);
		return this.update(product);
	}

	public List<Product> listActiveProducts() {
		String selectActiveProducts = "from Product where active =:active";
		return sessionFactory.getCurrentSession()
			.createQuery(selectActiveProducts, Product.class)
				.setParameter("active", true).getResultList();
	}

	public List<Product> listActiveProductsByCategory(int categoryId) {
		String selectActiveProducts = "from Product where active=:active"
				+ " and categoryId=:categoryId";
		return sessionFactory.getCurrentSession()
			.createQuery(selectActiveProducts, Product.class)
				.setParameter("active", true)
				.setParameter("categoryId", categoryId).getResultList();
	}

	public List<Product> getLatestActiveProducts(int count) {
		return sessionFactory.getCurrentSession()
				.createQuery("from Product where active=:active ORDER BY id", Product.class)
					.setParameter("active", true)
						.setFirstResult(0)
						.setMaxResults(count)
							.getResultList();
	}

}
