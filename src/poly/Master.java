package poly;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //animal的编译类型为Aniaml 可以指向与接收Animal子类的对象
    //food的变异类型为Food 可以指向与接收Food子类的对象
    public void feed(Animal animal,Food food){
        System.out.println("主人 " + name + "给" + animal.getName() + " 吃 " + food.getName());
    }
//    public void feed(Dog dog,Bone bone){
//        System.out.println("主人 " + name + "给" + dog.getName() + " 吃 " + bone.getName());
//    }
//
//    public void feed(Cat cat,Fish fish){
//        System.out.println("主人 " + name + "给" + cat.getName() + " 吃 " + fish.getName());
//    }
}
