/**
 * @ClassName L1_024
 * @Description ToDo
 * @Author mianjuanzi
 * @Date 2019/4/26 14:02
 **/
import java.util.Scanner;
public class L1_024 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=0;
        if(n>5){
            m=n+2-7;
        }else m=n+2;
        System.out.println(m);
    }
}
