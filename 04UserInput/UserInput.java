import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("What is your age? ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello " + name + " your are " + age + " years old " + " you like " + food);

        scanner.close();

    }

}