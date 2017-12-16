/******************************************/
/******************************************/
/*** Project 3: Bouncing ball animation ***/
/******************************************/
/******************************************/


// Global Variables
int x1 = 400;
int x2 = 300;
int x3 = 200;

int grow1 = 1;
int grow2 = 1;
int grow3 = 1;

void setup() {
	size(800,800);
	background(150);
	smooth(); // Smooth edges of shapes
}

void draw() {

	stroke(250,0,0);
	ellipse(x1,200,50,50);

	stroke(0,250,0);
	ellipse(x2,400,50,50);

	stroke(0,0,250);
	ellipse(x3,600,50,50);

	x1 += grow1;
	x2 += grow2;
	x3 += grow3;

	if (x1 >= width - 25 || x1 <= 25) {
		grow1 *= -1;
	}

	if (x2 >= width - 25 || x2 <= 25) {
		grow2 *= -1;
	}

	if (x3 >= width - 25 || x3 <= 25) {
		grow3 *= -1;
	}

}