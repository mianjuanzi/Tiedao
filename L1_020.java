/**
 * @ClassName L1_020
 * @Description pat天梯赛（帅到没朋友）
 * @Author mianjuanzi
 * @Date 2019/5/8 18:00
 **/
import java.util.HashSet;
import java.util.Scanner;
public class L1_020 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashSet allID = new HashSet();
        HashSet idPrinted = new HashSet();
        int numberOfCircles = scan.nextInt();//朋友圈的数目
        for(int i = 0;i < numberOfCircles;i++){
            int sizeOfCircle = scan.nextInt();//圈子大小
            for(int j = 0;j < sizeOfCircle;j++){
                if(sizeOfCircle>=2){
                    String id = scan.next();
                    allID.add( id);
                }
                else{
                    String id = scan.next();
                }
            }
        }
        int numberOfTesters = scan.nextInt();//带查询人数
        int flag = 0;
        for(int i = 0;i<numberOfTesters;i++) {
            String id_test = scan.next();
            if (!idPrinted.add(id_test))//将所有查询的人放入哈希集合
                continue;
            if (!allID.contains(id_test)) {
                if (flag == 1) {
                    System.out.print(" ");
                }
                System.out.print(id_test);
                flag = 1;
            }
        }
        if(flag==0){
            System.out.println("No one is handsome");
        }
    }
}
