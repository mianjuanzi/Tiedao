/**
 * @ClassName L1_023
 * @Description 输出GPLT
 * @Author mianjuanzi
 * @Date 2019/5/13 1:28
 **/
import java.util.Arrays;
import java.util.Scanner;
public class L1_023 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();//键盘输入的字符串
        String str1 = "";//删除所有非GPLT,将小写字母全部替换为大写字母
        int num_G = 0;
        int num_P = 0;
        int num_L = 0;
        int num_T = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g' || str.charAt(i) == 'G') {
                str1 = str1 + 'G';
                num_G++;
            }
            if (str.charAt(i) == 'p' || str.charAt(i) == 'P') {
                str1 = str1 + 'P';
                num_P++;
            }
            if (str.charAt(i) == 'l' || str.charAt(i) == 'L') {
                str1 = str1 + 'L';
                num_L++;
            }
            if (str.charAt(i) == 't' || str.charAt(i) == 'T') {
                str1 = str1 + 'T';
                num_T++;
            }
        }
        int[] num = {num_G, num_P, num_L, num_T};
        Arrays.sort(num);
        int max = num[3];
        for (int j = max; j > 0; j--) {
            if (num_G > 0) {
                System.out.print('G');
                --num_G;
            }
            if (num_P > 0) {
                System.out.print('P');
                --num_P;
            }
            if (num_L > 0) {
                System.out.print('L');
                --num_L;
            }
            if (num_T > 0) {
                System.out.print('T');
                --num_T;
            }
        }
    }
}
