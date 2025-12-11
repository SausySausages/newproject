import java.util.Scanner;

public class challengeTwo {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        double numOne = Double.parseDouble(input.nextLine());

        System.out.println("Enter second number:");
        double numTwo = Double.parseDouble(input.nextLine());

        double numDivided = numOne / numTwo;

        System.out.println("here is the divided number: " + numDivided);
    }
}
