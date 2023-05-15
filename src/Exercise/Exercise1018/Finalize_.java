package Exercise.Exercise1018;

public class Finalize_ {
    public static void main(String[] args) {
        Car benz = new Car("奔驰C");
        System.out.println(benz.getName());

        benz = null;
        System.gc();

    }
}

class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("置空了一个对象");
    }
}
