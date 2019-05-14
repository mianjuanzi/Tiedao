/**
 * @ClassName L1_028
 * @Description 判断素数
 * @Author mianjuanzi
 * @Date 2019/5/14 17:45
 **/
import java.util.Scanner;
public class L1_028 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] num = new int [n];
        for(int i = 0;i < n;i++){
            num [i] = scan.nextInt();
        }
        for(int i = 0;i < n;i++){
            isPrimeNumber(num[i]);
        }
    }
    public static void isPrimeNumber(int n){
        boolean flag=true;
        if(n==1){
            flag=false;
        }
        for(int i = 2;i < Math.sqrt(n);i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}

