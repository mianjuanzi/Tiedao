/**
 * Created by mianjuanzi on 2019/7/9 18:55
 */
import java.util.Scanner;
public class L1_031 {
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();//n为人数
        int [] a = new int [n];//a为身高
        double [] b = new double [n];//b为体重
        for(int i = 0;i < n;i++){
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        for(int i = 0;i < n;i++){
            double c = (a[i] - 100)*0.9*2;
            if(Math.abs(b[i]-c)<0.1*c)
                System.out.println("You are wan mei!");
            else {
                if ((b[i] > c))
                    System.out.println("You are tai pang le!");
                if ((b[i] < c))
                    System.out.println("You are tai shou le!");
            }
        }
    }
}
