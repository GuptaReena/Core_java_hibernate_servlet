import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory =  HibernateUtil.getSession();
		
		Session session = sessionFactory.openSession();
		
		
		OrderEntity allOrders = session.get(OrderEntity.class, 10100);
		System.out.println("Order Number :" + allOrders.getOrderNumber());
		System.out.println("Order Date :" + allOrders.getOrderDate());
		System.out.println("Order Status :" + allOrders.getOrderStatus());
		
		System.out.println("Fetch Product List .........");
		
		List<ProductEntity> allProducts =  allOrders.getAllProducts();
		
		allProducts.forEach((eachProduct) ->{ 
			System.out.println("Product Code" + eachProduct.getProductCode());
			System.out.println("Product Name" + eachProduct.getProductName());
			System.out.println("Product Line" + eachProduct.getProductLine());
			System.out.println("----------------------------");
		});

		
		session.close();
		sessionFactory.close();
	}
	
	

}
