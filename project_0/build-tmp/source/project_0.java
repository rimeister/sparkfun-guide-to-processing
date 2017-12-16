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

public class project_0 extends PApplet {

// Hello World sketch, draws a line
public void setup() {
	
}

public void draw() {
	line(0,0,250,250);
}
  public void settings() { 	size(250,250); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "project_0" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
