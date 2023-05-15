package HomeWork;

public class work04 {
    public static void main(String[] args) {
        employee ynp = new Science("小y",8000,10000);
        employee hlh = new Teacher01("小何",8000,30,500);
        employee ytz = new WorkEr("云天泽", 30000);
        System.out.println("===============年薪水平===============");
        new gongneng().Printsss(ynp);

        gongneng CC = new gongneng();
        CC.Printsss(hlh);
        CC.Printsss(ytz);

    }
}

class employee{
    private String name;
    private double sla;

    public employee(String name, double sla) {
        this.name = name;
        this.sla = sla;
    }

    public employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSla() {
        return sla;
    }

    public void setSla(double sla) {
        this.sla = sla;
    }



    }


