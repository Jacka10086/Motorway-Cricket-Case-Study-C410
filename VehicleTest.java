import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;

class VehicleTest {

    @Test
    void nonRedVehiclesScorePoints() {

        Vehicle v1 = new Vehicle("car", "Blue");
        Vehicle v2 = new Vehicle("van", "Orange");
        Vehicle v3 = new Vehicle("HGV", "White");
        Vehicle v4 = new Vehicle("bus", "Black");
        Vehicle v5 = new Vehicle("minibus", "Green");

        assertAll(
                () -> { assertEquals(v1.getPoints(), 1); },
                () -> { assertEquals(v2.getPoints(), 4); },
                () -> { assertEquals(v3.getPoints(), 4); },
                () -> { assertEquals(v4.getPoints(), 6); },
                () -> { assertEquals(v5.getPoints(), 6); }
        );
    }

    private static void testTypesAndColours() {

        Vehicle v;
        String vehicleType, vehicleColour;
        HashMap<String, Integer> typeCount = new HashMap<>();
        HashMap<String, Integer> colourCount = new HashMap<>();

        typeCount.put("car", 0);
        typeCount.put("van", 0);
        typeCount.put("HGV", 0);
        typeCount.put("bus", 0);
        typeCount.put("minibus", 0);

        colourCount.put("Gray", 0);
        colourCount.put("Black", 0);
        colourCount.put("White", 0);
        colourCount.put("Blue", 0);
        colourCount.put("Red", 0);
        colourCount.put("Silver", 0);
        colourCount.put("Green", 0);
        colourCount.put("Orange", 0);
        colourCount.put("Yellow", 0);
        colourCount.put("Bronze", 0);

        for (int i = 0; i < 1000000; i++) {
            v = new Vehicle();
            vehicleType = v.getType();
            typeCount.put(vehicleType, typeCount.get(vehicleType) + 1);
            vehicleColour = v.getColour();
            colourCount.put(vehicleColour, colourCount.get(vehicleColour) + 1);
        }
        System.out.println("\nVehicle types by percentage");
        System.out.printf("Cars: %d%% \n", typeCount.get("car")/10000);
        System.out.printf("Vans: %d%% \n", typeCount.get("van")/10000);
        System.out.printf("HGVs: %d%% \n", typeCount.get("HGV")/10000);
        System.out.printf("Busses: %d%% \n", typeCount.get("bus")/10000);
        System.out.printf("Minibusses: %d%% \n", typeCount.get("minibus")/10000);

        System.out.println("\nVehicle colours by percentage");
        System.out.printf("Gray: %d%% \n", colourCount.get("Gray")/10000);
        System.out.printf("Black: %d%% \n", colourCount.get("Black")/10000);
        System.out.printf("White: %d%% \n", colourCount.get("White")/10000);
        System.out.printf("Blue: %d%% \n", colourCount.get("Blue")/10000);
        System.out.printf("Red: %d%% \n", colourCount.get("Red")/10000);
        System.out.printf("Silver: %d%% \n", colourCount.get("Silver")/10000);
        System.out.printf("Green: %d%% \n", colourCount.get("Green")/10000);
        System.out.printf("Orange: %d%% \n", colourCount.get("Orange")/10000);
        System.out.printf("Yellow: %d%% \n", colourCount.get("Yellow")/10000);
        System.out.printf("Bronze: %d%% \n", colourCount.get("Bronze")/10000);
    }

    public static void main(String[] args) {
        testTypesAndColours();
    }


}