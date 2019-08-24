package 喂食;

public abstract  class Pet {
    public String name="无名氏";           //昵称
    public int health=100;            //健康值
    public int love=0;              //亲密度
    public Pet(String name){
        this.name=name;
    }
    public void print(){
        System.out.println("宠物的自白:\n我的名字叫"+this.name+"，健康值是"+this.health+"，和主人的亲密度是"+this.love+"。");
    }
    public abstract void eat();
}