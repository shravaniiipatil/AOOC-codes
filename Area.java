
import java.util.*;

class Area {

    double length;
    double breadth;
    double area;

    Area() {
        length = 0;
        breadth = 0;
    }

    void setDim() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Rectangle: ");
        length = sc.nextInt();
        System.out.println("Enter breadth of Rectangle: ");
        breadth = sc.nextInt();
    }

    void getArea() {
        area = length * breadth;
        System.out.println("Area of Rectangle= " + area);
    }

    public static void main(String args[]) {
        Area ob = new Area();
        ob.setDim();
        ob.getArea();
    }
}
