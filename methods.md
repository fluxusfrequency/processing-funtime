# Processing Methods



# Utility

## setup()
Runs the code before the draw cycle begins.

## draw()

# Shapes

## point()
`point(x, y)`

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

## vertex
`vertex(x, y)`

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

## pushMatrix()
`pushMatrix()`
Saves current position of the coordinate system

## translate()
`translate(position)`
e.g. CENTER or x, y. Moves the coordinate system that many units right and down.

## popMatrix()
`popMatrix()`
Restores the coordinate system to the pre-translated location
