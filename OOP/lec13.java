//package OOP;

public class lec13 {
    public static void main(String[] args) {
        Student s1=new Student("mohan",20,101,"peda");
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
    Student( String a,int n,int b,String c)
    {
        name=a;
        age=n;
        rollno=b;
        college=c;

    }
}
