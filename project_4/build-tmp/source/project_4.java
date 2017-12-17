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

public class project_4 extends PApplet {

public void setup() {
	
	background(150);
}

public void draw() {
	fill( second() * 4, 0, 0 );
	rect( second() * 4, 160,50,50);
}
  public void settings() { 	size(240,240); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "project_4" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
