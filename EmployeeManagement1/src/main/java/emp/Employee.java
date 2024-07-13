package emp;

public class Employee {
	private String username;
	private String pass;
	private int id;
	private int empid;
	private String employeeName;
	private String gender;
	private String email;
	private long phoneNumber;
	private int salary;
	private String designation;
	private String city;
	
	public Employee(int empid,String employeeName,String gender,String email, long phoneNumber,int salary,String designation ,String city) {
		super();
		this.empid = empid;
		this.employeeName = employeeName;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
		this.designation = designation;
		this.city = city;
	}

	public Employee(int id, int empid, String employeeName,String gender, String email, long phoneNumber, int salary, String designation,String city) {
		super();
		this.id = id;
		this.empid = empid;
		this.employeeName= employeeName;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
		this.designation = designation;
		this.city = city;
	}
	
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getemployeeName() {
		return employeeName;
	}

	public void setemployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(String pass , String username) {
		super();
		this.username = username;
		this.pass = pass;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
