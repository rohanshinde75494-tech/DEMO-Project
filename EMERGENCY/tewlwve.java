

public class tewlwve {
    public static void main(String[] args) {
        System.out.println("hello world");
    
    int n=5;
    for(int i=0;i<5;i++)
    {
        for(int j=i;j<n;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
     for(int i=0;i<5;i++)
    {
        for(int j=0;j<i+1;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
        for(int i=0;i<5;i++)
    {
        for(int k=0;k<n-i;k++)
        {
            System.out.print(" ");
        }
        for(int j=0;j<i+1;j++)
        {
            System.out.print("* ");
        }

        System.out.println();
    }
}
}
