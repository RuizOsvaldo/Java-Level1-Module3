package _06_frogger;

import processing.core.PApplet;


public class Car extends PApplet{
	 int x;
	 int y; 
	 int size;
	 int speed;
	
	public Car(int xPos, int yPos, int sizeOfCar, int speedOfCar){
		x = xPos;
		y = yPos;
		size = sizeOfCar;
		speed = speedOfCar;
	}
	
	void display(){
	    fill(0,255,0);
	    rect(x , y,  size, 20);
	}

}
