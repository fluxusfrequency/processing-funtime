class Polygon {
  PShape s;

  void display() {
    shape(s);
  }
}

////////////////

Polygon(PShape s_) {
    s = s_;
  }
}

Polygon poly;                   // An object of type Polygon

void setup() {
  size(640,360,P2D);

  PShape star = createShape();  // First we make the PShape
  star.beginShape();
  star.noStroke();
  star.fill(0, 127);
  star.vertex(0, -50);
  star.vertex(14, -20);
  star.vertex(47, -15);
  star.vertex(23, 7);
  star.vertex(29, 40);
  star.vertex(0, 25);
  star.vertex(-29, 40);
  star.vertex(-23, 7);
  star.vertex(-47, -15);
  star.vertex(-14, -20);
  star.endShape(CLOSE);

  poly = new Polygon(star);     // Then we make the Polygon object by passing in the reference to the PShape

}

////////////////////
ArrayList polygons;
PShape[] shapes = new PShape[2];                       // An array of PShapes

void setup() {
  size(640, 360, P2D);
  smooth();
  shapes[0] = createShape(ELLIPSE,0,0,100,100);        // Two PShapes
  shapes[1] = createShape(RECT,0,0,100,100);

  polygons = new ArrayList();

  for (int i = 0; i < 25; i++) {
    int selection = int(random(shapes.length));        // Pick a random index
    Polygon p = new Polygon(shapes[selection]);        // Use corresponding PShape to create Polygon
    polygons.add(p);
  }
}

