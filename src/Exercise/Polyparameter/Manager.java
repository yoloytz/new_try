package Exercise.Polyparameter;

public class Manager extends Emplpyee{
    double bonus;
    String mannagementApproach;

    public Manager(String name, double salary, double bonus, String mannagementApproach) {
        super(name, salary);
        this.bonus = bonus;
        this.mannagementApproach = mannagementApproach;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getMannagementApproach() {
        return mannagementApproach;
    }

    public void setMannagementApproach(String mannagementApproach) {
        this.mannagementApproach = mannagementApproach;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + this.bonus;
    }

    public void manage(){
        System.out.println("经理 " + getName() + " 正在管理中666");
    }
}
