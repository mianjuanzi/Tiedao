/**
 * @ClassName L1_051
 * @Description ToDo
 * @Author mianjuanzi
 * @Date 2019/4/27 0:18
 **/
import java.util.Scanner;
public class L1_051 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int price=scan.nextInt();
        int rebate=scan.nextInt();
        System.out.printf("%.2f",price*0.1*rebate);
    }
}
