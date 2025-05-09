interface Shape {

    void area();
}

class Rectangle implements Shape {

    int length, width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    public void area() {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle implements Shape {

    int base, height;

    Triangle(int b, int h) {
        base = b;
        height = h;
    }

    public void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

public class Displayarea {

    public static void main(String args[]) {
        Rectangle r = new Rectangle(5, 4);
        Triangle t = new Triangle(6, 3);
        r.area();
        t.area();
    }
}
