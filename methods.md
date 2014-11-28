# Processing Methods

## setup()
Runs the code before the draw cycle begins.

## draw()

## points()
`point(x, y)`

## lines()
`line(x1, y1, x2, y2)`
Draws from point 1 to point 2.

## rectangles()
`rect(x, y, width, height)`
x, y is the top left corner, width and height span out from there.

`rectMode(CENTER)`
x, y is the center.
Width and height span out from that center point

`rectMode(CORNERS)`
`rect(x1, y1, x2, y2)`
Point 1 is the top left, point 2 is the bottom right.

## ellipses()
Work the same as rectangles, where the rectangle that would be there is
the bounding box of the ellipse.

## arcs()
Section of an ellipse.
`arc(x, y, width, height, start, stop`
The first four parameters are the same as `ellipse`. The start
and stop angles are measured in radians. (0 to 360 degrees, with
0 being due east).
