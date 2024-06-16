package com.hcltech.Excer5Excer6;

public class Musicdemo {
	//Test class
	
	 public static void main(String[] args) {
	     // Create an instance of Veena and call play() method
	     Veena veena = new Veena();
	     veena.play();

	     // Create an instance of Saxophone and call play() method
	     Saxophone saxophone = new Saxophone();
	     saxophone.play();

	     // Place the above instances in a variable of type Playable and then call play()
	     Music playableVeena = veena;
	     playableVeena.play();

	     Music playableSaxophone = saxophone;
	     playableSaxophone.play();
	 }
	}


