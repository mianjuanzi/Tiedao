/**
 * @ClassName L1_036
 * @Description java中的printf
 * @Author mianjuanzi
 * @Date 2019/4/26 16:59
 **/
import java.util.Scanner;
public class L1_037 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(b==0){
            System.out.println(a+"/"+b+"=Error");
        }
        if(b>0){
            System.out.printf("%d/%d=%.2f",a,b,a*1.0/b);
        }
        if(b<0){
            System.out.printf("%d/(%d)=%.2f",a,b,a*1.0/b);
        }
    }
}
