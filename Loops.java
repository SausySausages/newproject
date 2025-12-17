public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i += 1) {
            for (int j = 0; j < 5; j++) {
                
                    System.out.print(j);
            
            }
            System.out.print('\n');

        }

        
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        
        }

        boolean isContinuing = true;
        int z = 0;
        
        while (isContinuing) {
            z++;
            if (z == 20) {
                isContinuing = false;
            }
            System.out.println(z);
        }

    }
}

//challenge 1
public class FooBar {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("foobar");
            }
            else if (i % 3 == 0) {
                System.out.println("foo");
            }
            else if (i % 5 == 0) {
                System.out.println("bar");
            }
            else {
                System.out.println(i);
            }
        }
    }
}

//challenge 2
public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++) {

            for (int j = 1; j <= 12; j++) {
                System.out.print((i * j) + "\t");
            }

            System.out.println();
        }
    }
}

//challenge 3
public class GuessingGame {
    public static void main(String[] args) {

        int answer = 2;

        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        while (guess != answer) {
            System.out.print("Guess a number between 1 and 3: ");
            guess = scanner.nextInt();

            if (guess == answer) {
                System.out.println("correct answer");
            } else {
                System.out.println("wrong answer");
            }
        }
    }
}