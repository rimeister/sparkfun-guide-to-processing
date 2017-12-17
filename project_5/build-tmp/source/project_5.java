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

public class project_5 extends PApplet {

public void setup() {
	
}

public void draw() {
	background(255);

	if ( mouseX == pmouseX || mouseY == pmouseY) {
		noStroke();
		pushMatrix();
		translate(mouseX,mouseY);
		rotate(second());
		fill(255,0,0);
		ellipse(0,0,25,25);
		ellipse(0,25,25,25);
		ellipse(0,50,25,25);
		popMatrix();	
	}

}
  public void settings() { 	size(250,250); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "project_5" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
