

public class Employee {
	
	//private variables
	private	int empId;
	private String empName ;
	private double empSal;
	
	//constructor helping arraylist and hashmap
	public Employee(int Id, String Name,double Sal) {
        this.empId= Id;
        this.empName = Name;
        this.empSal =Sal;
   }
   //getters and setters
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public double getEmpSal() {
		return empSal;
	}
}
