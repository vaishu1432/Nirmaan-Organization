package day14;

public class EmployeeManagement {
	
	private String empName;
	private int empId;
	private String empDept;
	private int empPhone;
	public EmployeeManagement() {
		
	}
	public EmployeeManagement(String empName, int empId, String empDept, int empPhone) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empDept = empDept;
		this.empPhone = empPhone;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public int getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(int empPhone) {
		this.empPhone = empPhone;
	}
	
	public String toString() {
		return "empName=" +empName+ ", empId=" + empId + ", empDept=" + empDept + ", empPhone="
				+ empPhone ;
	}

}

