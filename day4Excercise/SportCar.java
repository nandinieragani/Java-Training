package day4Excercise;

class SportCar extends Car {
	
    private String AirBallonType;

    public SportCar() {
        super();
        this.AirBallonType = "";
    }

    public void drive(int speed, int noOfGear, String AirBallonType) {
        super.drive(speed, noOfGear);
        this.AirBallonType = AirBallonType;
        System.out.println("Initial Speed: " + this.speed);
        System.out.println("Initial Number of Gears: " + this.noOfGear);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Air Balloon Type: " + AirBallonType);
    }

}

