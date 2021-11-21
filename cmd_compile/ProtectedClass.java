// public and protected class both are same

class StudentInf {
    protected int Roll;
    protected String Name;
    protected float Mark;
    protected void GetData() {
        Roll = 92;
        Name = "Jayed";
        Mark = 85.25F;
    }

    protected void Display() {
        System.out.println("Roll is: " + Roll);
        System.out.println("Name is: " + Name);
        System.out.println("Mark is: " + Mark);
    }
}

public class ProtectedClass {
    public static void main(String args[]) {
        StudentInf s = new StudentInf();
        s.GetData();
        s.Display();
    }
}

