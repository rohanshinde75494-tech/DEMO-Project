public class lec17pt2 {
    public static void main(String[] args) {
        car c=new fuelcar();
          c.brake();
          c.accelerate();
          c.start();
        
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
