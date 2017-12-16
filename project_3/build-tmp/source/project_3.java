import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class project_3 extends PApplet {

/******************************************/
/******************************************/
/*** Project 3: Bouncing ball animation ***/
/******************************************/
/******************************************/

// Classes
class Circle {

	int c;
	int x;
	int y;
	int speed;

	Circle (int tempX,int tempY,int tempSpeed,int tempColor) {
		x = tempX;
		y = tempY;
		speed = tempSpeed;
		c = tempColor;
	}

	public void display(){
		stroke(c);
		ellipse(x,y,50,50);
	}

}

// Global Variables
Circle[] circles; // Array of circles

// Setup
public void setup() {
	
	background(150);
	 // Smooth edges of shapes
	int red = color(255,0,0);
	int green = color(0,250,0);
	int blue = color(0,0,250);
	circles = new Circle[3];
	circles[0] = new Circle(400,200,1,red);
	circles[1] = new Circle(300,400,2,green);
	circles[2] = new Circle(200,600,3,blue);
}

// Draw loop
public void draw() {

	for (Circle circ : circles) {
		circ.x += circ.speed;
		circ.y += circ.speed;
		if (circ.x >= width - 25 || circ.x <= 25 || circ.y >= height - 25 || circ.y <= 25) {
			circ.speed *= -1;
		}
		circ.display();
	}

}
  public void settings() { 	size(800,800); 	smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "project_3" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
