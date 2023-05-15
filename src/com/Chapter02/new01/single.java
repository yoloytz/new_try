package com.Chapter02.new01;

public class single {
    public static void main(String[] args) {
        girlFriend gf10 = girlFriend.getInstance();
        girlFriend gf20 = girlFriend.getInstance();
        gf10.changeName("zmm");
        System.out.println(gf20);
        System.out.println(gf20 == gf10);
    }

}

class girlFriend {

    private String name;

    private static girlFriend gf = new girlFriend("xxx");

    public static girlFriend getInstance() {
        return gf;
    }

    public void changeName(String name){
        this.name = name;
    }

    private girlFriend(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "girlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
