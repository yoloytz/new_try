package poly;

public class polymorphic {
    public static void main(String[] args) {
//        Dog dog = new Dog("大黄");
        Master ytz = new Master("云天泽");
//        Bone bone = new Bone("骨头");
//        ytz.feed(dog,bone);
//
//        Cat cat = new Cat("小花");
        Fish fish = new Fish("三文鱼");
//        ytz.feed(cat,fish);
        Animal animal = new Cat("小花");
        ytz.feed(animal,fish);

        animal.catchMouse();


//        Cat cat = (Cat) animal;
//        ((Cat) animal).run();
//        cat.run();

    }
}
