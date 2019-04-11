import java.util.*;
public class PrintHourglass {//打印沙漏
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total;
        char c;
        int row = 1;
        total = scan.nextInt();//从键盘获取符号的总数
        String s=scan.next();
        c=s.charAt(0);//从键盘获得一个字符
        int rest;
        while (total >= 2* row *row- 1) {
            row++;
        }
        row--;//计算沙漏第一行到中间一行共有多少行
        rest=total-(2*row*row-1);//求打印沙漏后剩余的符号数目
        for(int i=0;i<row;i++){
            System.out.print(  show(i,' '));
            System.out.println(  show(2*(row-i)-1,c));
        }//打印沙漏的上半部分
        for(int i=row-2;i>=0;i--){
            System.out.print(  show(i,' '));
            System.out.println(  show(2*(row-i)-1,c));
    }//打印沙漏的下半部分
        System.out.println(rest);//打印剩余的符号数目
    }
        public static char[] show ( int i, char c){//定义方法show，返回char[]
            char[] ch = new char[i];
            for (int j = 0; j < i; j++) {//对数组进行循环赋值
                ch[j] = c;
            }
            return ch;//返回数组
        }

}

