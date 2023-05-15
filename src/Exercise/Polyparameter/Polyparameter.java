package Exercise.Polyparameter;

public class Polyparameter {
    public static void main(String[] args) {
        Emplpyee jackcy = new Workers("Jackcy", 2500);
        Emplpyee tom = new Manager("Tom",3000,15000,"加班");
        Test test = new Test();
        test.showEmpAnnal(jackcy);
        test.showEmpAnnal(tom);
        test.shouworkapproach(jackcy);
        test.shouworkapproach(tom);
        
       
        
    }
}

class Test {

    public void showEmpAnnal(Emplpyee e){
        System.out.println(e.getAnnual());
    }
    public void shouworkapproach(Emplpyee e){
        if (e instanceof Workers){
            ((Workers) e).work();
        }else if(e instanceof Manager){
            ((Manager) e).manage();
        }

    }
}

