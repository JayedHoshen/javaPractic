class SuperClass{
    int n;
    SuperClass() {
        n++;
    }
    public void getData() {
        System.out.println("It is SuperClass--");
        System.out.println("n = " + n);
    }
}
class SubClass extends SuperClass{
    int n;
    SubClass() {
        n++;
    }
    public void getData() {
        System.out.println("It is SubClass ---");
        System.out.println("n = " + n);
    }
}

public class OverridenMethod {
    public static void main(String[] args) {
        SuperClass sp = new SuperClass();
        SubClass sb = new SubClass();
        sp.getData();
        sb.getData();
    }
}
