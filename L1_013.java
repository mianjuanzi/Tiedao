/**
 * @ClassName L1_013
 * @Description ToDo
 * @Author mianjuanzi
 * @Date 2019/4/25 17:53
 **/
import java.util.Scanner;
public class L1_013 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0;
        for(int j=1;j<=n;j++) {
           sum+=get_factorial(j);
        }
        System.out.println(sum);
    }
    public static int get_factorial(int n){
        int factorial=1;
        for (int i = 1; i <= n; i++) {
           factorial *= i;
        }
        return factorial;
    }
}
