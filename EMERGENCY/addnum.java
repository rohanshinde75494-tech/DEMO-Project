public class addnum {
     public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Sum = " + (a + b));

        System.out.println("rohan");

        int[] arr = {3,5,6,7,34,21,45,3,22};
        for(int ele : arr){
            System.out.print(ele + " ");
        }

        System.out.println(" ");
        for(int i = 0 ; i < arr.length-1; i++){
            System.out.print("arr elements : " + " " + i);
        }

        System.out.println(" ");

        int i = 0;
        while(i<arr.length-1){
            System.out.println("Array ele: " +" " + i);
            i ++;
        }
    }
}
