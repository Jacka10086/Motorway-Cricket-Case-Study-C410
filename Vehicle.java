// 导入java.util包下的Random类，用于生成随机数。
import java.util.Random;

// 定义Vehicle类，用来表示游戏中的车辆。
public class Vehicle {

    // 定义车辆类型的私有字符串变量。
    private String type;
    // 定义车辆颜色的私有字符串变量。
    private String colour;
    // 定义车辆点数的私有整数变量。
    private int points;

    // Vehicle类的无参构造器，用于创建车辆对象并随机分配类型和颜色。
    public Vehicle() {
        // 通过assignType方法随机分配车辆类型。
        this.type = assignType();
        // 通过assignColour方法随机分配车辆颜色。
        this.colour = assignColour();
        // 使用switch语句根据车辆类型分配点数。
        switch (this.type) {
            case "car" : this.points = 1; break;
            case "van" : this.points = 4; break;
            case "HGV" : this.points = 4; break;
            case "bus" : this.points = 6; break;
            case "minibus" : this.points = 6; break;
        }
    }

    // Vehicle类的有参构造器，允许直接指定车辆类型和颜色。
    public Vehicle(String aType, String aColour) {
        // 将传入的类型和颜色分别赋值给type和colour变量。
        this.type = aType;
        this.colour = aColour;
        // 使用switch语句根据车辆类型分配点数。
        switch (this.type) {
            case "car" : this.points = 1; break;
            case "van" : this.points = 4; break;
            case "HGV" : this.points = 4; break;
            case "bus" : this.points = 6; break;
            case "minibus" : this.points = 6; break;
        }
    }

    // getType方法用于返回车辆的类型。
    public String getType() {
        return this.type;
    }

    // getColour方法用于返回车辆的颜色。
    public String getColour() {
        return this.colour;
    }

    // getPoints方法用于返回车辆的点数。
    public int getPoints() {
        return this.points;
    }

    // 重写toString方法，用于返回车辆的颜色、类型和点数的字符串表示。
    public String toString() {
        // 根据点数决定使用单数还是复数形式的"point"。
        String pointStr = "points";
        if (this.points == 1) pointStr = "point";
        // 拼接颜色和类型字符串。
        String resultStr = this.colour + " " + this.type;
        // 如果车辆颜色不是红色，还需要拼接点数信息。
        if (!this.colour.equals("Red"))
            resultStr += " (" + this.points + " " + pointStr + ")";
        return resultStr;
    }

    // assignType方法用于随机分配车辆类型。
    private String assignType() {
        Random random = new Random();
        // 生成0到99之间的随机数。
        int rnd = random.nextInt(100);
        // 根据随机数的范围返回对应的车辆类型。
        if (rnd < 75) return "car";
        else if (rnd < 93) return "van";
        else if (rnd < 97) return "HGV";
        else if (rnd < 99) return "bus";
        else return "minibus";
    }

    // assignColour方法用于随机分配车辆颜色。
    private String assignColour() {
        Random random = new Random();
        // 生成0到99之间的随机数。
        int rnd = random.nextInt(100);
        // 根据随机数的范围返回对应的车辆颜色。
        if (rnd < 26) return "Gray";
        else if (rnd < 46) return "Black";
        else if (rnd < 63) return "White";
        else if (rnd < 79) return "Blue";
        else if (rnd < 88) return "Red
