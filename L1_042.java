/**
 * @ClassName L1_042
 * @Description ToDo
 * @Author mianjuanzi
 * @Date 2019/4/26 23:26
 **/
import java.util.Scanner;
public class L1_042 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String date1=scan.next();
        String str1=date1.substring(0,5);
        String str2=date1.substring(6);
        String date2=str2+"-"+str1;
        System.out.println(date2);
    }
}
