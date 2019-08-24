package 喂食;

public class Cat extends Pet {
    private String color;
    public Cat(String name, String color){
        super(name);
        this.color=color;
    }
    public void print(){
        super.print();
        System.out.println("我是一只"+this.color+"的猫。");
    }
    @Override
    public void eat() {
        super.health=super.health+4;
        System.out.println("猫咪"+super.name+"吃饱啦!健康值增加4。");
    }
}