package emp;

public class Project {
	
	int id;
	String projectName;
	String clientName;
	String clientEmail;
	int budget;
	String shortProjectInfo;
	long clientPhoneNo;
	String status;
	
	public Project(int id, String projectName, String clientName, String clientEmail, int budget,
			String shortProjectInfo, long clientPhoneNo, String status) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.clientName = clientName;
		this.clientEmail = clientEmail;
		this.budget = budget;
		this.shortProjectInfo = shortProjectInfo;
		this.clientPhoneNo = clientPhoneNo;
		this.status = status;
	}

	public Project(String projectName, String clientName, String clientEmail, int budget, String shortProjectInfo,
			long clientPhoneNo, String status) {
		super();
		this.projectName = projectName;
		this.clientName = clientName;
		this.clientEmail = clientEmail;
		this.budget = budget;
		this.shortProjectInfo = shortProjectInfo;
		this.clientPhoneNo = clientPhoneNo;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudjet(int budget) {
		this.budget = budget;
	}

	public String getShortProjectInfo() {
		return shortProjectInfo;
	}

	public void setShortProjectInfo(String shortProjectInfo) {
		this.shortProjectInfo = shortProjectInfo;
	}

	public long getClientPhoneNo() {
		return clientPhoneNo;
	}

	public void setClientPhoneNo(long clientPhoneNo) {
		this.clientPhoneNo = clientPhoneNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}

