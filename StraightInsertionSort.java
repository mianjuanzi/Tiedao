import java.util.Scanner;
public class StraightInsertionSort {
    public static void main(String[] args) {
        int i;
        int[] a = new int[5];//声明数组并进行初始化
        Scanner reader = new Scanner(System.in);//用System.in创建一个Scanner的对象
        System.out.println("请输入待排序的整数");
        //从键盘获得待排序的数
        for (i = 0; i < a.length; i++) {
            a[i] = reader.nextInt();
        }
        //对这些数据进行直接插入排序
        int t;//待排序元素
        int j;//已排序列表下标
        for (i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                t = a[i];//赋值给待排序元素
                for (j = i-1; j>=0 && a[j] > t; j--) {
                    a[j + 1] = a[j]; //从后往前遍历已排序列表，逐个和待排序列表比较，如果已排序元素较大，则将它后移
                }
                    a[j+1] = t;//将待排序元素插入到正确的位置
                }
            }
        //输出排序后的结果
        System.out.println("\n排序结果：");
        for (j = 0; j < a.length; j++) {
            System.out.print(a[j] + "\t");
        }
    }
}