import java.util.Scanner;

public class ArrayChallenges {
    //challenge 1
    int[] price = new int[10];

    //challenge 2
    int[] number = new int[20];
    for (int i = 0; i < number.length; i++) {
    number[i] = 4;
}

    //challenge 3
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

    input.close();

}
