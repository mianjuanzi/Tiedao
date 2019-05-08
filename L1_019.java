/**
 * @ClassName L1_019
 * @Description pat天梯赛（谁先倒）
 * @Author mianjuanzi
 * @Date 2019/5/8 16:26
 **/
import java.util.Scanner;
public class L1_019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int drinkingCapacity_A = scan.nextInt();//A的酒量
        int drinkingCapacity_B = scan.nextInt();//B的酒量
        int n = scan.nextInt();//划拳进行了n轮
        int drink_A=0;
        int drink_B=0;
        for (int i = 0; i < n; i++) {
            int shoutNumber_A = scan.nextInt();//A喊的数
            int showNumber_A = scan.nextInt();//A比划的数
            int shoutNumber_B = scan.nextInt();//A喊的数
            int showNumber_B = scan.nextInt();//A比划的数
            if(shoutNumber_A+shoutNumber_B==showNumber_A&&shoutNumber_A+shoutNumber_B!=showNumber_B){
                drink_A++;
                if(drink_A==drinkingCapacity_A+1){
                System.out.println("A");
                System.out.println(drink_B);
                break;
            }
        }
            else if(shoutNumber_A+shoutNumber_B==showNumber_B&&shoutNumber_A+shoutNumber_B!=showNumber_A){
                drink_B++;
                if(drink_B==drinkingCapacity_B+1){
                    System.out.println("B");
                    System.out.println(drink_A);
                    break;
                }
            }
        }

    }
}
