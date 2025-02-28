import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("You selected Option 1.");
                System.out.println("Hello! Welcome!");
                if (number % 2 == 0) {
                    System.out.println(number + " is an Even number.");
                } else {
                    System.out.println(number + " is an Odd number.");
                }
                System.out.println("Exiting program. Goodbye!");
                break;

            case 2:
                System.out.println("You selected Option 2.");
                System.out.println("Hello! Welcome!");
                if (number % 2 == 0) {
                    System.out.println(number + " is an Even number.");
                } else {
                    System.out.println(number + " is an Odd number.");
                }
                System.out.println("Exiting program. Goodbye!");
                break;

            case 3:
                System.out.println("You selected Option 3.");
                System.out.println("Hello! Welcome!");
                if (number % 2 == 0) {
                    System.out.println(number + " is an Even number.");
                } else {
                    System.out.println(number + " is an Odd number.");
                }
                System.out.println("Exiting program. Goodbye!");
                break;

            default:
                System.out.println("Invalid choice! Exiting program.");
                break;
        }
        
        scanner.close();
    }
}
