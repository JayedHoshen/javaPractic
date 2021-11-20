import java.io.*;
public class DoWhile {
    public static void main(String args[]) throws IOException {
        int n, r;
        String s;

        BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter the Number = ");
        s = BR.readLine();
        n = Integer.parseInt(s);

        System.out.print("The Number Reverse Order is = ");
        do{
            r = n % 10; 
            System.out.print(" " + r);
            n = n / 10;
        }while(n != 0);
    }
}
