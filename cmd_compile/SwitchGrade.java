/*
    ======= Input your marks than calculated your GPA (out of 5) =====
    Author: Jayed Hoshen
    Source Code: https://github.com/JayedHoshen/javaPractic/tree/master/cmd_compile
*/

import java.io.*;
public class SwitchGrade{
    public static void main(String args[]) throws IOException{
        int n, grade;
        String s;

        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your Mark (< 100) = ");

        s = BR.readLine();
        n = Integer.parseInt(s);

        grade = n / 10;

        switch(grade) {
            case 9:
            case 8:
                System.out.println("A+");
                break;
            case 7:
                System.out.println("A");
                break;
            case 6:
                System.out.println("A-");
                break;
            case 5:
                System.out.println("B");
                break;
            case 4:
                System.out.println("C");
                break;
            case 3:
            case 2:
            case 1:
                System.out.println("F");
                break;
            default:
                System.out.println("Please, input correct mark.");
        }
    }
}