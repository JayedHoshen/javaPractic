interface student{
    String Name = "Jayed"; // static final memeber
}
interface exam{
    int Roll = 302; // static final member
    void display(); // interface method decleared
}

class Resul implements student, exam {
    public float Mark;
    public void display() { // interface method defined
        System.out.println("Roll is: " + Roll);
        System.out.println("Name is: " + Name);
    }
    public void getMark() { // own method defined
        Mark = 98.25f;
    }
    public void showMark() { // own method defined
        System.out.println("Mark is: " + Mark);
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Resul R = new Resul();
        R.display(); // calling interface method
        R.getMark(); // calling derived class method
        R.showMark(); // calling derived class method
    }
}
