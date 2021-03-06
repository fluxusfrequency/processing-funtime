# Processing Methods



# Utility

## setup()
Runs the code before the draw cycle begins.

## draw()
Runs continuously after setup, drawing the screen in realtime.

## size()
Set width and height.

## loop()

## noLoop()

## second()

## minute()

## hour()

## mouseX & mouseY


# Shapes

## point()
`point(x, y)`

## vertex
`vertex(x, y)`

## line()
`line(x1, y1, x2, y2)`
Draws from point 1 to point 2.

## rectangle()
`rect(x, y, width, height)`
x, y is the top left corner, width and height span out from there.

`rectMode(CENTER)`
x, y is the center.
Width and height span out from that center point

`rectMode(CORNERS)`
`rect(x1, y1, x2, y2)`
Point 1 is the top left, point 2 is the bottom right.

## ellipse()
Work the same as rectangles, where the rectangle that would be there is
the bounding box of the ellipse.

## triangle()
`triangle(x1, y1, x2, y2, x3, y3)`

## Continuous Shapes
`beginShape()`
`vertex(x, y)`
`vertex(x, y)`
`endShape()`



# Curves

## arc()
Section of an ellipse.
`arc(x, y, width, height, start, stop`
The first four parameters are the same as `ellipse`. The start
and stop angles are measured in radians. (0 to 360 degrees, with
0 being due east).

## curve()
_Rom-Catmull Spline_
`curve(cpx1, cpy1, x1, y1, x2, y2, cpx2, cpy2)`
control point, curve start, curve end, control end

## Continuous Spline Curve
Usually more useful than `curve`
`beginShape()`
`curveVertex(x, y)`
`curveVertex(x, y)`
`endShape()`;

## bezier()
`bezier(x1, y1, cpx1, cpy1, cpx2, cpy2, x2, y2)`
start, control, control, end

## Continuous Bezier Curve
`beginShape()`
`vertex(x, y)` // First point
`bezierVertex(cpx1, cpy1, cpx2, cpy2, x, y)`
`bezierVertex(cpx1, cpy1, cpx2, cpy2, x, y)`
`endShape()`



# Text

## createFont()
`createFont()`
declares the font

## textFont()
`textFont(font, pt)`
sets the font

## textAlign()
`textAlign(position)`
LEFT, CENTER, RIGHT

## textWidth()
`textWidth(text)`
gets the text width as a float

## textLeading()
`textLeading()`
line height

## textMode()
`textMode()`
texture map or vecor geometry. MODEL or SHAPE

## textSize()
`textSize()`

## text()
`text(content, x, y)`
prints the content



# 2D Translation

## rotate()
`rotate(theta)`
Measured in radians.

## radians()
`radians(degrees)`
Translates degrees to radians.

## degrees()
`degrees(radians)`
Translates radians to degrees.

## pushMatrix()
`pushMatrix()`
Saves current position of the coordinate system into a stack

## translate()
`translate(position)`
e.g. CENTER or x, y. Moves the coordinate system that many units right and down.

The coordinate system is restored to its original state (origin at the upper left of the window, no rotation, and no scaling) every time that the draw() function is executed.

## popMatrix()
`popMatrix()`
Restores the coordinate system to the pre-translated location in the stack.

## scale()
`scale(factor)`
`scale(xDimension, yDimension)`



# 3D Translation

## translate()
`translate(x, y, z)`

## scale()
`scale(x, y, z)`

## rotateX(), rotateY(), rotateZ()
`rotateX(radians)`



# PShapes

Acts as a variable to store the color and dimensions of a shape.

Can improve memory efficiency by creating a Vertex Buffer Object if
included within a class.

## createShape()
Initializes a PShape object.

Built in options: ELLIPSE, RECT, ARC, TRIANGLE, SPHERE, BOX, LINE,
GROUP, POINT, LINE, TRIANGLE_FAN, TRIANGLE_STRIP, QUAD, QUAD_STRIP

Using GROUP allows you to add several child shapes to one shape.

## shape()
Displays a PShape

## loadShape()
Load a shape from svg(2d) or obj(3d)

## PShape Methods

### (group)#addChild()
Add a child shape to a group

### beginShape()

### endShape()
`endShape(CLOSE)`

### setStroke()
Accepts a color value, e.g. `color(255)`,
a boolean to turn on or off,
or an integer to set the stroke for a specific vertex, e.g.
`setStroke(i, color(255, 0, 0))`

### setStrokeWeight()

### setFill()
Accepts a color value, boolean, and/or integer.

### beginContour()
Knocks out the inside of another shape.

### endContour()
Knocks out the inside of another shape.

### getVertexCount()
Get the total number of vertices in the shape.

### getVertex()
Access vertex by index.

### setVertex()
`s.setVertex(index, x, y);

## PShape examples

```java
PShape rectangle;

void setup() {
  size(640, 360, P2D);
  rectangle = createShape(RECT, 0, 0, 100, 50);
  rectangle.setStroke(color(255));
  rectangle.setStrokeWeight(4);
  rectangle.setFill(color(127));
}

//////////////////

class Star {
  PShape s;
  float x, y;
}

Star() {
  s = createShape();
  s.beginShape();
  // etc.
}
```



# P3D

To set it up, just pass it into the `background()` method like this:
`background(300, 300, P3D0)`.

## translate()
`translate(0, 0, z); z++;`

## rotateX(), rotateY(), rotateZ()
Takes radians as an argument
`rotateZ` is equivalent to `rotate` in 2D mode.

## box()
`box(size)`

## sphere()
`sphere(size)`

## Custom Shapes
`beginShape()`
`vertex(x, y, z)`
`vertex(x, y, z)`
`vertex(x, y, z)`
`endShape()`

## texture()
Use texture inside of `beginShape()` with a loaded image to make it the
texture of your 3D object.

## lights()
Makes things look 3D-er.

## ambientLight()
Even lighting

## directionalLight()
`directionalLight(r, g, b, x, y, z)`

## spotLight()
Like directional light, but with more specificity.
`spotLight(r, g, b, x1, y1, z1, x2, y2, z2, theta, c)`
vertex1 = light location
vertex2 = light direction
theta = cone angle
c = concentration

## pointLight()
`pointLight(r, g, b, x, y, z)`
A spotlight with a 180 degree cone.

## perspective()
Turns on foreshortening mode (default).
Takes some args I don't understand:
```
float fov = PI/3.0;
float cameraZ = (height/2.0) / tan(fov/2.0);
perspective(fov, float(width)/float(height), cameraZ/2.0, cameraZ*2.0);
```

## ortho()
Turns on orthographic perspective mode (qbert).

## camera()
Simulates camera movements when args are given as a variable.
`camera(x1, y1, z1, x2, y2, z2, x3, y3, z3)`
vertex1 = eye position
vertex2 = scene center
vertex3 = upwards axis
camera(width/2, height/2, (height/2) / tan(PI/6), width/2, height/2, 0, 0, 1, 0);
