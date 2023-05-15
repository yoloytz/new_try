package Exercise.Polyparameter;

public class Workers extends Emplpyee{
    String workApproach;

    public Workers(String name, double salary) {
        super(name, salary);
    }

    public Workers(String name, double salary, String workApproach) {
        super(name, salary);
        this.workApproach = workApproach;
    }

    public String getWorkApproach() {
        return workApproach;
    }

    public void setWorkApproach(String workApproach) {
        this.workApproach = workApproach;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }

    public void work(){
        System.out.println("员工 " + this.getName() + " 正在工作中");
    }
}
