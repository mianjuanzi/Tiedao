/**
 * @ClassName L1_017
 * @Description pat天梯赛（到底有多二）
 * @Author mianjuanzi
 * @Date 2019/5/7 20:43
 **/
import java.util.Scanner;
public class L1_017 {
    public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       String num=scan.next();
       double m=1;
       double n=1;
       if(num.charAt(0)=='-'){
            m=1.5;//若num为负数，犯二程度增加0.5倍
           num=num.substring(1);
       }
       double total=0;
       for(int i=0;i<num.length();i++){
           if(num.charAt(i)=='2'){
               total++;
           }
       }
       if(num.charAt(num.length()-1)%2==0){
           n=2;//若num为偶数，犯二程度增加一倍
       }
       double depth=total/num.length()*m*n*100;
       System.out.printf("%.2f",depth);
       System.out.println("%");
    }
}
