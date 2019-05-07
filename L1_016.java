/**
 * @ClassName L1_016
 * @Description ToDo
 * @Author mianjuanzi
 * @Date 2019/4/30 11:49
 **/
import java.util.Scanner;
public class L1_016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] id = new String[n];
        int[] weight = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        char[] m = {'1', '0', 'x','9', '8', '7', '6', '5', '4', '3', '2'};
        for (int i = 0; i < n; i++) {
            id[i] = scan.next();
        }
        int error=0;
        for (int i = 0; i < n; i++) {
            boolean flag=true;
            int sum = 0;
            for (int j = 0; j < 17; j++) {
                if (!(id[i].charAt(j) >= '0' && id[i].charAt(j) <= '9')) {
                    flag = false;
                    error++;
                }
                else {
                    sum += ((id[i].charAt(j) - '0') * weight[j]);
                }
            }
            if (flag&&(m[sum % 11] != id[i].charAt(17))) {
                flag = false;
                error++;
            }
            if(!flag){
                System.out.println(id[i]);
            }
        }
        if(error==0){
            System.out.println("All passed");
        }
        else{
            System.out.println("error: "+error);
        }
    }
}
