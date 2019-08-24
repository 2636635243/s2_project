package 宠物;

public class Penguin {
    String name = "无名氏";
    int health = 100;
    int love = 0;
    final String SEX_MALE="雄";
    final String SEX_FEMALE="雌";
    String sex=SEX_MALE;

    /**public Penguin() {
     name = "楠楠";
     int health = 100;
     love = 50;
     sex="Q妹";
     System.out.println("执行构造方法");
     }*/

    public void print(){
        System.out.println("宠物的自白：\n我的名字叫："+this.name+",健康值是："+this.health+",和主人的亲密度是"+this.love+",性别是"+this.sex);
    }

    public static void main(String[] args) {
        Penguin penguin=new Penguin();
        penguin.print();
    }
}
