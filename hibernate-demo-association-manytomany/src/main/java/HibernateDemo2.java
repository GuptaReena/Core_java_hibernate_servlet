import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory =  HibernateUtil.getSession();
		
		Session session =  sessionFactory.openSession();
		
		
		ProductEntity allProducts = session.get(ProductEntity.class, "S10_1678");
		System.out.println("Product Name :" + allProducts.getProductCode());
		System.out.println("Product Name :" + allProducts.getProductName());
		System.out.println("Product Line :" + allProducts.getProductLine());
		
		System.out.println("Fetch All the products");
		
		List<OrderEntity> allOrders = allProducts.getAllOrders();
		allOrders.forEach((eachOrder)->{
			System.out.println("Order Number :" + eachOrder.getOrderNumber());
			System.out.println("Order Date :" + eachOrder.getOrderDate());
			System.out.println("Order Status :" + eachOrder.getOrderStatus());
			System.out.println("--------------------------");
			});
		
		session.close();
		sessionFactory.close();
		
	}

}
