import java.util.*;
public class NumberStatistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        //从键盘输入一个不超过一千位的正整数
        System.out.println("请输入一个不超过一千位的正整数：");
        n = scan.nextInt();
        //判断n有多少位
        int k = 0;
        while (n > Math.pow(10, k)) {
            ++k;
        }
        //将所有数位的数字放在数组里
        int[] a = new int[k];
        int temp = n;
        for (int i = k - 1; i >= 0; i--) {
            a[i] = (int) Math.floor(temp / Math.pow(10, i));
            temp -= a[i] * Math.pow(10, i);
        }
        System.out.println("该整数所有数位的数字：");
        for (int i = k - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        //统计0~9每个数字出现的次数
        int[] b = new int[10];
        for (int j = 0; j < 10; j++) {
            for (int i = k - 1; i >= 0; i--) {
                if (j == a[i]) {
                    b[j]++;
                }
            }
            if(b[j]!=0){
                System.out.println(j+":"+b[j]);
            }
        }
    }
}
