/******************************************/
/******************************************/
/*** Project 3: Bouncing ball animation ***/
/******************************************/
/******************************************/


// Global Variables
int x = 400;
int grow = 5;

void setup() {
	size(800,800);
	background(150);
	smooth(); // Smooth edges of shapes
}

void draw() {
	fill(250,0,0);
	ellipse(x,400,100,100);
	x++;
}