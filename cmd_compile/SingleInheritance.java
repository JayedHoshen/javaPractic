class StudentSuperClass{
    int Roll;
    String Name = new String();
}
class Result extends StudentSuperClass{
    float Mark;
    void getData() {
        Roll = 105;
        Name = "Jayed";
        Mark = 87.52f;
    }
    void displayData() {
        System.out.println("Roll is: " + Roll);
        System.out.println("Name is: " + Name);
        System.out.println("Mark is: " + Mark);
    }
}
public class SingleInheritance {
    public static void main(String args[]) {
        Result R = new Result();
        R.getData();
        R.displayData();
    }
}
