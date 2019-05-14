/**
 * @ClassName L1_027
 * @Description ToDo
 * @Author mianjuanzi
 * @Date 2019/5/14 15:32
 **/
import java.util.Scanner;
public class L1_027 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int [] tel = new int [11];
        int [] num = new int [10];
        for(int i = 0;i < tel.length;i++){
            tel [i] = str.charAt(i)-48;
        }
        for(int i = 0;i < 11;i++){
          ++num[tel[i]];
        }
        int notfound = 0;
        for(int i = 0;i < 10;i++){
            if(num[i]==0){
                ++notfound;
            }
        }
        int [] found = new int [10-notfound];
        int k = 0;
        for(int i = 9;i>=0;i--){
            for(int j = 0;j < 11;j++){
                if(i==tel[j]){
                    found[k] = i;
                    ++k;
                    break;
                }
            }
        }
        System.out.print("int[] arr = new int[]{"+found[0]);
        for(int i = 1;i < found.length;i++){
            System.out.print(","+found[i]);
        }
        System.out.println("};");
        for(int i = 0;i < 11;i++) {
            for(int j = 0;j < found.length;j++){
                if(tel[i]==found[j]){
                    tel[i] = j;
                    break;
                }
            }
        }
        System.out.print("int[] index = new int[]{"+tel[0]);
        for(int i = 1;i < 11;i++) {
            System.out.print(","+tel[i]);
        }
        System.out.println("};");
    }
}
