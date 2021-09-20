import java.io.*;
public class FibonacciSeris {
    public static void main(String args[]) throws IOException {
        int f0 = 0, f1 = 1, i, f, n;
        String s;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter fibonacci seris last value (n) = ");
        s = in.readLine();
        n = Integer.parseInt(s);

        System.out.println("First" + n + " Fibonacci Numbers are --------");

        for (i = 1; i <= n; i++){
            f = f0 + f1;
            System.out.print(" " + f + " ");
            f1 = f0;
            f0 = f;
        }
    }
}
