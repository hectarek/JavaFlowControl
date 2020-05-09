package FlowControlProject;

import java.util.concurrent.TimeUnit;
import java.util.*;

public class AsciiChars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int random1 = (int) (Math.random() * 75);
        int random2 = (int) (Math.random() * 65);

        printNumbers();
        printLowerCase();
        printUpperCase();

        System.out.println(" ");

        // Ask questions to get use information.

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Hello, " + name);

        System.out.println("Would you like to continue with the interactive portion? y/n");
        String answer = input.nextLine().trim();

        while (answer != null) {

            if (answer.equals("y") || answer.equals("Y") || answer.equals("Yes") || answer.equals("yes")) {
                // Interactive portion
                System.out.println("Do you have a red car? (yes/no)");
                String redCar = input.nextLine();

                System.out.println("What is the name of a favorite pet?");
                String petName = input.nextLine();

                System.out.println("What is the age of a favorite pet?");
                int petAge = input.nextInt();

                System.out.println("What is your lucky number?");
                int lucky = input.nextInt();

                System.out.println("Do you have a favorite quarterback? (yes/no)");
                String answerQB = input.nextLine();
                answerQB = input.nextLine();

                int numQB = 0;

                if (answerQB.equals("yes") || answerQB.equals("Yes")) {
                    System.out.println("What is their jersey number?");
                    numQB = input.nextInt();
                }

                System.out.println("What is the two-digit model year of your car? (ex. 2013 = 13)");
                int carNum = input.nextInt();

                System.out.println("What is the first name of your favorite actor?");
                String actorName = input.nextLine();
                actorName = input.nextLine();

                System.out.println("Enter a random number between 1 and 50.");
                int randomNum = input.nextInt();

                try {
                    System.out.println("Calculating your lottery numbers...");
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    System.err.format("IOException: %s%n", e);
                }

                int magicBall = 0;

                if (numQB != 0) {
                    magicBall = numQB;
                } else {
                    magicBall = lucky * random1;
                    while (magicBall > 75) {
                        magicBall -= 75;
                    }
                }

                // Random Lottery Number 1 ; * Use the two digit model year of their car and add
                // their lucky number to it.
                int lotNum1 = carNum * lucky;
                while (lotNum1 > 65) {
                    lotNum1 -= 65;
                }

                // Random Lottery Number 2 ; * Use the random number between 1 and 50,
                // subtracting one of the generated random numbers.
                int lotNum2 = randomNum - random2;
                if (lotNum2 < 0) {
                    lotNum2 += random2;
                }

                // Random Lottery Number 3 ; * Use the age of their favorite pet + their car
                // model year.
                int lotNum3 = petAge + carNum;
                if (lotNum3 > 65) {
                    lotNum3 -= 65;
                }

                // Random Lottery Number 4 ; Use the first letter of actor first letter.
                int lotNum4 = actorName.charAt(0);
                while (lotNum4 > 65) {
                    lotNum4 -= 65;
                }

                // Random Lottery Number 4 ; Use the first letter of actor first letter.
                int lotNum5 = petName.charAt(2);
                while (lotNum5 > 65) {
                    lotNum5 -= 65;
                }

                // Final Output
                System.out.println(" ");
                System.out.println("Lottery Numbers: " + lotNum1 + ", " + lotNum2 + ", " + lotNum3 + ", " + lotNum4 + ", " + lotNum5 + ", "
                        + "Magic Ball: " + magicBall);
                System.out.println(" ");
                break;

            } else {
                System.out.println("Please return to complete the survey another time. Thank you!");
                break;
            }
        }

        input.close();
    }

    public static void printNumbers() {
            
        for (int x = 48; x < 58; x++) {
            char num = (char) x;
            System.out.print(num);
        }

    }

    public static void printLowerCase() {

        for (int x = 97; x < 123; x++) {
            char num = (char) x;
            System.out.print(num);
        }

    }

    public static void printUpperCase(){
    
        for (int x = 65; x < 91; x++) {
            char num = (char) x;
            System.out.print(num);
        }

    }
    
}