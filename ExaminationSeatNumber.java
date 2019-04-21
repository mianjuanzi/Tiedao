import java.util.*;
public class ExaminationSeatNumber {
    //pat天梯赛
    //考试座位号
    //此程序运行超时
    public static void main(String[] args){

        // 输入第一行给出一个正整数 N（≤1000）
        // 随后 N 行，每行给出一个考生的信息：准考证号 试机座位号 考试座位号
        int n;//同学人数
        Scanner scan =new Scanner(System.in);
        n=scan.nextInt();
        String num1[]=new String [n];//准考证号
        int num2[]=new int[n];//试机座位号
        int num3[]=new int[n];//考试座位号
        for(int i=0;i<n;i++) {
            num1[i]=scan.next();
            num2[i]=scan.nextInt();
            num3[i]=scan.nextInt();
        }
        //考生信息之后，给出一个正整数 M（≤N）
        // 随后一行中给出 M 个待查询的试机座位号码，以空格分隔
        int m;//待查询的实际座位号数目
        m=scan.nextInt();
        int []b=new int[m];
        for(int i=0;i<m;i++) {
            b[i]=scan.nextInt();
        }
        //锁定待查询信息的同学的编号，并打印其准考证号和考试座位号
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                if(b[j]==num2[i]){
                    System.out.println(num1[i]+" "+num3[i]);
                }

            }
        }
    }
}
