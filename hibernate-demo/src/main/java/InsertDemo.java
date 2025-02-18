import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class InsertDemo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub


		//step 1: Obtain session Factory
		System.out.println("Going Obtained a sesion Factory......");
		SessionFactory sessionFactory = HibernateUtil.giveSessionFactory();
		
		
		//Step 2:  From session factory open a session
		
		System.out.println("Going Open a session.....");
		Session session = sessionFactory.openSession();
		
		
		// try with resource is used to close the opened session automatically
		try(sessionFactory; session){
			
			//Step 3: Begin the transaction
			System.out.println("Going the transaction......");
			session.beginTransaction();
			
			
			//Step 4: Perform Insert Operation
			EmployeeEntity empEntity =  new EmployeeEntity(106,"Neetu","9136243003",503);
			
			
			System.out.println("Going to Persist Entity object.....");
			session.persist(empEntity);
			
			
			System.out.println("Goint to commit the Transaction .....");
			session.getTransaction().commit();
			
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
