class StudentInform{
    int Roll;
    String Name;
    float Mark;

    StudentInform (int R, String N, float M) { // Argument Constructor Method
        Roll = R;
        Name = N;
        Mark = M;
    }
    StudentInform (StudentInform s) { // copy Constructor
        Roll = s.Roll; // copy constructor define
        Name = s.Name;
        Mark = s.Mark;
    }
    void displayData() {
        System.out.println("Roll is: " + Roll);
        System.out.println("Name is: " + Name);
        System.out.println("Mark is: " + Mark);
    }
}
public class ConsOverload {
    public static void main(String args[]) {
        StudentInform s1 = new StudentInform(101, "Jayed", 85.27f);
        System.out.println("Record of S1 -----");
        s1.displayData();

        StudentInform s2 = new StudentInform(s1); // copy constructor
        System.out.println("\nRecord of S2 ---------");
        s2.displayData();
        System.out.println("Both are same......");
    }
}
