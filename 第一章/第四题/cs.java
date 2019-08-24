package 第四题;

import java.util.Scanner;

public class cs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Student s=new Student();
        System.out.print("请输入你的名字：");
        s.name =input.next();
        System.out.print("请输入你的年龄：");
        s.old=input.nextInt();
        s.steOld(s.old);
    }
}
