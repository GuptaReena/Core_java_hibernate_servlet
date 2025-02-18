import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class HibernatePaginationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SessionFactory sessionFactory = HibernateUtil.getSession();
		
		Session session = sessionFactory.openSession();
		
		//Calculate the Pagination Parameter
		int pageNumber = 1;
		int pageSize = 5;
		int firstResult = (pageNumber - 1) * pageSize;
		
		//fetch product using HQL
		String hql = "From ProductEntity";
		Query query = session.createQuery(hql);
		
		query.setFirstResult(firstResult);
		query.setMaxResults(pageSize);
		
		List<ProductEntity> someProducts = query.list();
		someProducts.forEach((eachProduct)-> { 
		System.out.println("Product ID : " + eachProduct.getProductCode());
		System.out.println("Product Name : " + eachProduct.getProductName());
		System.out.println("-----------------------------------------");
		});
		
	}

}
