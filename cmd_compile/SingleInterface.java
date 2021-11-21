interface StudentInformation {
    static final int Roll = 205;
    static final String Name = "Jayed";
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
        getMark();
        System.out.println("Mark is: " + Mark);
    }
}
public class SingleInterface{
    public static void main(String args[]) {
        StudentResult R = new StudentResult();
        R.display();
        R.showMark();
    }
}