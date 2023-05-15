package HomeWork;

public class Work03 {
    public static void main(String[] args) {
        staff ytz = new staff("云天泽", 150, 24);
        manage zmy = new manage("张美宇",500,20,1.3);

        ytz.printsalary();
        zmy.printsalary();

    }
}

class workers{
    private String name;
    private double daySalary;
    private int Workdays;

    public void printsalary(){
        System.out.println("员工" + this.getName() + "   薪水为" + getDaySalary()*getWorkdays());
    }

    public workers(String name, double daySalary, int workdays) {
        this.name = name;
        this.daySalary = daySalary;
        Workdays = workdays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getWorkdays() {
        return Workdays;
    }

    public void setWorkdays(int workdays) {
        Workdays = workdays;
    }
}