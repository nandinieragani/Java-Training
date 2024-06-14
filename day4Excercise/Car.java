package day4Excercise;

public class Car {
	    protected int speed;
	    protected int noOfGear;

	    public Car() {
	        this.speed = 0;
	        this.noOfGear = 0;
	    }

	    public void drive(int speed, int noOfGear) {
	        this.speed = speed;
	        this.noOfGear = noOfGear;
	    }

	    public void display() {
	        System.out.println("Speed: " + speed + " km/h");
	        System.out.println("Number of Gears: " + noOfGear);
	    }
	}


