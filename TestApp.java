
class Student {

    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    int getRollNo() {
        return rollNo;
    }
}

class Test extends Student {

    int sub1, sub2;

    void setMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    void getMarks() {
        System.out.println("Subject 1 marks=" + sub1);
        System.out.println("Subject 2 marks=" + sub2);
    }
}

interface Sports {

    int sMarks = 10;

    void set();
}

class Result extends Test implements Sports {

    public void set() {
        System.out.println("Sports marks=" + sMarks);
    }

    void displayResult() {
        System.out.println("Roll number=" + getRollNo());
        getMarks();
        set();
        int total = sub1 + sub2 + sMarks;
        System.out.println("Total marks=" + total);
    }
}

public class TestApp {

    public static void main(String args[]) {
        Result r = new Result();
        r.setRollNo(24);
        r.setMarks(75, 86);
        r.displayResult();
    }
}
