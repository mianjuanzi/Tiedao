import java.util.*;
import static java.lang.Math.*;
public class ContinuousFactor {
    public static void main(String[] args) {
        //输入一个整数num，1<num<2^31
        Scanner scan = new Scanner(System.in);
        int num;
        num = scan.nextInt();
        int start=2;
        int end;
        int len=0;
//
    for(int i=start;i<(sqrt(num)+1);i++)
    {
        if(num%i==0){//判断是否为num的因子
            int temp=num/i;
            for(end=i+1;end<sqrt(num)+1;end++) {
                if (temp % end == 0) {
                    temp /= end;
                } else {
                    break;
                }
            }
            //判断是否有更长序列的因子
                if((end-i)>len){
                    start=i;
                    len=end-start;
                }
        }
    }
        if(len==0){//判断是否为素数
            len=1;
            start=num;
        }
    System.out.println(len);
    System.out.print(start);
//输出最长序列里最小因子序列里因子的个数
    for(int i=start+1;i<start+len;i++){
        System.out.print("*"+i);
    }
    }
}

