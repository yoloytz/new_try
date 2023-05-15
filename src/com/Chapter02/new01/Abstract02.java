package com.Chapter02.new01;

public class Abstract02 {
    public static void main(String[] args) {
        new sons().job();
        int sum = 0;
        Long time = System.currentTimeMillis();
        for (int i = 0; i < 999999; i++) {
            sum += i;
        }
        Long Timeout = System.currentTimeMillis();
        System.out.println("时间差为 " + (Timeout- time));

        new daughters().job();
    }
}

abstract class Family{
    private String name;
    public abstract void function();

    public void job(){
        function();
        System.out.println("我现在在工作啦");
        System.out.println("大家晚上好 我回家了");
    }
}

class sons extends Family{

    @Override
    public void function() {
        System.out.println("我是儿子");
    }

    @Override
    public void job() {
        super.job();
        System.out.println("job儿子引用成功");
    }
}

class daughters extends Family{
    @Override
    public void function() {
        System.out.println("我是姑凉");
    }

    @Override
    public void job() {
        System.out.println("job女儿引用失败");
    }
}
