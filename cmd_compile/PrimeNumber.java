// 1 to n prime number with count
import java.io.*;
public class PrimeNumber{
    public static void main(String args[]) {
        int i, j, n, count = 0;
        String s;

        try{
            BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter Value of N = ");

            s = BR.readLine();
            n = Integer.parseInt(s);
            
            System.out.print("Seris of Prime number (1 to " + n + ") is = ");

            for (i = 2; i <= n; i++) {
                for (j = 2; j <= i; j++) {
                    if (i % j == 0) break;
                }
                if (i == j) {
                    System.out.print(" " + i +" ");
                    count++;
                }
            }
            System.out.println("\n------: 1 to " + n + " : Total Prime: " + count);
        }
        catch (Exception E) {}


    }
}
