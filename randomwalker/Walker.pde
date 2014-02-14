class Walker {
  float x, y;

  Walker() {
    x = width/2;
    y = height/2;
  }

  void render() {
    stroke(0);
    point(x, y);
  }

  // Randomly move up, down, left, right, or stay in one place
  void walk() {
    float vx = random(-5, 5);
    float vy = random(-5, 5);
    x += vx;
    y += vy;

    // Stay on the screen
    x = constrain(x, 0, width-1);
    y = constrain(y, 0, height-1);
  }
}
