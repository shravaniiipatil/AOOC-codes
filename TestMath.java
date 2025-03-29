import packmath.MathOperations;

class TestMath 
{
    public static void main(String args[]) 
    {
        MathOperations obj = new MathOperations();
        System.out.println("Addition: " + obj.add(10, 5));
        System.out.println("Subtraction: " + obj.sub(10, 5));
        System.out.println("Multiplication: " + obj.mul(10, 5));
        System.out.println("Division: " + obj.div(10, 5));
    }
}
