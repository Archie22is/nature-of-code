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

public class walker extends PApplet {


Walker w1;
Walker w2;
Walker w3;

public void setup() {
  size(400,400);
  background(255);
  frameRate(30);


  // Create a walker object
  w1 = new Walker();
	w2 = new Walker();
	w3 = new Walker();
}

public void draw() {
  float num = randomGaussian();

  w1.walk();
  w1.render();
  w2.walk();
  w2.render();
  w3.walk();
  w3.render();
}
class Walker {
  float x, y;

  Walker() {
    x = width/2;
    y = height/2;
  }

  public void render() {
    stroke(0);
    point(x, y);
  }

  // Randomly move up, down, left, right, or stay in one place
  public void walk() {
    float vx = random(-5, 6);
    float vy = random(-5, 6);
    x += vx;
    y += vy;

    // Stay on the screen
    x = constrain(x, 0, width-1);
    y = constrain(y, 0, height-1);
  }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "walker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
