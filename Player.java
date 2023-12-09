// 定义Player类来表示游戏中的玩家。
public class Player {

    // 玩家名称的私有变量。
    private String playerName;
    // 玩家得分的私有变量，初始值为0。
    private int score;

    // Player类的构造器，需要一个字符串参数来设置玩家的名称。
    public Player(String thePlayerName) {
        // 将传入的玩家名称赋值给playerName变量。
        this.playerName = thePlayerName;
        // 初始化得分为0。
        this.score = 0;
    }

    // 公共方法getScore，用于获取玩家的得分。
    public int getScore() {
        // 返回玩家的得分。
        return this.score;
    }

    // 重写了Object类的toString方法，用于返回玩家的名称和得分的字符串表示。
    public String toString() {
        // 使用String.format来格式化字符串，玩家名称占10个字符的左对齐，得分为整数。
        return String.format("%-10s %d", this.playerName, this.score);
    }

    // play方法模拟了玩家的游戏过程。
    public int play() {
        // 定义一个布尔变量finished，用于判断玩家是否完成游戏。
        boolean finished = false;
        // count用于计数玩家所玩的车辆数量。
        int count = 0;
        // 输出当前玩家的名称。
        System.out.printf("\nPlayer is %s\n\n", this.playerName);
        // 使用do-while循环来重复游戏过程。
        do {
            // 创建一个新的Vehicle对象。
            Vehicle vehicle = new Vehicle();
            // 输出创建的车辆信息。
            System.out.println(vehicle);
            // 如果生成的车辆颜色为红色，游戏结束。
            if (vehicle.getColour().equals("Red")) {
                finished = true;
            } else {
                // 否则，count增加，并将车辆的得分加到玩家的总分上。
                count++;
                this.score += vehicle.getPoints();
            }
            
        } while (!finished); // 如果finished为false，继续游戏。
        // 游戏结束后，输出玩家的得分和玩过的车辆数量。
        System.out.printf("%d points scored from %d vehicles\n\n", this.score, count);
        // 返回玩家的得分。
        return this.score;
    }

}
