/**
 * Created by mianjuanzi on 2019/8/12 1:07
 */
import java.util.Scanner;
public class L1_034 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int numberOfArticle = scan.nextInt();
        int [] layble =new int [1001];
        for(int i = 0;i < numberOfArticle;i++){
            int k =scan.nextInt();
            for(int j = 0;j < k;j++){
                layble[scan.nextInt()]++;
            }
        }
        int mostLayble = 1;
        int mostTimes = 1;
        for(int i = 0;i < 1001;i++){
            if(mostTimes <= layble[i]) {
                mostTimes = layble[i];
                mostLayble = i;
            }
        }
        System.out.println(mostLayble+" "+mostTimes);
    }
}
