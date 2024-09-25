import java.util.Random;

public class RandomNumbers {

    private Random random;

    public RandomNumbers() {
        random = new Random(1000);
    }
    public void generateRandomNumbers() {
        for (int i = 0; i < 50; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println("Случайное число " + (i + 1) + ": " + randomNumber);
        }
    }
    public static void main(String[] args) {

    }
}
