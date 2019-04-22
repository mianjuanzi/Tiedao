/**
 * @description:求整数段和(天梯赛）
 * @author： mianjuanzi
 * @date: 2019/4/22 23:08
 */
import java.util.*;
public class PrintFormat {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int start=scan.nextInt();
        int end=scan.nextInt();
        for(int i=start;i<=end;i++){
            int flag=i-start+1;
            String s=Integer.toString(i);
            for(int j=s.length();j<5;j++){
                s=" "+s;
            }
            System.out.print(s);
            if(flag%5==0){
                System.out.println("");
            }
        }
        if((end-start+1)%5!=0) {
            System.out.print("\n");
        }
        int sum=0;
        for(int j=start;j<=end;j++){
            sum+=j;
        }
        System.out.println("Sum = "+sum);
    }
}
/*方法二
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int sum = 0;
        int i, j;
        // 每5个数字占一行，每个数字5个字符宽度
        for (i = A, j = 1; i <= B; i++, j++) {
            System.out.printf("%5d", i);
            if (j % 5 == 0) {
                System.out.println();
            }
            sum += i;
        }
        if (j % 5 != 1) {
            System.out.println();
        }
        System.out.print("Sum = " + sum);
    }
}
 */
