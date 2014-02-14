Walker w1;
Walker w2;
Walker w3;

void setup() {
  size(400,400);
  background(255);
  frameRate(30);

  // Create a walker object
  w1 = new Walker();
	w2 = new Walker();
	w3 = new Walker();
}

void draw() {
  w1.walk();
  w1.render();
  w2.walk();
  w2.render();
  w3.walk();
  w3.render();
}