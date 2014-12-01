# SOH CAH TOA

sin(theta) = opposite / hypotenuse
cos(theta) = adjacent / hypotenuse
tan(theta) = opposite / adjacent

tan(theta) = sin(theta) / cos(theta)

# Polar Coordinate System

Unit circle. Point is measures as (r, theta), where r is the radius of
the unit circle, and theta is the degree of rotation measured in
radians.

## Polar To Cartesian Coordinate Transformation Formulae

x = cos(theta) * radius
y = sin(theta) * radius

In processing:

float x = cos(radians(angle)) * radius;
float y = sin(radians(angle)) * radius;

## Radians To/From Degrees Conversion Formulae

theta = angle * pi / 180
angle = theta * 180 / pi

In processing:

theta = radians(angle);
angule = degrees(theta);
