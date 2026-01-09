import java.util.Scanner;

public class ComputeAvg {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] scores = new int[5];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter test score " + (i + 1) + ": ");
            scores[i] = input.nextInt();
            sum += scores[i];
        }

        double average = sum / 5.0;

        System.out.println("Average test score: " + average);

    }
}
