import java.io.*;
import java.lang.Math;

public class QuadEquation {
    public static void main(String[] args) throws IOException {
        double a, b, c, d, root, root1, root2;
        String s1, s2, s3;
        BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter value of a, b, c ---- ");
        s1 = BR.readLine();
        s2 = BR.readLine();
        s3 = BR.readLine();
        a = Double.parseDouble(s1);
        b = Double.parseDouble(s2);
        c = Double.parseDouble(s3);

        d = b * b - 4 * a * c;
        if (d > 0.0) {
            root1 = (-b + Math.sqrt(d)) / 2 * a;
            root2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.println("Root1 = " + root1 + "\nRoot2 = " + root2);
        }
        else if (d == 0.0) {
            root = -b / 2 * a;
            System.out.println("Root1 & Root2 = " + root);
        }
        else {
            System.out.println("Roots are not possible.");
        }
    }
}
