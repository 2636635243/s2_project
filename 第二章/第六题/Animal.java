package 第六题;

public abstract class Animal {
    public String name;
    public String varieties;
    public String eat;
    public String meeting;
    public Animal(String name,String Varieties,String eat,String meeting){
        this.name=name;
        this.varieties=Varieties;
        this.eat=eat;
        this.meeting=meeting;
    }
    public void info(){
        System.out.println("我叫"+this.name+"，我是一只"+this.meeting+"!");
        System.out.println("我喜欢吃"+this.eat+"!");
        System.out.println("我会"+this.meeting+"!");
    }
}
class th{
    public static void main(String[] args) {
        Chicken c=new Chicken("喔喔","芦花鸡","虫子","打鸣");
        System.out.println("\n");
        Duck d=new Duck("嘎嘎","班嘴呀","小鱼虾","游泳");
    }
}
