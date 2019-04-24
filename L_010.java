/**
 * @description:比较大小（pat天梯赛）
 * @author： mianjuanzi
 * @date: 2019/4/24 9:14
 */
import java.util.Scanner;
public class L_010 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int [] a=new int [3];
        for(int i=0;i<3;i++){
            a[i]=scan.nextInt();
        }
        for(int j=0;j<3;j++) {
            for (int i = 0; i < 3-j-1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println(a[2]+"->"+a[1]+"->"+a[0]);
    }
}
