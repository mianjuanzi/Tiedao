/**
 * @description:考试座位号（pat天梯赛）
 * @author： mianjuanzi
 * @date: 2019/4/22 0:46
 */
import java.io.*;
public class ExaminationSeatNumber2 {
    public static void main(String[] args)throws IOException{
        BufferedReader bufferedreader=new BufferedReader(new InputStreamReader(System.in));
        //创建Student类，包含成员变量id、testsite、correctsite
        class Student {
            String id;
            String testsite;
            String correctsite;
            //定义有参数的构造方法
            public Student(String id, String testsite, String correctsite) {
                this.id = id;
                this.testsite = testsite;
                this.correctsite = correctsite;
            }
        }
        int n=Integer.parseInt(bufferedreader.readLine());//输入同学人数
        Student[] students=new Student[n];//创建对象数组
        //输入每个同学信息，对每个同学进行编号
        for(int i=0;i<n;i++){
            String [] strings=bufferedreader.readLine().split(" ");
            students[i]=new Student(strings[0],strings[1],strings[2]);
        }
        int m=Integer.parseInt(bufferedreader.readLine());//输入待查询考试座位号的同学人数
        String[] test=bufferedreader.readLine().split(" ");
        //查找待查信息的同学编号
        for(int i=0;i<m;i++){
            String findTestSite=test[i];
            for(int j=0;j<n;j++){
                if(students[j].testsite.equals(findTestSite)){
                    System.out.println(students[j].id+" "+students[j].correctsite);
                }

            }
        }
    }
}
