abstract class Student{
    public int Roll;
    public String Name;
    abstract void getData();
}
class Result extends Student{
    float Mark;
    void getData() {
        Roll = 501;
        Name = "Jayed";
        Mark = 90.28f;
    }
    void displayData() {
        System.out.println("Roll is: " + Roll);
        System.out.println("Name is: " + Name);
        System.out.println("Mark is: " + Mark);
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Result R = new Result();
        R.getData();
        R.displayData();
    }
}
