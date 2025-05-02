package Thread;


class ThreadFirstDemo extends Thread{  
	  
	  public void run(){  
	    System.out.println("My thread is in running state.");  
	  }
	     
	   public static void main(String args[]){  
		   ThreadFirstDemo obj=new ThreadFirstDemo();   //new state
		   obj.start();  //runnable state
	  }  
	}