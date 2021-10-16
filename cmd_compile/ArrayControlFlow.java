import java.io.*;
public class ArrayControlFlow {
    public static void main(String args[]) throws IOException {
        int i, length, max;
        int ara[] = {41, 15, 88, 16, 10, 21, 25, 50, 65, 45};

        length = 10;
        max = ara[0];

        for (i = 1; i < length; i++){
            if (ara[i] > max) {
                max = ara[i];
            }
        }
        
        System.out.println("Maximum number is  " + max);
    }
}
