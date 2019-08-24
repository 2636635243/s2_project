package 喂食;

public class Dog extends Pet {
    private String strain;
    public Dog(String name, String strain){
        super(name);
        this.strain=strain;
    }
    public void print(){
        super.print();
        System.out.println("我是一只"+this.strain+"。");
    }
    @Override
    public void eat() {
        super.health=super.health+3;
        System.out.println("狗狗"+super.name+"吃饱啦!健康值增加3。");
    }
    public void catchingFiyDisc(){
        System.out.println("狗狗"+super.name+"正在接飞盘。");
        super.health=super.health-10;
        super.love=super.love+5;
    }
}