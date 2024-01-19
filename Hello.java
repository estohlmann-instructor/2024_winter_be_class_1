import java.util.Scanner;

public class Hello {
    public static void main(String... args){
        System.out.println("Hello world");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your favorite color: ");
        String color = input.nextLine();

        System.out.print("Enter your favorite number: ");
        String favNum = input.nextLine();

        String random = color + " " + favNum;

        System.out.println();
        System.out.println("I like random things like this: " + random);
        System.out.println("Your favorite color happens to be: " + color);
    }
}
