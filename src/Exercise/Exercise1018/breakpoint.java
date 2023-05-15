package Exercise.Exercise1018;

public class breakpoint {
    public static void main(String[] args) {
        //逐行执行代码
        int sum = 0;
        for (int i = 0; i < 5; i++){
            sum += i;
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);

        }
        System.out.println("退出for循环");
    }
}
