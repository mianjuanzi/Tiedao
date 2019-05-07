/**
 * @ClassName L1_016
 * @Description ToDo
 * @Author mianjuanzi
 * @Date 2019/4/26 13:15
 **/
import java.util.Scanner;
public class L1_015 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double m=scan.nextInt();
        String a=scan.next();
        char c=a.charAt(0);
        int n=(int)Math.round(m/2);
        for(int i=0;i<n;i++){
            System.out.println(show((int)m,c));
        }
    }
    public static char[] show(int n,char c){
        char [] ch=new char[n];
        for(int i=0;i<n;i++){
            ch[i]=c;
        }
        return ch;
    }
}
