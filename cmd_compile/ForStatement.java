import java.io.*;
public class ForStatement {
    public static void main(String args[]) {
        int i, n, sum = 0;
        String s;
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter Value of N (>=1): ");

            s = br.readLine();
            n = Integer.parseInt(s);

            System.out.println("1+2+3+4+...........+n");
            System.out.println("---------------------");
            
            for (i = 1; i <= n; i++){
                sum = sum + i;
                System.out.println(i + "\t" + sum);
            }
            System.out.println("---------------------");
            System.out.println("Sum is " + sum);
            System.out.println("---------------------");
        }
        catch(Exception E){}
    }
}
