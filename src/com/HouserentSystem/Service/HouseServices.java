package com.HouserentSystem.Service;

import com.HouserentSystem.Domain.House;

public class HouseServices {
    private House houses[];
    private int HouseNumber = 0;
    private int idCounter =0 ;




    public HouseServices(int size){
        //new house
        this.houses = new House[size];
//        houses[0] = new House(1,"jack","1322","建设路Qt100",2000,"未出租");
    }


    public boolean findid01(int findid){
        int index = -1;
        for (int i = 0; i < HouseNumber; i++) {
            if (findid == houses[i].getId()){
                System.out.println("信息如下");
                System.out.println(houses[i]);
                index = 1;
            }
        }
        if(index == -1){
            return false;
        }
        return true;
    }


    //add新对象
    public boolean add(House newHouse) {
        if (HouseNumber == houses.length) {
            System.out.println("数组已满，不能继续添加了");
            return false;
        }
        newHouse.setId(++idCounter);
        houses[HouseNumber++] = newHouse;
        //程序员需要设计一个id自增长
        return true;


    }

    public boolean Del(int delid){
        int index = -1;
        for (int i = 0; i < HouseNumber; i++) {
            if (delid == houses[i].getId()){

                index = i;
                //用index记录找到的下标i
            }
        }
        if (index == -1){
            return false;
        }
        for (int i = index; i < HouseNumber - 1; i++) {
            houses[i] =houses[i+1];
        }
        houses[--HouseNumber] = null;
        return true;
    }

    public House findnnn(int i){
        return houses[i];
    }

    public House[] list(){
            return houses;
    }
}
