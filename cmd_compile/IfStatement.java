import java.io.*;
public class IfStatement{
    public static void main(String args[]) {
        int age = 0;
        String s;
        try{
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);

            System.out.print("Enter your Age = ");

            s = br.readLine();
            age = Integer.parseInt(s);

            if(age <= 0) {
                System.out.println("You have not borned yet!");
            }
            if(age > 0 && age <= 12) {
                System.out.println("You are a child");
            }
            if (age > 12 && age <= 19) {
                System.out.println("You are a teen ager");
            }
            if (age > 19 && age <= 40 ) {
                System.out.println("You are Young");
            }
            if (age > 40) {
                System.out.println("Wish your long life");
            }
        }
        catch(Exception E){}
    }
}