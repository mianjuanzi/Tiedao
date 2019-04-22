/**
 * @description:
 * @author： mianjuanzi
 * @date: 2019/4/22 13:56
 */
import java.util.*;
public class ReadNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        for (int i = 0; i < num.length() - 1; i++) {
            char n = num.charAt(i);
            switch (n) {
                case ('0'):
                    System.out.print("ling" + " ");
                    break;
                case ('1'):
                    System.out.print("yi" + " ");
                    break;
                case ('2'):
                    System.out.print("er" + " ");
                    break;
                case ('3'):
                    System.out.print("san" + " ");
                    break;
                case ('4'):
                    System.out.print("si" + " ");
                    break;
                case ('5'):
                    System.out.print("wu" + " ");
                    break;
                case ('6'):
                    System.out.print("liu" + " ");
                    break;
                case ('7'):
                    System.out.print("qi" + " ");
                    break;
                case ('8'):
                    System.out.print("ba" + " ");
                    break;
                case ('9'):
                    System.out.print("jiu" + " ");
                    break;
                case ('-'):
                    System.out.print("fu" + " ");
                    break;
            }
        }
    }
}
