
abstract class Shape {

    double dim1, dim2;

    Shape(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }

    abstract double area();
}

class Rectangle extends Shape {

    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Shape {

    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        return 0.5 * dim1 * dim2;
    }
}

public class AbstractDemo {

    public static void main(String args[]) {
        Shape rectangleObj = new Rectangle(5, 10);
        Shape triangleObj = new Triangle(10, 20);

        System.out.println("Rectangle Area = " + rectangleObj.area());
        System.out.println("Triangle Area = " + triangleObj.area());
    }
}
