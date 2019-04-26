/**
 * @ClassName L1_060
 * @Description ToDo
 * @Author mianjuanzi
 * @Date 2019/4/27 0:28
 **/
import java.util.Scanner;
public class L1_060 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        double area=50*100-x*y*0.5-0.5*(100-x)*(100-y)-(100-x)*y;
        System.out.println((int)area);
    }
}
