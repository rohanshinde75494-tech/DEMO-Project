package OOP;

public class lec13 {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollno);
        System.out.println(s1.college);
    }
}
class Student{
    String name;
    int age;
    int rollno;
    String college;
}
