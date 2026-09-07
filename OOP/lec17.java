public class lec17 {
    public static void main(String[] args) {
        car c=new fuelcar();
        c.accelerate();
        c.brake();
       car ec=new ecar();
       ec.accelerate();
       ec.brake();

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
    class ecar extends car{
         void accelerate(){
             System.out.println("Electric car car is accelerating");
        }
        void brake(){
            
        System.out.println("Electric car is stopping");
        }
    }

    

