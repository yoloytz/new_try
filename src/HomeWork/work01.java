package HomeWork;

public class work01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("云天泽", 20, "上学");
        persons[1] = new Person("刘硕", 18, "打工");
        persons[2] = new Person("张", 24, "上班");



        for (int i = 0; i < 3; i++) {
            System.out.println(persons[i]);
        }

        new Person().ageSort(persons);


        System.out.println("=============");
        for (int i = 0; i < 3; i++) {
            System.out.println(persons[i]);

        }

        new Person().nameLengthsort(persons);
        System.out.println("=============nameLengthsort");
        for (int i = 0; i < 3; i++) {
            System.out.println(persons[i]);
        }

    }
}

class Person{

    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public Person() {
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    public void ageSort(Person[] persons){
        for (int i = 0; i < persons.length -1 ; i++) {
            for (int j = 0; j < persons.length - i - 1; j++) {
                if(persons[j].getAge() > persons[j+1].getAge()){
                    Person temp = null;
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j+1] = temp;
                }
            }
        }
    }

    public void nameLengthsort(Person[] persons){for (int i = 0; i < persons.length -1 ; i++) {
        for (int j = 0; j < persons.length - i - 1; j++) {
            if(persons[j].getName().length() > persons[j+1].getName().length()){
                Person temp = null;
                temp = persons[j];
                persons[j] = persons[j + 1];
                persons[j+1] = temp;
            }
        }
    }

    }
}


