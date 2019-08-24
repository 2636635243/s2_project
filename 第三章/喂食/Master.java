package 喂食;

public class Master {
    public String name="";
    public int money=0;
    public Master(String name, int money){
        this.name=name;
        this.money=money;
    }
    public void feed(Pet pet){
        pet.eat();
    }
    public void feed(Dog dog){
        dog.eat();
    }
    public void feed(Penguin pgn){
        pgn.eat();
    }
    public void feed(Cat cat){
        cat.eat();
    }
    public Pet getPet(int typeId){
        Pet pet=null;
        if (typeId==1){
            pet=new Dog("欧欧","雪纳瑞");
        }else if (typeId==2){
            pet=new Penguin("楠楠","Q妹");
        }
        return pet;
    }
    public void play(Pet pet){
        if(pet instanceof Dog){
            Dog dog=(Dog)pet;
            dog.catchingFiyDisc();
        }else if (pet instanceof Penguin){
            Penguin pgn=(Penguin) pet;
            pgn.swimming();
        }
    }
}