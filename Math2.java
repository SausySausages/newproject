class ScoreBoard {

    int playerXP = 0;
    int playerLevel = 0;
    String gameName = "Fortnite";

    void gainXP(int amount) {
        playerXP = playerXP + amount;
    }

    void heal () {
        playerXP += 50;
    }

    void damage() {
        playerXP -= 10;
    }

    void levelUp() {
        playerLevel++;
    }

      void levelDown() {
        playerLevel--;
    }

    void name() {
        System.out.println(gameName);
    }
}

public class Math2 {

    public static void main(String[] args){

        ScoreBoard player1 = new ScoreBoard();
        ScoreBoard player2 = new ScoreBoard();
        ScoreBoard gameName1 = new ScoreBoard();

        player2.gainXP(400);
        player2.gainXP(500);
        player2.heal();
        player2.damage();
        player2.levelUp();
        player2.levelUp();
        player2.levelDown();

        System.out.println("Player 1 XP: " + player1.playerXP);
        System.out.println("Player 1 Level: " + player1.playerXP);

        System.out.println("Player 2 XP: " + player2.playerXP);
        System.out.println("Player 2 Level: " + player2.playerLevel);

        gameName1.name();

    } 
}