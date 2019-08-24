package 第五题;

public class Fish extends Animal {
    public int weight;
    public Fish(int age,int weight){
        super(age);
        this.weight=weight;
        info();
    }
    public int getWeight(){
        return weight;
    }
    @Override
    public void info(){
        System.out.println("我是一只"+this.weight+"斤重的鱼！");
        super.info();
    }
}
