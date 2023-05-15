package Exercise.Exercise1018;

public class DebugExercise {
    public static void main(String[] args) {
        Person0 persontest = new Person0("Jack", 20);
        System.out.println(persontest.toString());
    }
}

class Person0{
    private String name;
    private int age;

    public Person0(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person0{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

