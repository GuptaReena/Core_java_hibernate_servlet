import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="department")
public class DepartmentEntity {
	
	@Id
	@Column(name="dept_id")
	int deptId;
	
	@Column(name="dept_name")
	String deptName;
	
	@OneToMany(mappedBy ="deptEntity")
	private List<EmployeeEntity> allEmp;
	
	public DepartmentEntity() {}

	public DepartmentEntity(int deptId, String deptName, List<EmployeeEntity> allEmp) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.allEmp = allEmp;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<EmployeeEntity> getAllEmp() {
		return allEmp;
	}

	public void setAllEmp(List<EmployeeEntity> allEmp) {
		this.allEmp = allEmp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allEmp == null) ? 0 : allEmp.hashCode());
		result = prime * result + deptId;
		result = prime * result + ((deptName == null) ? 0 : deptName.hashCode());
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
		DepartmentEntity other = (DepartmentEntity) obj;
		if (allEmp == null) {
			if (other.allEmp != null)
				return false;
		} else if (!allEmp.equals(other.allEmp))
			return false;
		if (deptId != other.deptId)
			return false;
		if (deptName == null) {
			if (other.deptName != null)
				return false;
		} else if (!deptName.equals(other.deptName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DepartmentEntity [deptId=" + deptId + ", deptName=" + deptName + ", allEmp=" + allEmp + "]";
	}

	
	
}
