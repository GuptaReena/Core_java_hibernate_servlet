package mvc;

public class Student {
	
	private String firstName;
	private String lastName;
	private String cname;

	public Student(String firstName, String lastName, String cname) {
		super();
		this.firstName = firstName;
		this.lastName= lastName;
		this.cname= cname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	
}
