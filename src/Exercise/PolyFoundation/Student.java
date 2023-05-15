package Exercise.PolyFoundation;

import Exercise.PolyFoundation.Person;

public class Student extends Person {
    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    private int score;

    @Override
    public String say() {
        return super.say() + "\t" + " score =   " + this.score;
    }

    public void study(){
        System.out.println("学生" + this.getName() + " 正在学习");
    }
}
