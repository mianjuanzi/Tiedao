import java.util.Scanner;
public class StraightSelectionSort {
    public static void main(String[] args) {
        int i;
        int[] a = new int[5];//声明数组并进行初始化
        Scanner reader = new Scanner(System.in);//用System.in创建一个Scanner的对象
        System.out.println("请输入待排序的整数");
        //从键盘获得待排序的数
        for (i = 0; i < a.length; i++) {
            a[i] = reader.nextInt();
        }
        //对这些整数进行直接选择排序
        int j;
        int t;
        for (i = 0; i < a.length; i++) {
            t = i;
            for (j = i + 1; j < a.length; j++) {
                if (a[j] < a[t]) {
                    int temp;
                    t = j;
                    if (t != i) {//交换a[t]和a[i]
                        temp = a[t];
                        a[t] = a[i];
                        a[i] = temp;
                    }
                }
            }
        }
        //输出排序结果
        System.out.println("\n排序结果：");
        for (j = 0; j < a.length; j++) {
            System.out.print(a[j] + "\t");
        }
    }
}