package smallChange.src.munu1.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是通过OOP完成零钱通
 * 面向对象编程
 * 将各个功能对应一个方法
 */
public class smallChangeOOP {

    //明细三个思路（1）把收益入账和消费保存到数组 （2）使用对象  （3）使用String 拼接

    String detail = "==================OOP零钱通明细==================" + "\n";

    //功能完成增加新的变量  完成收益入账功能
    double money = 0;
    double balance = 0;
    //        double consumption = 0;
    String note = "";

    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");


    Scanner scanner = new Scanner(System.in);
    boolean loop = true;
    String key = "";

    public void mainMenu(){
        System.out.println("显示零钱通菜单");
        do {
            System.out.println("==================零钱通菜单==================");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");

            System.out.println("请选择菜单内容 （1-4）");
            key = scanner.next();

            //使用Switch语句分支控制
            switch (key){
                case "1" :
                    this.Detail();
                    break;
                case "2" :
                    this.income();
                    break;
                case "3" :
                    this.pay();
                    break;
                case "4" :
                    this.exit();



                default:
                    System.out.println("选择输入有误请输入1-4的数字");
            }
        } while (loop);
    }

    public void Detail(){
        System.out.println(detail);
    }

    //完成收益入账

    public void income(){
        System.out.println("   收益入账金额  ： ");
        money = scanner.nextDouble();
        //检验入账的金额是否合法
        if (money < 0){
            System.out.println("请输入一个大于0的合法金额");
            return;//退出后面不再执行后面的方法
        }

        balance += money;
        date = new Date();
        //获取当前日期
//                    System.out.println(sdf.format(date));

        detail += "\t收益入账\t" + money + "\t" +sdf.format(date) + "\t" +balance + "\n";
    }

    public void pay(){
        System.out.println("   消费  ： ");

        System.out.println("请输入消费金额");
        money = scanner.nextDouble();

        if(money < 0 || money > balance){
            System.out.println("请输入正确的消费金额  应该在 0 - " + balance + "之间");
            return;
        }

        System.out.println("请输入消费说明");
        note = scanner.next();

        balance -= money;
        date = new Date();

        detail += "\t" + note + "\t" + "-" + money +"\t" + sdf.format(date) +"\t" +  balance +"\n";

    }

    public void exit(){
        String choice = "";
        while (true){
            System.out.println("   您是否确定退出  ？ 请输入yes确定或者no返回界面");
            choice = scanner.next();
            if(choice.equals("yes") || choice.equals("no")){
                break;
            }
        }
        if (choice.equals("yes")){
            loop = false;
        }
    }




}
