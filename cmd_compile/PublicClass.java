// public and protected class both are same

class StudentIn {
    public int Roll;
    public String Name;
    public float Mark;
    public void GetData() {
        Roll = 96002;
        Name = "Jayed";
        Mark = 85.25F;
    }

    public void Display() {
        System.out.println("Roll is: " + Roll);
        System.out.println("Name is: " + Name);
        System.out.println("Mark is: " + Mark);
    }
}

public class PublicClass {
    public static void main(String args[]) {
        StudentIn s = new StudentIn();
        s.GetData();
        s.Display();
    }
}