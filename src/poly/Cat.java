package poly;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }

    public void run(){
        System.out.println("cat跑");
    }
}
