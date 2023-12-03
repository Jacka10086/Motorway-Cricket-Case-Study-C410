public class Player {

    private String playerName;
    private int score;

    public Player(String thePlayerName) {
        this.playerName = thePlayerName;
        this.score = 0;
    }

    public int getScore() {
        return this.score;
    }

    public String toString() {
        return String.format("%-10s %d", this.playerName, this.score);
    }

    public int play() {
        boolean finished = false;
        int count = 0;
        System.out.printf("\nPlayer is %s\n\n", this.playerName);
        do {
            Vehicle vehicle = new Vehicle();
            System.out.println(vehicle);
            if (vehicle.getColour().equals("Red")) {
                finished = true;
            } else {
                count++;
                this.score += vehicle.getPoints();
            }
        } while (!finished);
        System.out.printf("%d points scored from %d vehicles\n\n", this.score, count);
        return this.score;
    }

}