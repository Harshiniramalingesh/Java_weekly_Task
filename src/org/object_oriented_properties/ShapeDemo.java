package org.object_oriented_properties;

class Shape {
    double area() {

        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {

        this.radius = radius;
    }

    @Override
    double area() {

        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    double side;

    Square(double side) {

        this.side = side;
    }

    @Override
    double area() {

        return side * side;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(2);
        shapes[1] = new Square(4);
        shapes[2] = new Circle(3);

        double totalArea = 0;

        for (Shape s : shapes) {
            System.out.println(s.area());
            totalArea += s.area();
        }

        System.out.println("Total Area = " + totalArea);
    }
}

