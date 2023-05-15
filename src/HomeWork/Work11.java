package HomeWork;

public class Work11 {
    public static void main(String[] args) {
        C te = new D();
        te.eat();
        te.run();

        ((D) te).Study();


    }
}

class C{
    public void run(){
        System.out.println(" C run");
    }
    public void eat(){
        System.out.println(" C eat");
    }


}

class D extends C{
    @Override
    public void run() {
        System.out.println("D run");
    }

    @Override
    public void eat() {
        System.out.println("D eat");
    }

    public void Study(){
        System.out.println(" D study");
    }
}