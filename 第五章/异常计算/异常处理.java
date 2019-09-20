package 异常计算;

import java.util.Scanner;

public class 异常处理 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("请输入被除数：");
        try{
            int num1=in.nextInt();
            System.out.print("请输入除数：");
            int num2=in.nextInt();
            System.out.print(String.format("%d/%d=%d",num1,num2,num1/num2));
        }catch (Exception e){
            System.out.println("出现错误：被除数和除数必须为整数，"
                    +"除数不能为零");
        }
    }
}