

import java.util.HashMap;

public class Student 
{
	int Studentid;
	String Studentname;
	HashMap<String,Integer> details=new HashMap<String,Integer>();
	double Marks;
	
	public double getMarks() {
		return Marks;
	}
	public void setMarks(double marks) {
		Marks = marks;
	}
	public int getStudentid() {
		return Studentid;
	}
	public void setStudentid(int studentid) {
		Studentid = studentid;
	}
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public HashMap<String,Integer> getDetails() {
		return details;
	}
	public void setDetails(HashMap<String,Integer>  details) {
		this.details = details;
	}
}