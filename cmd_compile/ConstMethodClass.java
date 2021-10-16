import java.io.*;

class Student {
    int Roll;
    String Name;
    float Mark;
    public Student(){
        Roll = 95;
        Name = "Munna";
        Mark = 93.75f;
        System.out.println("Roll is: " + Roll);
        System.out.println("Name is: " + Name);
        System.out.println("Mark is: " +  Mark);
    }
}

public class ConstMethodClass {
    public static void main(String args[]) {
        Student s = new Student();
    }
}
