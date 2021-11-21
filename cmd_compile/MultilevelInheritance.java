class StudentClass{
    int Roll;
    String Name = new String();
    void getData(){
        Roll = 201;
        Name = "jayed";
    }
    void displayData() {
        System.out.println("Inside Student Class---");
        System.out.println("Roll is: " + Roll);
        System.out.println("Name is: " + Name);
    }
}
class Exam extends StudentClass{
    float Mark;
    void getData() {
        Mark = 87.34f;
    }
    void displayData() {
        System.out.println("Inside Exam Class---");
        System.out.println("Mark is: " + Mark);
    }
}
class Result extends Exam{
    StudentClass s = new StudentClass();
    Exam e = new Exam();
    void getData() {
        s.getData();
        e.getData();
    }
    void displayData() {
        s.displayData();
        e.displayData();
    }
}

public class MultilevelInheritance {
    public static void main(String args[]) {
        Result R = new Result();
        R.getData();
        R.displayData();
    }
}
