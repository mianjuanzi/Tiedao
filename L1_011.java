/**
 * @description:A-B
 * @author： mianjuanzi
 * @date: 2019/4/24 9:53
 */
import java.util.Scanner;
public class L1_011 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        String b=scan.nextLine();
        for(int i=0;i<b.length();i++){
            for(int j=0;j<a.length();j++){
                if(a.charAt(j)==b.charAt(i)){
                    a=a.substring(0,j)+a.substring(j+1,a.length());
                }
            }
        }
        System.out.println(a);
    }
}
