import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String answer2 = "y";
        Scanner keyboard = new Scanner(System.in);
        while(answer2.equalsIgnoreCase("y")){
        int num, remainder, i = 2;
        boolean flag = false;
        System.out.println("Would you like to generate a random number or input a number? (R/I)");
        String answer = keyboard.next();
        Random r = new Random();
        int x = 1 + r.nextInt(250);
        if (answer.equalsIgnoreCase("r")) {
            while (i <= x / 2) {
                // condition for nonprime number
                if (x % i == 0) {
                    flag = true;
                    break;
                }
                ++i;
            }
            if (flag) {
                System.out.println(x + " is not a prime number.");

            } else {
                System.out.println(x + " is a prime number.");
            }
        } else if (answer.equalsIgnoreCase("i")) {
            System.out.println("Please enter a number: ");
            num = keyboard.nextInt();
            if (num == 0 || num == 1) {
                System.out.println(num + " is not prime number");
            } else {
                while (i <= num / 2) {
                    // condition for nonprime number
                    if (num % i == 0) {
                        flag = true;
                        break;
                    }
                    ++i;
                }
                if (flag) {
                    System.out.println(num + " is not a prime number.");

                } else {
                    System.out.println(num + " is a prime number.");
                }
            }
        }
        System.out.println("Would you like to try again? (Y/N)  ");
        answer2 = keyboard.next();
        }
    }

    }



