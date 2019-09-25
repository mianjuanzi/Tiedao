/**
 * Created by mianjuanzi on 2019/7/19 17:45
 */
import java.util.Scanner;
public class L1_033 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int year_birth= scan.nextInt();
        int n = scan.nextInt();//n为目标年份中不同数字的个数
        int targetAge= 0;
        int targetYear=year_birth;
        while(n!=judgeDifferentNumber(targetYear)){
            targetYear++;
            targetAge++;
        }
        System.out.printf("%d %04d",targetAge,targetYear);
    }
    //判断一个四位数年份中有几个不同数字的方法
    public static int judgeDifferentNumber(int year_birth) {
        int k=0;//k为不同数字的个数
        String s_year_birth=String.valueOf(year_birth);
        if(s_year_birth.length()==1)
            s_year_birth+="000";
        else if(s_year_birth.length()==2)
            s_year_birth+="00";
        else if(s_year_birth.length()==3)
            s_year_birth+="0";
        int [] integer = new int [10];
        for(int i=0;i<4;i++){
            integer[(int)s_year_birth.charAt(i)-'0']++;
        }
        for(int i=0;i<10;i++){
            if(integer[i]>=1)
                k++;
        }
        return k;
    }
}
