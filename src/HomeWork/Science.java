package HomeWork;

public class Science extends employee{
    private double YearSalary;

    public Science(String name, double sla, double yearSalary) {
        super(name, sla);
        YearSalary = yearSalary;
    }

    public double getYearSalary() {
        return YearSalary;
    }

    public void setYearSalary(double yearSalary) {
        YearSalary = yearSalary;
    }
}
class Teacher01 extends employee{
    private int classDay;
    private double classSal;

    public Teacher01(String name, double sla, int classDay, double classSal) {
        super(name, sla);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }
}

