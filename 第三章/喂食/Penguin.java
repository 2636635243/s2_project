package 喂食;

public class Penguin extends Pet {
    private String sex;
    public Penguin(String name, String sex){
        super(name);
        this.sex=sex;
    }
    public void print(){
        super.print();
        System.out.println("我是一只"+this.sex+"。");
    }
    @Override
    public void eat() {
        super.health=super.health+5;
        System.out.println("企鹅"+super.name+"吃饱啦!健康值增加5。");
    }
    public void swimming(){
        System.out.println("企鹅"+super.name+"正在游泳。");
        super.health=super.health-10;
        super.love=super.love+5;
    }
}