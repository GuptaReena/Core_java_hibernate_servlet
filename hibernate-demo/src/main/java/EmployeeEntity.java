import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity {

	@Id
	@Column(name="emp_id")
	int empID;
	
	@Column(name="emp_name")
	String empName;
	
	@Column(name="emp_contact")
	String empContact;
	
	@Column(name="emp_dept")
	int empDeptId;

	public EmployeeEntity(int empID, String empName, String empContact, int empDeptId) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empContact = empContact;
		this.empDeptId = empDeptId;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpContact() {
		return empContact;
	}

	public void setEmpContact(String empContact) {
		this.empContact = empContact;
	}

	public int getEmpDeptId() {
		return empDeptId;
	}

	public void setEmpDeptId(int empDeptId) {
		this.empDeptId = empDeptId;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [empID=" + empID + ", empName=" + empName + ", empContact=" + empContact + ", empDeptId="
				+ empDeptId + "]";
	}
	
	
}
