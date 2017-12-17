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

int i = 1; 

public void draw() {
	// Box that moves every second
	fill( second() * 4,0,0 );
	rect( second() * 4,160,50,50);

	// Box that moves every minute
	fill( 0,minute() * 4,0 );
	rect( minute() * 4,100,50,50);

	// Box that moves every hours
	fill( 0,0,hour() * 4 );
	rect( hour() * 4,40,50,50 );	

	if ( i == 1 ) {

		print( "The number of seconds is " + second() + "\n" );
		print( "The number of minutes is " + minute() + "\n" );

	}

	print(i + "\n");

	i++;

	if ( i == 60 ) {
		i = 1;
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
