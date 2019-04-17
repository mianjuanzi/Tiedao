import java.util.*;
public class NumberStatistics2 {
    public static void main(String[] args) {
//统计个位数
//从网上找的轮子
//自己之前造的破轮子太反锁了emmm
Scanner scan=new Scanner(System.in);
String s=scan.next();
int a[]=new int[10];
int len=s.length();
for(int i=0;i<len;i++){
    a[s.charAt(i)-48]++;
}
for(int i=0;i < 10 ;i++){
    if(a[i]!=0){
        System.out.println(i+":"+a[i]);
    }
        }
    }
}