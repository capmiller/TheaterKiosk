import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageLimit = 21;

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= ageLimit)
            System.out.println("You receive a wristband.");

    }
}