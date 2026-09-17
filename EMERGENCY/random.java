import java.util.Random;

public class random {
    public static void main(String[] args) {

        Random r = new Random();

        int number = r.nextInt(100) + 1;

        System.out.println("Random number = " + number);
    }
}