import java.io.*;
public class IfElseStatement {
    public static void main(String args[]) {
        int year = 0;
        String s;
        try{
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);

            System.out.print("Enter the year to be tested: ");
            s = br.readLine();
            year = Integer.parseInt(s);

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.println(year + " is a Lear Year.");
            }
            else {
                System.out.println(year + " is not a Leap year.");
            }
        }
        catch(Exception E){}
    }
}
