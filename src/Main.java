import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double x[] = new double[10];
        for (int i = 0;i < 10; i++){
            x[i] =(Math.random()*100) + 1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(x[i]);
        }
        f test929 = new f();
        test929.Max929(x);


    }
}
class f{
    public void Max929(double n[]){
        double ret;
        ret = n[0];
        for (int i = 0; i < 9; i++){
            if( n[i+1] > n[i] ){
                ret = n[i+1];
            }

        }
        System.out.println("最大数为" + ret);
    }
}
