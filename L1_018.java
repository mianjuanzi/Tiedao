/**
 * @ClassName L1_018
 * @Description pat天梯赛（大笨钟）
 * @Author mianjuanzi
 * @Date 2019/5/7 21:15
 **/
import java.util.Scanner;
public class L1_018 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String time = scan.next();
        int hour = Integer.parseInt(time.substring(0,time.indexOf(':')));
        int second = Integer.parseInt(time.substring(time.indexOf(':')+1));
        if(hour>=0&&hour<12){
            System.out.println("Only "+time+".  Too early to Dang.");
        }
        if(hour==12){
            if(second==0){
                System.out.println("Only "+time+".  Too early to Dang.");
            }
            else{
                int frequency=hour-12;
                show(frequency+1,"Dang");
            }
        }
        if(hour>12&&hour<=23){
            int frequency=hour-12;
            if(second!=0){
                frequency++;
            }
            show(frequency,"Dang");
        }
    }
    public static void show(int frequency,String c){
        String ch[]=new String[frequency];
        for(int i=0;i<frequency;i++){
            ch[i]=c;
            System.out.print(ch[i]);
        }
    }
}
