import java.util.Random;

public class RandomValues {

    public static void main(String[] args) {
        Random random = new Random();
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        // generating Random 3-digit values
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(900) + 100;  // generates a 3 digit number
          
            if (randomNumber < minValue) {
                minValue = randomNumber;
            }

            if (randomNumber > maxValue) {
                maxValue = randomNumber;
            }

            System.out.println("Random Number: " +randomNumber);
        }

        System.out.println("Minimum Value: " + minValue);
        System.out.println("Maximum Value: " + maxValue);
    }
}
