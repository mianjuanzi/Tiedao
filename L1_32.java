/**
 * Created by mianjuanzi on 2019/7/16 22:23
 */
import java.util.Scanner;
public class L1_32 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        String c = scan.nextLine();
        char symbol = c.charAt(1);
        String left = String.valueOf(symbol);
        String string = scan.nextLine();//第二行输入的字符串
        if(length > string.length()) {
            for (int i = 0; i < length - string.length(); i++) {
                System.out.print(symbol);
            }
            System.out.println(string);
        }
        else
            System.out.println(string.substring(string.length()-length));
    }
}
