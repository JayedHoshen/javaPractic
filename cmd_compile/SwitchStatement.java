import java.io.*;
public class SwitchStatement {
    public static void main(String args[]){
        int year;
        String s;
        try{
            BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your Academic year (From 1 to 4): ");
            s = BR.readLine();
            year = Integer.parseInt(s);

            switch (year){
                case 1:
                    System.out.println("You are a student of first year.");
                    break;
                case 2:
                    System.out.println("You are a student of second year.");
                    break;
                case 3:
                    System.out.println("You are a student of third year.");
                    break;
                case 4:
                    System.out.println("You are a student of forth year.");
                    break;
                default:
                    System.out.println("Wrong input.");
            }
        }
        catch(Exception E){}
    }    
}
