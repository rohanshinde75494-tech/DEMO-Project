public class inheritance {
    public static void main(String[] args) {
        enggstudent s1=new enggstudent();
        s1.markatt();
        s1.labatt();

    }
}
class student{
    void markatt()
    {
        System.out.println("Class attended");
    }
}
class enggstudent extends student{
    void labatt()
    {
        System.out.println("Lab atttended");
    }
}
