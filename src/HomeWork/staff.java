package HomeWork;

public class staff extends workers{
    public staff(String name, double daySalary, int workdays) {
        super(name, daySalary, workdays);
    }

    @Override
    public void printsalary(){
        System.out.println("普通员工" + this.getName() + "   薪水为" + getDaySalary()*getWorkdays());
    }
}
