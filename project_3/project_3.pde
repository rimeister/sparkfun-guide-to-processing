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
	smooth(); // Smooth edges of shapes
}

void draw() {
	background(150); // Re-renders background each frame to remove trail
	fill(250,0,0);
	ellipse(x,400,100,100);
	x += grow;

	if (x >= width - 50 || x <= 50) {
		grow *= -1;
	}

}