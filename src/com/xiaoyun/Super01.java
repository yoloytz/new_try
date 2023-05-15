package com.xiaoyun;

public class Super01 {
    public static void main(String[] args) {
        Super03 super03 = new Super03();
        System.out.println(super03.get01N1());

    }
}

class Super02 extends Super01{
    public int n1 = 111;
    private int n2 = 222;

    public int getN2() {
        return n2;
    }
}

class Super03 extends Super02{
    public int n1 = 333;
    public int get01N1(){
        return super.getN2();
    }


}
