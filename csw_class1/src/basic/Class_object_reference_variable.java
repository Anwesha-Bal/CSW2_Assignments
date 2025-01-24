package basic;
class Student {
    int roll;
    String name;
    void details(int a, String b) {
        roll=a;
        name=b;
    }
    void print() {
        System.out.println(roll);
        System.out.println(name);
    }
}
public class Class_object_reference_variable {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.details(1, "so?");
        s1.print();
    }
}
