// 定义公共类MotorwayCricket，用于实现高速公路板球游戏
public class MotorwayCricket {

    // 主方法，Java程序的入口点
    public static void main(String[] args) {

        // 创建一个团队对象myTeam，名称为"My Team"
        Team myTeam = new Team("My Team");
        // 创建另一个团队对象yourTeam，名称为"Your Team"
        Team yourTeam = new Team("Your Team");

        // 调用myTeam的play方法，开始游戏，并返回该团队的得分，存储在myScore变量中
        int myScore = myTeam.play();
        // 调用yourTeam的play方法，开始游戏，并返回该团队的得分，存储在yourScore变量中
        int yourScore = yourTeam.play();

        // 在控制台输出分隔线，表示游戏结束
        System.out.println("-----------------");
        // 输出“GAME OVER”标志游戏结束
        System.out.println("--- GAME OVER ---");
        // 再次输出分隔线
        System.out.println("-----------------");
        // 输出我的团队得分
        System.out.println("My Team scored " + myScore + " points");
        // 输出对方团队得分
        System.out.println("Your Team scored " + yourScore + " points");

        // 判断分数，以确定哪个团队胜利
        if (myScore > yourScore) {
            // 如果我的团队得分高于对方，输出"My Team wins!"
            System.out.println("My Team wins!");
        } else if (myScore < yourScore) {
            // 如果我的团队得分低于对方，输出"Your Team wins!"
            System.out.println("Your Team wins!");
        } else {
            // 如果分数相同，输出"Match drawn!"表示比赛平局
            System.out.println("Match drawn!");
        }
    }
}
