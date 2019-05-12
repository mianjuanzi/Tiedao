/**
 * @ClassName L1_022
 * @Description 奇偶分家
 * @Author mianjuanzi
 * @Date 2019/5/13 1:15
 **/
import java.util.Scanner;
public class L1_022 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] num = new int [n];
        int num_odd = 0;
        int num_even = 0;
        for(int i=0;i<n;i++){
            num[i]=scan.nextInt();
            if(num[i]%2==0){
                num_even++;
            }
            else num_odd++;
        }
        System.out.print(num_odd+" ");
        System.out.print(num_even);
    }
}
