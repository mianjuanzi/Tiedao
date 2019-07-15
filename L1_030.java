/**
 * Created by mianjuanzi on 2019/7/9 18:48
 */
import java.util.Scanner;
public class L1_030 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int stu = scan.nextInt();
        String [] boy = new String [stu/2];
        String [] girl = new String [stu/2];
        int [] stu_sex = new int [stu];
        String [] stu_name = new String [stu ];
         int j = 0;
         int k = 0;
        for(int i = 0; i < stu; i++){
            stu_sex [i] = scan.nextInt();
            stu_name [ i ] = scan.next();
            if(stu_sex[i] == 0){
                girl [j] = stu_name[i];
                j++;
            }
            if(stu_sex[i]== 1){
                boy[k] = stu_name[i];
                k++;
            }
        }
        int flag_boy = 0;
        int flag_girl = 0;
        for(int i = 0;i < stu/2;i++){
            if(stu_sex[i] == 0) {
                System.out.println(stu_name[i] + " " + boy[stu / 2 - flag_girl - 1]);
                flag_girl++;
            }
            if(stu_sex[i] == 1) {
                System.out.println(stu_name[i] + " " + girl[stu / 2 - flag_boy - 1]);
                flag_boy++;
            }
        }
    }
}
