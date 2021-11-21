import java.io.*;
public class MultiArray {
    public static void main(String args[]) throws IOException {
        int i, roll[] = new int[5];
        String s[] = new String[5];

        for (i = 0; i < 5; i++) {
            System.out.print("\nEnter Roll [" + i + "] = ");
            BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
            s[i] = BR.readLine();
            roll[i] = Integer.parseInt(s[i]);
        }
        System.out.print("\nOutput Roll -------------------");
        for (i = 0; i < 5; i++) {
            System.out.print("\nRoll [" + i + "] = " + roll[i]);
        }
    }
}
