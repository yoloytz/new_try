package poly.Detail;

public class PolyDetail2 {
    public static void main(String[] args) {
        Base base = new Sub();
        System.out.println(base.count);
//        Sub sub = new Sub();
//        System.out.println(sub.count);

//        sub.dog();
        Sub sub = (Sub)base;
        sub.dog();

    }
}

class Base{
    int count = 10;

//    public void dog(){
//        System.out.println("dog wang!111");
//    }
}

class Sub extends Base{
    int count = 20;

    public void dog(){
        System.out.println("dog wang!222");
    }
}