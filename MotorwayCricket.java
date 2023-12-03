public class MotorwayCricket {

    public static void main(String[] args) {

        Team myTeam = new Team("My Team");
        Team yourTeam = new Team("Your Team");
        int myScore = myTeam.play();
        int yourScore = yourTeam.play();

        System.out.println("-----------------");
        System.out.println("--- GAME OVER ---");
        System.out.println("-----------------");
        System.out.println("My Team scored " + myScore + " points");
        System.out.println("Your Team scored " + yourScore + " points");

        if (myScore > yourScore) {
            System.out.println("My Team wins!");
        } else if (myScore < yourScore) {
            System.out.println("Your Team wins!");
        } else {
            System.out.println("Match drawn!");
        }
    }
}