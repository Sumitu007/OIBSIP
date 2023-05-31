import java.util.Scanner;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int number = r.nextInt(100) + 1;
//        System.out.println(number);
        int attempt = 0;
        int round = 7;
        System.out.println("Hello........................What is your name?");
        String name = sc.nextLine();
        System.out.println("Welcome To the game!!!!!!!!!!!!!!! "+ name);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Guess the number between 1-100");
        System.out.println("You have "+ round + " attempts");
        System.out.println("---------------------------------------------------------------");
        int n = sc.nextInt();
            do {
                if (n < number)
                    System.out.println("Please choose Higher number");
                else if (n > number)
                    System.out.println("Please choose lower number");
                else
                    break;
                round --;
                if (round == 0)
                    break;
                System.out.println("You have " + round + " attempts remaining");
                System.out.println("---------------------------------------------------------------");
                attempt++;
                n = sc.nextInt();
            } while (n != number);
        if (n == number) {
            attempt++;
            System.out.println("You guessed it right with " + attempt + " No. of attempts");
        }
        if (round == 0) {
            System.out.println("!!!!!!!!You have used all your attempts and you lose the game!!!!!!");
            System.out.println("The correct answer was " + number);
        }

    }
}