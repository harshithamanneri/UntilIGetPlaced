import java.util.Scanner;
public class Negativestozero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a negative number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            while (number < 0) {
                System.out.println(number);
                number++;
            }
            System.out.println("Reached zero!");
        } else {
            System.out.println("Please enter a negative number.");
        }

        scanner.close();
    }
}