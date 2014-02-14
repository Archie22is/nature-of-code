float increment = 0.01;
float zOff = 0.0;

void setup() {
  size(400,400);

  frameRate(30);
}

void draw() {
	background(0);

	loadPixels();

	zOff += increment;

	float xOff = 0.0;

 	
 	// For every x,y coordinate in a 2D space, calculate a noise value and produce a brightness value
  for (int x = 0; x < width; x++) {
    xOff += increment;   // Increment xOff 
    float yOff = 0.0;   // For every xOff, start yOff at 0
    for (int y = 0; y < height; y++) {
      yOff += increment; // Increment yOff
      
      // Calculate noise and scale by 255
      float bright = noise(xOff, yOff, zOff)*255;

      // Try using this line instead
      //float bright = random(0,255);
      
      // Set each pixel onscreen to a grayscale value
      pixels[x+y*width] = color(bright);
    }
  }
  
  updatePixels();
}