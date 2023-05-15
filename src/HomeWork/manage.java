package HomeWork;

public class manage extends workers{
    private double grate;

    public manage(String name, double daySalary, int workdays, double grate) {
        super(name, daySalary, workdays);
        this.grate = grate;
    }

    public void printsalary(){
        System.out.println("经理" + this.getName() + "   薪水为" + getDaySalary()*getWorkdays()*grate);
    }

    public double getGrate() {
        return grate;
    }

    public void setGrate(double grate) {
        this.grate = grate;
    }
}
