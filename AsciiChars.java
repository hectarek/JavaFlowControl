import java.util.Scanner;

public class AsciiChars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int random1 = (int)(Math.random()*75);
        int random2 = (int)(Math.random()*65);
        int random3 = (int)(Math.random()*65);

        printNumbers();
        printLowerCase();
        printUpperCase();

        //Ask questions to get use information.

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Hello, " + name);

        System.out.println("Would you like to continue with the interactive portion? y/n");
        String answer = input.nextLine();

        if (answer == "y" || answer == "Y" || answer == "Yes" || answer == "yes"){
            //Interactive portion 

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

            int numQB = 0;

            if (answerQB == "yes" || answerQB == "Yes") {
                System.out.println("What is their jersey number?");
                numQB = input.nextInt();
            } 

            System.out.println("What is the two-digit model year of your car? (ex. 2013 = 13)");
            int carNum = input.nextInt();

            System.out.println("What is the first name of your favorite actor?");
            String actorName = input.nextLine();

            System.out.println("Enter a random number between 1 and 50.");
            int randomNum = input.nextInt();
        

            if (numQB != 0){
                int magicBall = numQB;
            } else {
                int magicBall = lucky * random1;
                if(magicBall >75) {
                    magicBall -= 75;
                }
            }
            
            //Random Lottery Number 1 ; * Use the two digit model year of their car and add their lucky number to it.
            int lotNum1 = carNum * lucky;
                if(lotNum1 > 75) {
                    lotNum1 -= 75;
                }

            //Random Lottery Number 2 ; * Use the random number between 1 and 50, subtracting one of the generated random numbers.
            int lotNum2 = randomNum - random2;
                if(lotNum2 < 0) {
                    lotNum2 += random2;
                }

            //Random Lottery Number 3 ; * Use the age of their favorite pet + their car model year.
            int lotNum3 = petAge + carNum;
                if(lotNum3 > 75) {
                    lotNum3 -= 75;
                }
            //Random Lottery Number 4 ;
            

        } else {
            System.out.println("Please return to complete the survey another time. Thank you!");
        }

        //Calculate Lottery Numbers from responses

       



        input.close();
    }

    public static void printNumbers() {

    int[] asciiNums = new int[]{0,1,2,3,4,5,6,7,8,9};

        for (int x : asciiNums){
            System.out.print(x + " ");
        }

    }

    public static void printLowerCase(){

        char[] asciiLowerLetters = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        for (char y : asciiLowerLetters){
            System.out.print(y + " ");
        }

    }

    public static void printUpperCase(){
    
        char[] asciiUpperLetters = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    
        for (char z : asciiUpperLetters){
            System.out.print(z + " ");
        }
    
    }
    
}