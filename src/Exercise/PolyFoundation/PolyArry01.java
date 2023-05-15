package Exercise.PolyFoundation;

public class PolyArry01 {
    public static void main(String[] args) {

        Person[] persons = new Person[5];
        persons[1] = new Person("云天泽",20);
        persons[2] = new Student("曹yb",20,2000);
        persons[3] = new Student("zwy",20,1500);
        persons[4] = new Teacher("曹杨伟",25,15000);
        persons[0] = new Person("小狗",2);

        for (int i = 0; i< persons.length;i++){
            System.out.println(persons[i].say());

            if(persons[i] instanceof Student){
                ((Student)persons[i]).study();
            }else if(persons[i] instanceof Teacher){
                ((Teacher)persons[i]).teach();
            }else {
                System.out.println("此人不是学生或者老师");
                System.out.println(persons[i].getName() + "\t" + "age =   " + persons[i].getAge());
            }
        }
    }
}
