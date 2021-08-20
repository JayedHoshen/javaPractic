public class Hello {
    public static void main(String[] args) {
        System.out.println("Vs Code is Awesome....");

        greeting("Jayed Hoshen");
        greeting("Mj");
    }

    public static void greeting(String name) {
        System.out.println("Welcome " + name);
    }

    public static int sqr(int x) {
        return x*x;
    }
}