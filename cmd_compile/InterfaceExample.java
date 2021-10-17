interface StudentInformation {
    static final int Roll = 205;
    static final String Name = "Mitali";
    void display();
}
class StudentResult implements StudentInformation {
    public float Mark;
    public void display(){
        System.out.println("Roll is: " + Roll);
        System.out.println("Name is: " + Name);
    }
    public void getMark() {
        Mark = 85.55f;
    }
    public void showMark() {
        System.out.println("Mark is: " + Mark);
    }
}
public class InterfaceExample{
    public static void main(String args[]) {
        StudentResult R = new StudentResult();
        R.display();
        R.getMark();
        R.showMark();
    }
}