package basic;

import java.util.SplittableRandom;

class Student1 {
    int rno;
    String name;
    float marks = 90;
    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }
    void changeName(String name) {
        this.name = name;
    }
    Student1 (Student1 other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
    Student1() {
        this(13, "default person", 100.0f);
    }
    Student1(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
class Student5 {
    int id;
    String name;
    int age;
    Student5() {
        System.out.println("hello");
    }
    Student5(int id, String name) {
        this.id = id;
        this.name = name;
    }
    Student5(int i,  String n, int a) {
        this();
        id = 1;
        name = n;
        age = a;
    }
    void display() {
        System.out.println(id+" "+name+" "+age);
    }
}

public class this_constructor {
    public static void main(String[] args) {
        Student1 kunal = new Student1(15, "kunal kushwaha", 85.4f);
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
        Student1 random = new Student1(kunal);
        System.out.println(random.name);
        Student1 random2 = new Student1();
        System.out.println(random2.name);
        Student1 one = new Student1();
        Student1 two = one;
        one.name = "Something something";
        System.out.println(two.name);
    }
}
