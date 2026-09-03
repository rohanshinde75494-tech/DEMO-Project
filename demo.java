public class demo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="rohan";
        s1.age=21;
        s1.rollno=47;
        s1.college="GCOEY";
        s1.markatt();
        s1.print();
        
    }
}
class Student {
    String name;
    int age;
    int rollno;
    String college;
    void markatt()
    {
        System.out.println("Attendence marked by : "+name);
    }
    void print()
    {
        System.out.println(name+", "+age+ ", "+ rollno+", "+college+" ");
    }
}