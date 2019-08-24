package 第五题;

public class Animal {
    public  int age;
    public  Animal(int age){
        this.age=age;
    }
    public void info(){
        System.out.println("我今年"+this.age+"岁了！");
    }
}
class th{
    public static void main(String[] args) {
        Bird n=new Bird(4,"红色");
        System.out.println("\n");
        Fish y=new Fish(2,5);
    }
}
