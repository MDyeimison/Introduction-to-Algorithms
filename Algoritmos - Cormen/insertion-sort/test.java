import java.util.Random;

class Player {
    private Integer choice;
    private Integer wins = 0;
    private String[] choices = { "rock", "paper", "scissors" };

    /*
     * public Player(String name, String choice) {
     * this.name = name;
     * this.choice = choice;
     * }
     */

    public Integer getWins() {
        return wins;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setWins() {
        wins++;
    }

    public Integer getChoice() {
        return choice;
    }

    public void play() {
        choice = randomChoice();
    }
    

    public int randomChoice() {
        Random rand = new Random();
        return rand.nextInt(choices.length);
    }
}

public class test {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        for (int i = 0; i < 10000; i++) {

            System.out.println("Round " + (i + 1) + "\n" + "#".repeat(25));

            player1.play();
            player2.play();
            System.out.println("Player 1: " + player1.getChoices()[player1.getChoice()]);
            System.out.println("Player 2: " + player2.getChoices()[player2.getChoice()] + "\n");

            if (player1.getChoice() == player2.getChoice()) {
                System.out.println("Draw");
            } else if (player1.getChoice() == 0 && player2.getChoice() == 2 ||
                       player1.getChoice() == 1 && player2.getChoice() == 0 ||
                       player1.getChoice() == 2 && player2.getChoice() == 1) {
                System.out.println("Player 1 wins");
                player1.setWins();
            } else {
                System.out.println("Player 2 wins");
                player2.setWins();
            }
            System.out.println("#".repeat(25));
        }

        System.out.println("Player 1 wins: " + player1.getWins() + " --> " + (player1.getWins()*100/(player1.getWins() + player2.getWins())) + "%");
        System.out.println("Player 2 wins: " + player2.getWins() + " --> " + (player2.getWins()*100/(player1.getWins() + player2.getWins())) + "%");
    }
}
