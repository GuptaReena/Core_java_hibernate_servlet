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
	int empDept;
	
	
	public EmployeeEntity(){}


	public EmployeeEntity(int empID, String empName, String empContact, int empDept) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empContact = empContact;
		this.empDept = empDept;
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


	public int getEmpDept() {
		return empDept;
	}


	public void setEmpDept(int empDept) {
		this.empDept = empDept;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empContact == null) ? 0 : empContact.hashCode());
		result = prime * result + empDept;
		result = prime * result + empID;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeEntity other = (EmployeeEntity) obj;
		if (empContact == null) {
			if (other.empContact != null)
				return false;
		} else if (!empContact.equals(other.empContact))
			return false;
		if (empDept != other.empDept)
			return false;
		if (empID != other.empID)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "EmployeeEntity [empID=" + empID + ", empName=" + empName + ", empContact=" + empContact + ", empDept="
				+ empDept + "]";
	}
	
	
	
	
}
