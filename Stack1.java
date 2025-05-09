import java.util.Scanner;
class Stack1 {
    int size;
    int[] stk;
    int top;
    Stack1(int s) {
        size = s;
        stk = new int[size];
        top = -1;
    }
    void push(int ele) {
        if (top == size - 1) {
            System.out.println("Stack is Full");
        } else {
            stk[++top] = ele;
            System.out.println("Element added to stack: " + ele);
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Popped element: " + stk[top--]);
        }
    }
    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stk[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int stackSize = s.nextInt();
        Stack1 s1 = new Stack1(stackSize);
        while (true) {
            System.out.println("\n1. PUSH ");
            System.out.println("2. POP ");
            System.out.println("3. DISPLAY STACK ");
            System.out.println("4. EXIT ");
            System.out.print("Enter Your Option: ");
            int opt = s.nextInt();
            switch (opt) {
                case 1:
                    System.out.print("Enter the value to be added to the stack: ");
                    int val = s.nextInt();
                    s1.push(val);
                    break;
                case 2:
                    s1.pop();
                    break;
                case 3:
                    s1.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    s.close();
                    return;
                default:
                    System.out.println("Invalid option! Please enter a number between 1 and 4.");
            }
        }
    }
}
