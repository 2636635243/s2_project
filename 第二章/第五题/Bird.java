package 第五题;

public class Bird extends Animal {
    public String color;
    public Bird(int age,String color){
        super(age);
        this.color=color;
        info();
    }
    public String getColor(){
        return color;
    }
    @Override
    public void info(){
        System.out.println("我是一只"+this.color+"的鸟！");
        super.info();
    }
}