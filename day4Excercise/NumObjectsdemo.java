package day4Excercise;

public class NumObjectsdemo {
	  public static void main(String[] args) {
	        // Creating instances of ObjectCounter
	    	NumObjects obj1 = new NumObjects();
	    	NumObjects obj2 = new NumObjects();
	    	NumObjects obj3 = new NumObjects();

	        // Printing the number of objects created
	        System.out.println("Number of objects created: " + NumObjects.getObjectCount());

	        // Creating more instances of ObjectCounter
	        NumObjects obj4 = new NumObjects();
	        NumObjects obj5 = new NumObjects();

	        // Printing the updated number of objects created
	        System.out.println("Number of objects created: " + NumObjects.getObjectCount());
	    



	}


}


