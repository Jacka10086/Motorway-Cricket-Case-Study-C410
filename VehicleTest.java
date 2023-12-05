// 导入JUnit测试库中的Test注解和Assertions类的静态方法。
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// 导入Java的HashMap类，用于存储键值对。
import java.util.HashMap;

// 定义VehicleTest类，它包含测试Vehicle类的方法。
class VehicleTest {

    // 定义一个测试方法，使用@Test注解标记，表明它是一个测试案例。
    @Test
    void nonRedVehiclesScorePoints() {

        // 创建几个具有不同类型和颜色的Vehicle对象。
        Vehicle v1 = new Vehicle("car", "Blue");
        Vehicle v2 = new Vehicle("van", "Orange");
        Vehicle v3 = new Vehicle("HGV", "White");
        Vehicle v4 = new Vehicle("bus", "Black");
        Vehicle v5 = new Vehicle("minibus", "Green");

        // 使用assertAll进行一组断言，确保每个车辆的得分符合预期。
        assertAll(
                () -> { assertEquals(v1.getPoints(), 1); },
                () -> { assertEquals(v2.getPoints(), 4); },
                () -> { assertEquals(v3.getPoints(), 4); },
                () -> { assertEquals(v4.getPoints(), 6); },
                () -> { assertEquals(v5.getPoints(), 6); }
        );
    }

    // 定义一个静态方法testTypesAndColours，用于测试车辆类型和颜色的分布。
    private static void testTypesAndColours() {

        // 初始化变量和HashMap用于计数。
        Vehicle v;
        String vehicleType, vehicleColour;
        HashMap<String, Integer> typeCount = new HashMap<>();
        HashMap<String, Integer> colourCount = new HashMap<>();

        // 初始化类型和颜色的计数。
        typeCount.put("car", 0);
        // ...省略其它类型的初始化

        colourCount.put("Gray", 0);
        // ...省略其它颜色的初始化

        // 循环创建1,000,000个Vehicle对象，并记录各类型和颜色的数量。
        for (int i = 0; i < 1000000; i++) {
            v = new Vehicle();
            vehicleType = v.getType();
            typeCount.put(vehicleType, typeCount.get(vehicleType) + 1);
            vehicleColour = v.getColour();
            colourCount.put(vehicleColour, colourCount.get(vehicleColour) + 1);
        }

        // 输出车辆类型和颜色的分布百分比。
        // ...省略输出分布百分比的代码

    }

    // main方法用于执行testTypesAndColours测试。
    public static void main(String[] args) {
        testTypesAndColours();
    }

}
