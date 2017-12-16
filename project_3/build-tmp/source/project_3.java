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


// Global Variables
int x = 400;
int grow = 5;

public void setup() {
	
	 // Smooth edges of shapes
}

public void draw() {
	background(150); // Re-renders background each frame to remove trail
	fill(250,0,0);
	ellipse(x,400,100,100);
	x += grow;

	if (x >= width) {
		print("x is greater than width");
		grow = grow * -1;
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
