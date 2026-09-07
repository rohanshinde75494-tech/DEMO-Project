public class lec17pt2 {
    public static void main(String[] args) {
        car c=new fuelcar();
          c.brake();
          c.accelerate();
          c.start();
          System.out.println();
          System.out.println();
          car ec=new ecar();
          ec.brake();
          ec.accelerate();
          ec.start();
        
    }
}
  interface car{
        void start();
           
        
         void accelerate();
         void brake();
    }
    class fuelcar implements car{
        public void start()
        {
            System.out.println("Car started");
        }
       public void accelerate(){
             System.out.println("Fuel car is accelerating");
        }
      public  void brake(){
            
        System.out.println("Fuel car is stopping");
        }
    }
     class ecar implements car{
         public void start()
        {
            System.out.println("Car started");
        }
        public void accelerate(){

             System.out.println("Electric car car is accelerating");
        }
       public void brake(){
            
        System.out.println("Electric car is stopping");
        }
    }

    


