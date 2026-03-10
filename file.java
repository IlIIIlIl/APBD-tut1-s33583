import java.util.Random;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("How many random numbers do you want? ");
        int count = scanner.nextInt();

        System.out.println("Here are your numbers:");
        for (int i = 0; i < count; i++) {
            int number = random.nextInt(101);
            System.out.println(number);
        }

        scanner.close();
    }
}
