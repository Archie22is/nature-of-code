void setup() {
  size(400,400);
  background(255);
  frameRate(30);

}

void draw() {
	float num = randomGaussian();
	float xPos = num * (width/8) + (width/2);
	stroke(50, 50);
	line(xPos, 0, xPos, height);
}