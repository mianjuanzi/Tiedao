/**
 * @description:N个数求和(tiantisai)
 * @author： mianjuanzi
 * @date: 2019/4/23 13:10
 */
import java.util.Scanner;
public class L1_009 {
    public static void main(String[] args){
        class Fraction{//创建分数类
            String fraction;
            public Fraction(String fraction ){
                this.fraction=fraction;
            }
            int getNu(){//get分子
                return Integer.parseInt(fraction.substring(0,fraction.indexOf("/")));
            }
            int getDe(){//get分母
                return Integer.parseInt(fraction.substring(fraction.indexOf("/")+1));
            }
        }
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        Fraction[] fractions=new Fraction[n];
        for(int i=0;i<n;i++){
            fractions[i]=new Fraction(scan.next());
        }
        int numerator=0;//和的分子
        int denominator=1;//和的分母
        for(int i=0;i<n;i++){
            numerator=numerator*fractions[i].getDe()+denominator*fractions[i].getNu();
            denominator*=fractions[i].getDe();
        }
        int min;//分子和分母中较小者
        if(Math.abs(numerator)<Math.abs(denominator)){
            min=Math.abs(numerator);
        }
        else min=denominator;
        int max=1;//分母和分子的最大公因式
        for(int i=1;i<=min;i++){
            if(numerator%i==0&&denominator%i==0){
                max=i;
            }
        }
        numerator/=max;
        denominator/=max;
        double ratio=(double )numerator/(denominator);
        if(Math.abs(ratio)>=1&&numerator % denominator == 0) {
                System.out.println(numerator/denominator);
            }
        if(Math.abs(ratio)>=1&&numerator % denominator != 0){
                int integerpart = (int) numerator / denominator;
                numerator = numerator - denominator * integerpart;
                System.out.println(integerpart + " " + numerator + "/" + denominator);
            }
        if(Math.abs(ratio)<1&&Math.abs(ratio)>0){
            System.out.println(numerator + "/" + denominator);
        }
        if(Math.abs(ratio)==0){
            System.out.println(0);
        }
    }
}
