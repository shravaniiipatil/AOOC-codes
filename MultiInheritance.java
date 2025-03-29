import java.util.*;

class Student {

    int roll_no;

    void setRollNo(int r) {
        roll_no = r;
    }

    void displayRollNo() {
        System.out.println("Roll Number = " + roll_no);
    }
}

class Test extends Student {

    int sub1, sub2;

    void setSub(int s1, int s2) {
        sub1 = s1;
        sub2 = s2;
    }

    void displayMarks() {
        System.out.println("Subject 1 Marks = " + sub1);
        System.out.println("Subject 2 Marks = " + sub2);
    }
}

class Result extends Test {

    void displayResult() {
        int total = sub1 + sub2;
        System.out.println("Total Marks = " + total);
    }
}

public class MultiInheritance {

    public static void main(String[] args) {
        Result r = new Result();
        r.setRollNo(24);
        r.setSub(75, 86);
        r.displayRollNo();
        r.displayMarks();
        r.displayResult();
    }
}
