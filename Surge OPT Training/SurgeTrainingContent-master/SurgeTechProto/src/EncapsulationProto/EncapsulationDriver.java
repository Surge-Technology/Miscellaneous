package EncapsulationProto;

public class EncapsulationDriver {

	 public static void main(String args[]){
	        EncapsulationDemo obj = new EncapsulationDemo();
	        obj.setEmpName("Mario");
	        obj.setEmpAge(32);
	        obj.setEmpSSN(112233);
	        obj.salary = 200;
	        
	       
	        
	        
	        
	        
	        
	        
	        EncapsulationDemo objnew = new EncapsulationDemo();
	        objnew.setEmpName("John");
	        objnew.setEmpAge(22);
	        objnew.setEmpSSN(445566);
	        
	        
	        System.out.println("Employee Name: " + obj.getEmpName());
	        System.out.println("Employee SSN: " + obj.getEmpSSN());
	        System.out.println("Employee Age: " + obj.getEmpAge());
	        
	        System.out.println("Employee Name: " + objnew.getEmpName());
	        System.out.println("Employee SSN: " + objnew.getEmpSSN());
	        System.out.println("Employee Age: " + objnew.getEmpAge());
	   } 

}
