import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

            System.out.println(" Double equals: " + (3 == 2));
            System.out.println("String equivalent: " + "Hello".equals("Helloz"));
            System.out.println("Not equals: " + (7 != 4));
            System.out.println("Greater than: " + (4 > 5));

            System.out.println();

            int num = 11;
            System.out.println(num <= 12);
            if (num <= 12) {
                System.out.println("num is less than or equals to 12");
            }

             if (num <= 5) {
                System.out.println("num is less than or equals to 5");
            } else {
                System.out.println("yay you did it! num is greater than 5");
            }

            int temperature = 44;
            if (temperature >= 85) {
                System.out.println("It's hot!");
            } else if (temperature >= 60 ){
                 System.out.println("It's nice!");       
            } else if (temperature < 40) {
                System.out.println("It's cold!"); 
            } else {
                System.out.println("ERROR!");
            }


            int age = 17;
            boolean hasPermit = false;

            if (age >= 17 && hasPermit){
                System.out.println("You can drive");
            } else {
                System.out.println("Can't drive yet");
            }


            String day = "Taco";

            if (day.equals("Saturday") || day.equals("Sunday")) {
                System.out.println("It's the weekend!");
            } else if (day.equals("Monday") || 
                       day.equals("Tuesday") || 
                       day.equals("Wednesday") || 
                       day.equals("Thursday") || 
                       day.equals("Friday") ) {
                System.out.println("It's the weekday");         
            } else {
                System.out.println("That is not a day");
            }
                


    }

    
}

//challenge 1
public class PasswordCheck {
    public static void main(String[] args) {

        String storedPassword = "password123";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String userPassword = scanner.nextLine();

        if (userPassword.equals(storedPassword)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

    }
}


//challenge 2
public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }
}


//challenge 3
public class LetterGrade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade (0-100): ");
        String input = scanner.nextLine();

        int grade = Integer.parseInt(input);

        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}