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
	
}

public void draw() {

	//background(150);
	rotate(millis());

	fill( second() * 4,0,0 );
	rect( 20,160,second(),second() );

	fill( 0,0,minute() * 4 );
	triangle( 100,100,80,40,minute(),minute() );

	fill( 0,hour()*10,0 );
	ellipse( 0,0,hour()*5,hour()*5 );
	if ( second() >= 59 ) {
		background(150);
	}

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
