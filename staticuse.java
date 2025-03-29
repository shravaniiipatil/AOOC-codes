
class staticuse {

    static int a = 3;
    static int b;

    static void method(int x) {
        System.out.println("x= " + x);
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        b = a * 4;
    }

    static {
        System.out.println("Static block initialized");
    }

    public static void main(String args[]) {
        method(4);
    }
}
