
import java.util.Scanner;

interface Stack {

    int SIZE = 5;

    void push(int ele);

    void pop();

    void display();

    boolean overflow();

    boolean underflow();
}

class IntegerStack implements Stack {

    int[] stk = new int[SIZE];
    int top = -1;

    public void push(int ele) {
        if (overflow()) {
            System.out.println("Stack is Full");
        } else {
            top++;
            stk[top] = ele;
            System.out.println("Element added to stack: " + ele);
        }
    }

    public void pop() {
        if (underflow()) {
            System.out.println("Stack is Empty");
        } else {
            int ele = stk[top];
            top--;
            System.out.println("Popped element: " + ele);
        }
    }

    public void display() {
        if (underflow()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stk[i]);
            }
        }
    }

    public boolean overflow() {
        return top == SIZE - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}

public class StackTest {

    public static void main(String args[]) {
        IntegerStack s1 = new IntegerStack();
        Scanner s = new Scanner(System.in);
        int opt, val;

        while (true) {
            System.out.println("\n1. PUSH ");
            System.out.println("2. POP ");
            System.out.println("3. DISPLAY STACK ");
            System.out.println("4. EXIT ");
            System.out.print("Enter Your Option: ");
            opt = s.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("Enter the value to be added to the stack: ");
                    val = s.nextInt();
                    s1.push(val);
                    break;

                case 2:
                    s1.pop();
                    break;

                case 3:
                    s1.display();
                    break;

                case 4:
                    System.out.println("Exit");
                    s.close();
                    return;

                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}
