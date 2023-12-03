import java.util.Scanner;

public class Team {

    private static final int TEAMSIZE = 3;
    private String teamName;
    private Player[] players = new Player[Team.TEAMSIZE];


    public Team(String teamName) {
        this.teamName = teamName;

        Scanner keyboard = new Scanner(System.in);

        System.out.println();
        for (int i = 0; i < Team.TEAMSIZE; i++) {
            System.out.printf("(%s) Enter player %d name > ", teamName, i + 1);
            String name = keyboard.nextLine();
            this.players[i] = new Player(name);
        }
    }

    public int play() {
        int score = 0;
        System.out.println("\nTEAM: " + this.teamName + "\n--------------------");
        for (int i = 0; i < Team.TEAMSIZE; i++) {
            score += this.players[i].play();
        }
        System.out.printf("%s scores %d points\n\n", this.teamName, score);
        return score;
    }

}