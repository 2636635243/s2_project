package 第四题;

public class Student {
    public String name;
    public int old;
    public int getOld(){
        return old;
    }
    public void steOld(int old) {
        if (old < 16) {
            System.out.println("错误信息");
        } else {
            this.old = old;
            shou();
        }
    }
    public void shou(){
        System.out.println("我的名字叫"+this.name+",我今年"+this.old+"岁");
    }
}