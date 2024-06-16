package com.hcltech.Excer5Excer6;
//Playable interface
interface Music {
 void play();
}

//Veena class
class Veena implements Music {
 @Override
 public void play() {
     System.out.println("Playing the Veena");
 }
}

//Saxophone class
class Saxophone implements Music {
 @Override
 public void play() {
     System.out.println("Playing the Saxophone");
 }
}
