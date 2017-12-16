/******************************************/
/******************************************/
/*** Project 3: Bouncing ball animation ***/
/******************************************/
/******************************************/

// Classes
class Circle {

	color c;
	int x;
	int y;
	int speed;

	Circle (int tempX,int tempY,int tempSpeed,color tempColor) {
		x = tempX;
		y = tempY;
		speed = tempSpeed;
		c = tempColor;
	}

	void display(){
		stroke(c);
		ellipse(x,y,50,50);
	}

}

// Global Variables
Circle[] circles; // Array of circles

// Setup
void setup() {
	size(800,800);
	background(150);
	smooth(); // Smooth edges of shapes
	color red = color(255,0,0);
	color green = color(0,250,0);
	color blue = color(0,0,250);
	circles = new Circle[3];
	circles[0] = new Circle(400,200,1,red);
	circles[1] = new Circle(300,400,2,green);
	circles[2] = new Circle(200,600,3,blue);
}

// Draw loop
void draw() {

	for (Circle circ : circles) {
		circ.x += circ.speed;
		if (circ.x >= width - 25 || circ.x <= 25) {
			circ.speed *= -1;
		}
		circ.display();
	}

}