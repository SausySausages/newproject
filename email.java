import java.util.Scanner;

public class email {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter word #1");
        String wordOne = input.nextLine();

        System.out.println("Enter word #2");
        String wordTwo = input.nextLine();

        System.out.println("Enter first number");
        String numOne = input.nextLine();

        System.out.println("Enter second number");
        String numTwo = input.nextLine();

        int numOneConverted = Integer.parseInt(numOne);
        int numTwoConverted = Integer.parseInt(numTwo);

        int numTotal = numOneConverted + numTwoConverted;

        if (numTotal > 100) {
            numTotal = 99;
        }

        System.out.println("Here is your email: " + wordOne + wordTwo + numTotal + "@gmail.com34");
    }
}
