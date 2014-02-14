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

public class gaussian extends PApplet {

public void setup() {
  size(400,400);
  background(255);
  frameRate(30);

}

public void draw() {
	float num = randomGaussian();
	println(num);
	float xPos = num * (width/8) + (width/2);
	stroke(50, 50);
	line(xPos, 0, xPos, height);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "gaussian" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
