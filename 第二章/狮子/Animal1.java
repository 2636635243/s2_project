package 狮子;

public  class Animal1 {
    public String varieties;
    public String arms;
    public String speak;
    public Animal1(String varieties, String arms, String speak){
        this.varieties=varieties;
        this.arms=arms;
        this.speak=speak;
    }
    public void info(){
        System.out.println(this.varieties+"锁定目标：用"+this.arms +"抓获！");
        System.out.println(this.varieties+"说话："+this.speak+"!");
    }
}
class th{
    public static void main(String[] args) {
        Lion l=new Lion("狮子","牙齿和利爪","嗷呜");
        System.out.println("\n");
        Frog f=new Frog("青蛙","舌头","呱呱");
    }
}
