import java.io.*;

class StudentInfo{
    int Roll;
    String Name = new String();
    void getName() {
        Name = "Tahsin";
        System.out.println("Name is: " + Name);
    }
}

class Academic extends StudentInfo{
    int Roll;
    void getRoll() {
        Roll = 105;
        System.out.println("Roll is: " + Roll);
    }
}

class Result extends StudentInfo {
    float Mark;
    void getMark() {
        Mark = 90.25f;
        System.out.println("Mark is: " + Mark);
    }
}

public class Inheritance {
    public static void main(String args[]) {
        Academic A = new Academic();
        A.getRoll();
        StudentInfo S = new StudentInfo();
        S.getName();
        Result R = new Result();
        R.getMark();
    }
}
