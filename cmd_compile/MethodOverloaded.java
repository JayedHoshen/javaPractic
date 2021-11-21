class Over{
    int cal(int x, int y) {
        int z;
        z = x + y;
        System.out.println("Using summation Method");
        System.out.println("Result is: " + z);
        return 0;
    }
    float cal(float m1, float m2) {
        float mark;
        mark = m1 + m2;
        System.out.println("Using Float Method");
        System.out.println("The Mark is: " + mark);
        return 0;
    }
    int cal(int x) {
        System.out.println("Using Input/Output Method");
        System.out.println(x);
        return 0;
    }
}
public class MethodOverloaded {
    public static void main(String args[]) {
        Over s = new Over();
        s.cal(35.25f, 25.35f);
        s.cal(44);
        s.cal(23, 20);
    }
}
