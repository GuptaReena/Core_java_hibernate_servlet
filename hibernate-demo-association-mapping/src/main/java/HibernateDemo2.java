import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateDemo2 {

	
	public static void main(String arg[]) {
		
		
		SessionFactory sessionFactory = HibernateUtil.getSession();
		
		Session session =  sessionFactory.openSession();
		
		DepartmentEntity deptEntity = session.get(DepartmentEntity.class, 503);
		
		System.out.println("Department ID : " + deptEntity.getDeptId());
		System.out.println("Department Name : " + deptEntity.getDeptName());

		
		System.out.println("List of Employee");
		List<EmployeeEntity> allEmps = deptEntity.getAllEmp();
		allEmps.forEach((eachEmps) -> {
			System.out.println("---------------------------------");
			System.out.println("Employee Id :" + eachEmps.getEmployeeId());
			System.out.println("Employee Name : " + eachEmps.getEmployeeName());
			System.out.println("Employee Name : " + eachEmps.getEmployeeContact());
			System.out.println("---------------------------------");

		});

		
	}
}
