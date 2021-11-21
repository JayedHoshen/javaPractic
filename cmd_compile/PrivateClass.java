class StudentExample {
    private int Roll;
    private String Name;
    private float Mark;
    private void getData() {
        Roll = 201;
        Name = "Jayed";
        Mark = 83.37f;
    }
    void displayData() {
        System.out.println("Roll: " + Roll);
        System.out.println("Name: " + Name);
        System.out.println("Mark: " + Mark);
    }
}

public class PrivateClass {
    public static void main(String args[]) {
        StudentExample s = new StudentExample();
        // s.getData()
        s.displayData();
    }
}
