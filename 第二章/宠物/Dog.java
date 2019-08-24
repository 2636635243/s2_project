package 宠物;

public class Dog {
    String name = "无名氏";
    int health = 100;
    int love = 0;
    String strain = "聪明的拉布拉多犬";

    public void print() {
        System.out.println("宠物的自白：\n我的名字叫：" + this.name + ",健康值是：" + this.health + ",和主人的亲密度是" + this.love + ",我是一只" + this.strain);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.print();
    }
}