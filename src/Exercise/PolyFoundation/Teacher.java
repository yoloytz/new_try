package Exercise.PolyFoundation;

import Exercise.PolyFoundation.Person;

public class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() +"\t" + "salary  =   " + salary;
    }

    public void teach(){
        System.out.println("老师" + this.getName() + "正在授课");
    }
}
