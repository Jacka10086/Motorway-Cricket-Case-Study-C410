import java.util.Random;

public class Vehicle {

    private String type;
    private String colour;
    private int points;

    public Vehicle() {
        this.type = assignType();
        this.colour = assignColour();
        switch (this.type) {
            case "car" : this.points = 1; break;
            case "van" : this.points = 4; break;
            case "HGV" : this.points = 4; break;
            case "bus" : this.points = 6; break;
            case "minibus" : this.points = 6; break;
        }
    }

    public Vehicle(String aType, String aColour) {
        this.type = aType;
        this.colour = aColour;
        switch (this.type) {
            case "car" : this.points = 1; break;
            case "van" : this.points = 4; break;
            case "HGV" : this.points = 4; break;
            case "bus" : this.points = 6; break;
            case "minibus" : this.points = 6; break;
        }
    }

    public String getType() {
        return this.type;
    }

    public String getColour() {
        return this.colour;
    }

    public int getPoints() {
        return this.points;
    }

    public String toString() {
        String pointStr = "points";
        if (this.points == 1) pointStr = "point";
        String resultStr = this.colour + " " + this.type;
        if (!this.colour.equals("Red"))
            resultStr += " (" + this.points + " " + pointStr + ")";
        return resultStr;
    }

    private String assignType() {
        Random random = new Random();
        int rnd = random.nextInt(100);
        if (rnd < 75) return "car";
        else if (rnd < 93) return "van";
        else if (rnd < 97) return "HGV";
        else if (rnd < 99) return "bus";
        else return "minibus";
    }

    private String assignColour() {
        Random random = new Random();
        int rnd = random.nextInt(100);
        if (rnd < 26) return "Gray";
        else if (rnd < 46) return "Black";
        else if (rnd < 63) return "White";
        else if (rnd < 79) return "Blue";
        else if (rnd < 88) return "Red";
        else if (rnd < 95) return "Silver";
        else if (rnd < 97) return "Green";
        else if (rnd < 98) return "Orange";
        else if (rnd < 99) return "Yellow";
        else return "Bronze";
    }

}