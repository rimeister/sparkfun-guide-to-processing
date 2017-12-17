void setup() {
	size(250,250);
}

void draw() {
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