package Exercise.Exercise1018;

public class Equals01 {
    public static void main(String[] args) {

        Person person1 = new Person("Jack", 20, '男');
        Person person2 = new Person("Mick", 21, '男');
        Person person4 = new Person("Jack", 20, '男');
        Person person3 = person1;
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person1 == person2);
        System.out.println(person3 == person1);

        System.out.println("=================");
        System.out.println(person1.equals(person4));

        System.out.println("================hashcode");
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());

        System.out.println(person1.toString());
        //重写toString方法 输出对象属性
        System.out.println(person2);


    }
}

class Person{
    private String name;
    private int age;
    private char gender;

    //重写Object类的equals方法
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Person){
            Person p = (Person)obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}