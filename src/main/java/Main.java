import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        String userInput = getStringInput("What's your name?");
        if (userInput.equals("Alice")){
            System.out.println("Hello Alice");
        }
        else if (userInput.equals("Bob")){
            System.out.println("Hello Bob");

        }
         else {
            System.out.println("Go away " + userInput);
        }
    }
    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }
}
