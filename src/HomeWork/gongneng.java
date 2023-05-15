package HomeWork;

public class gongneng extends employee{
    public void Printsss(employee n) {

        if (n instanceof Science) {
            System.out.println("科学家" + n.getName() + "一年的薪水为 " + (n.getSla()+((Science) n).getYearSalary()+n.getSla()));
        } else if (n instanceof Teacher01) {
            System.out.println("老师" + n.getName() + "一年的薪水为" + (((Teacher01) n).getClassDay() * ((Teacher01) n).getClassSal() + n.getSla()));
        } else {
            System.out.println("普通人" + n.getName() + "年薪为" + n.getSla());
        }
    }
}
