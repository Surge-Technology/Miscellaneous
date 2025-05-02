package EncapsulationProto;

public class Animal {
	private String animalName;
	private String animalType;
	private int height;
	private String color;

	public Animal(String animalName, String animalType) {
		this.animalName = animalName;
		this.animalType = animalType;
	}

	
	//encapsulation is not about having getter/setters
	public String getAnimalName() {

		return animalName;
	}

	public void setAnimalName(String blabla) {
		this.animalName = blabla;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String bla) {
		this.animalType = bla;
	}
	
	public static void main(String args[]){
		Animal obj = new Animal("lion","domestc");
		System.out.println(obj.getAnimalName());
		
   } 
	
	

}