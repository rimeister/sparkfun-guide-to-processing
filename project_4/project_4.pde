void setup() {
	size(240,240);
	background(150);
}

int i = 1; 

void draw() {
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