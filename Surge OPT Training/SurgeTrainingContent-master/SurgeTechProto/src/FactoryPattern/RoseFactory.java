package FactoryPattern;

public class RoseFactory {
	 
	   //use addColor method to get object of type Rose 
	   public Rose getRose(String color){
	      if(color == null){
	         return null;
	      } 
	      if(color.equalsIgnoreCase("RED")){
	    	  
	    	  return new RedRose();
	         
	      } else if(color.equalsIgnoreCase("YELLOW")){
	         return new YellowRose();
	         
	      } else if(color.equalsIgnoreCase("PINK")){
	         return new PinkRose();
	      }     
	      return null;
	 
	   }
	}