package Exercise.Polyparameter;

public class Emplpyee {
    private String name;
    private double salary;

    public Emplpyee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnual(){
        return getSalary()*12;
    }
}
