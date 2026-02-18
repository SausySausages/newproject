import java.util.Scanner;

public class GetSetTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        GetSet player1 = new GetSet();
        GetSet player2 = new GetSet();

        System.out.println(player1.getUsername());
        player1.setUsername("pineappleghost333");
        player1.setId(1001);
        player1.setRank("Hacker");

        System.out.println(player1.getUsername());
        System.out.println(player1.getId());
        System.out.println(player1.getRank());

        System.out.println(player2.getUsername());
        player2.setUsername("ironmouse6741");
        player2.setId(1002);
        player2.setRank("Novice");

        System.out.println(player2.getUsername());
        System.out.println(player2.getId());
        System.out.println(player2.getRank());

        GetSet player3 = new GetSet();

        System.out.print("Enter a username: ");
        String userInput = input.nextLine();
        player3.setUsername(userInput);

        System.out.print("Enter an ID number: ");
        int idInput = input.nextInt();
        input.nextLine();
        player3.setId(idInput);

        System.out.print("Enter a rank (N00b, Bruh, Novice, Hacker, Gawd): ");
        String rankInput = input.nextLine();
        player3.setRank(rankInput);

        System.out.println("Username: " + player3.getUsername());
        System.out.println("ID: " + player3.getId());
        System.out.println("Rank: " + player3.getRank());

        if (player1.getUsername().equals("pineappleghost333")) {
            System.out.println("You are an admin");
        } else {
            System.out.println("Access denied");
        }

        String rank = player3.getRank();

        if (rank.equals("N00b")) {
            System.out.println("Welcome, beginner! Keep practicing!");
        } else if (rank.equals("Bruh")) {
            System.out.println("You're getting there!");
        } else if (rank.equals("Novice")) {
            System.out.println("Nice work, skilled player!");
        } else if (rank.equals("Hacker")) {
            System.out.println("You are one powerful hacker!");
        } else if (rank.equals("Gawd")) {
            System.out.println("All hail the gaming Gawd!");
        } else {
            System.out.println("Unknown rank.");
        }

        input.close();
    }
}

class GetSet {

    private String username = "No user name";
    private int id;
    private String rank = "N00b";

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public String getRank() {
        return rank;
    }

    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public void setRank(String newRank) {
        this.rank = newRank;
    }
}
