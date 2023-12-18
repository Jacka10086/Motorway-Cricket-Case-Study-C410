// 导入java.util包中的Scanner类，用于从控制台接收用户输入。
import java.util.Scanner;

// 定义Team类来表示游戏中的一个团队。
public class Team {

    // 设置团队大小的常量，这里固定为3。
    private static final int TEAMSIZE = 3;
    // 定义团队名称的私有变量。
    private String teamName;
    // 定义玩家数组，用于存储团队中的玩家对象。
    private Player[] players = new Player[Team.TEAMSIZE];

    // Team类的构造器，需要一个字符串参数来设置团队的名称。
    public Team(String teamName) {
        // 将传入的团队名称赋值给teamName变量。
        this.teamName = teamName;

        // 创建Scanner对象来读取用户输入。
        Scanner keyboard = new Scanner(System.in);

        // 循环提示用户输入玩家的名称，并创建玩家对象。
        System.out.println();
        for (int i = 0; i < Team.TEAMSIZE; i++) {
            // 格式化输出，提示用户输入第i+1个玩家的名称。
            System.out.printf("(%s) Enter player %d name > ", teamName, i + 1);
            // 读取用户输入的玩家名称。
            String name = keyboard.nextLine();
            // 使用输入的名称创建一个新的Player对象，并将其赋值给玩家数组的相应位置。
            this.players[i] = new Player(name);
        }
    }
    // play方法模拟了整个团队的游戏过程，并返回团队的总得分。
    public int play() {
        // 定义score变量来累计团队的得分。
        int score = 0;
        // 输出团队名称和分隔线，标记团队游戏开始。
        System.out.println("\nTEAM: " + this.teamName + "\n--------------------");
        // 遍历players数组，每个玩家轮流玩游戏，并将得分累加到团队总得分上。
        for (int i = 0; i < Team.TEAMSIZE; i++) {
            // 调用每个玩家的play方法并将返回的得分加到团队得分上。
            score += this.players[i].play();
        }
        // 格式化输出团队的名称和团队得分。
        System.out.printf("%s scores %d points\n\n", this.teamName, score);
        // 返回团队的总得分。
        return score;
    }

}
