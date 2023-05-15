package poly;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
//    public void run(){
//        System.out.println("cat跑222");
//    }
}


