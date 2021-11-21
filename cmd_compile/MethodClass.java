class MethodExample{
    float mark1, mark2, tutorial, total, Gtotal;    

    float getMark (float m1, float m2) {
        mark1 = m1;
        mark2 = m2;
        total = m1 + m2;
        return total;
    }
    void displayData() {
        tutorial = 10;
        Gtotal = total + getMark(35, 60);
        System.out.println("Tutorial Mark is: " + tutorial);
        System.out.println("Mark1 is: " + mark1);
        System.out.println("Mark2 is: " + mark2);
        System.out.println("Grand total is: " + Gtotal);
    }
}

public class MethodClass {
    public static void main(String args[]) {
        MethodExample s = new MethodExample();
        s.displayData();
    }
}
