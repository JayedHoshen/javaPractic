import java.io.*;
public class Continue {
    public static void main(String args[]) throws IOException {
        int n = 0;
        String s;
        
        for (; ;) {
            BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));

            System.out.print("Enter a Positive number = ");
            s = BR.readLine();
            n = Integer.parseInt(s);

            if (n <= 0) continue;
            else break;
        }
        System.out.println("You have enterd: " + n);
    }
}
