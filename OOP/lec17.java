public class lec17 {
    public static void main(String[] args) {
        car c=new fuelcar();
        c.accelerate();
        c.brake();


    }
}
    abstract class car{
        void start(){
             System.out.println("Car is starting");
        }
        abstract void accelerate();
        abstract void brake();
    }
    class fuelcar extends car{
        void accelerate(){
             System.out.println("Fuel car is accelerating");
        }
        void brake(){
            
        System.out.println("Fuel car is stopping");
        }
    }
    

