import java.io.*;
public class ElseIfStatement {
    public static void main(String args[]) {
        int age;
        String s;
        try{
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);

            System.out.print("Enter your age: ");
            s = br.readLine();
            age = Integer.parseInt(s);

            if (age <= 0) {
                System.out.println("You have not borned yet !");
            }
            else if (age > 0 && age <= 12) {
                System.out.println("You are a child.");
            }
            else if (age > 12 && age <= 19) {
                System.out.println("You are a teen agar.");
            }
            else if (age > 19 && age <= 40) {
                System.out.println("You are young.");
            }
            else if (age > 40){
                System.out.println("Wish you long life.");
            }
        }
        catch(Exception E){}
    }
}
