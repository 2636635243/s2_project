package 喂食;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Master master=new Master("王先生",100);
        Scanner input=new Scanner(System.in);
        System.out.println("欢迎来到宠物店！");
        System.out.print("请选择要领养的宠物类型：（1, 狗狗 2, 企鹅）");
        int typeId=input.nextInt();
        Pet pet=master.getPet(typeId);
        if (pet!=null){
            System.out.println("领养成功！");
            master.feed(pet);
            master.play(pet);
        }else {
            System.out.println("对不起，没有此类型的宠物，领养失败");
            System.out.println("请重新选择" +
                    "" +
                    "");
        }
    }
}