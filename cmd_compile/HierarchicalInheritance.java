class Student{
    String Name;
    void getName() {
        Name = "jayed";
        System.out.println("Name is: " + Name);
    }
}
class Academic extends Student{
    int Roll;
    void getRoll() {
        Roll = 403;
        System.out.println("Roll is: " + Roll);
    }
}
class Result extends Student{
    float Mark;
    void getMark() {
        Mark = 87.42f;
        System.out.println("Mark is: " + Mark);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Result A = new Result();
        Academic R = new Academic();
        R.getRoll();
        A.getName();
        A.getMark();
    }
}
