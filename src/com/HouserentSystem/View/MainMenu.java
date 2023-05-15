package com.HouserentSystem.View;

import com.HouserentSystem.Domain.House;
import com.HouserentSystem.Service.HouseServices;
import com.HouserentSystem.Utils.Utility;

public class MainMenu {
    private boolean loop = true;
    private char key = ' ';

    private HouseServices houseServices = new HouseServices(10);

    public void exit(){
        char c = Utility.readMenuSelection();
        if (c == 'Y'){
            loop = false;
        }
    }

    public void update(){
        System.out.println("请选择你要修改的房屋编号 (-1 表示退出)");
        int updateId =Utility.readInt();
        if (updateId == -1) {
            System.out.println("===========修改信息放弃===========");
            return;
        }
        boolean house= houseServices.findid01(updateId);
        if (!house){
            System.out.println("=========信息不存在==========");
            return;
        }
        House thatHouse = houseServices.findnnn(updateId);
        System.out.println("姓名" + thatHouse.getName());
        String name = Utility.readString(8,"");
        if (!"".equals(name)){
            thatHouse.setName(name);
        }

        System.out.println("电话" + thatHouse.getPhone());
        String phone = Utility.readString(12,"");
        if (!"".equals(name)){
            thatHouse.setPhone(phone);
        }


    }

    public void findHouse() {
        System.out.println("==============查找房屋信息=================");
        System.out.println("输入你想要查找的id：");
        int Findid = Utility.readInt();
        if (houseServices.findid01(Findid)){
            System.out.println("查找信息成功");
        }else {
            System.out.println("查找信息失败 不存在该信息");
        }

    }
        public void addHouse(){
        System.out.println("===================添加出租房屋===================");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址： ");
        String address = Utility.readString(18);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态： ");
        String state = Utility.readString(3);

        House newHouse = new House(0,name,phone,address,rent,state);

        if (houseServices.add(newHouse)){
            System.out.println("添加房屋信息成功");
        }else {
            System.out.println("添加失败 ");
        }
    }
    public void listHouses(){
        System.out.println("===================房屋出租系统===================");
        System.out.println("编号"+"\t\t\t"+"房主"+"\t\t\t"+"电话"+"\t\t\t"+"地址"+"\t\t\t"+"月租"+"\t\t\t"
                +"状态(已出租/未出租)");
        House[] houses = houseServices.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("===================房屋列表输出完毕===================");
    }

    public void deleteHouse(){
        System.out.println("===================删除房屋信息===================");
        System.out.println("  请选择你要删除的房屋编号： (-1)表示退出");
        int delnumber = Utility.readInt();
        if ( delnumber == -1 ){
            System.out.println("放弃删除信息");
            return;
        }
        System.out.println("是否确认删除？ 输入Y或者N");
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y'){
            if (houseServices.Del(delnumber)){
                System.out.println("删除房屋信息成功");
            }else {
                System.out.println("删除房屋信息失败 ， 请重新尝试 ");
            }
        }else if (choice == 'N'){
            return;
        }


    }
    public void mainMenu(){
        do {
            System.out.println("===================房屋出租系统===================");
            System.out.println("\t\t\t1 新 增 房 屋");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 显 示 房 屋 信 息");
            System.out.println("\t\t\t6 退 出 房 屋 信 息 系 统");
            System.out.println("  请输入你的选择 （1 - 6）");

            key = Utility.readChar();
            switch (key){
                case '1':
                    System.out.println("新增");
                    addHouse();
                    break;
                case '2':
                    System.out.println("查找");
                    findHouse();
                    break;
                case '3':
                    System.out.println("删除");
                    deleteHouse();
                    break;
                case '4':
                    System.out.println("修改");
                    update();
                    break;
                case '5':
                    System.out.println("显示");
                    listHouses();
                    break;
                case '6':
                    System.out.println("退出选择");
                    exit();
                    break;
            }
        }while (loop);

    }
}
