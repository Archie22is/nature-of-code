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

public class perlinnoise extends PApplet {

float increment = 0.01f;
float zOff = 0.0f;

public void setup() {
  size(100,100);

  frameRate(30);
}

public void draw() {
	background(0);

	loadPixels();

	zOff += increment;

	float xOff = 0.0f;

 	
 	// For every x,y coordinate in a 2D space, calculate a noise value and produce a brightness value
  for (int x = 0; x < width; x++) {
    xOff += increment;   // Increment xOff 
    float yOff = 0.0f;   // For every xOff, start yOff at 0
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
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "perlinnoise" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
