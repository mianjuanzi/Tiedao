import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int i;
        int[] a = new int[5];//声明数组并进行初始化
        Scanner reader = new Scanner(System.in);//用System.in创建一个Scanner的对象
        System.out.println("请输入待排序的整数");
        //从键盘获得待排序的数
        for (i = 0; i < a.length; i++) {
            a[i] = reader.nextInt();
        }
        //对这些整数进行冒泡排序
        for(i=0;i<a.length-1;i++) {//对排序码序列进行a.length-1趟扫描
           for(int j=0;j<a.length-1-i;j++) {//控制每次排序扫描范围内排序码的比较和交换
               if( a[j]>a[j+1]) {
                   int temp;//声明临时工作单元
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
               }
           }

        }
        //输出排序后的结果
        System.out.println("\n排序结果：");
        for (int j = 0; j< a.length; j++) {
            System.out.print(a[j]+"\t");
        }
    }
}
