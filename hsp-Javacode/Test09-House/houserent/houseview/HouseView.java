package houserent.houseview;

import houserent.domain.House;
import houserent.houseservice.HouseService;
import houserent.untility.Utility;

public class HouseView {
    private boolean b = true;
    private char choose;
    //确保创建在循环外部，因为只要一个houseservice对象，
    //这个对象里面会存储所有的房屋信息，
    private HouseService houseService = new HouseService(2);

    public void mainMenu(){
        do {
            System.out.println("---------------------房屋出租系统菜单---------------------");
            System.out.println("\t\t\t\t1、新增房源");
            System.out.println("\t\t\t\t2、查找房源");
            System.out.println("\t\t\t\t3、删除房屋");
            System.out.println("\t\t\t\t4、修改房屋信息");
            System.out.println("\t\t\t\t5、房屋列表");
            System.out.println("\t\t\t\t6、退出");
            System.out.println("请输入你的选择1-6：");
            choose = Utility.readMenuSelection();
            switch (choose){
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    if(Utility.readConfirmSelection() == 'Y'){
                        b = false;
                    }
                    break;
            }
        }while(b);

    }

    public void listHouse(){
        House[] houses = houseService.list();
        for(House h : houses){
            if(h == null){
                continue;
            }
            System.out.println(h);
        }
    }

    public void addHouse(){
        int houseId = houseService.houseBoolean();
        if(houseId == -1){
            System.out.println("房间已经满了！！！");
            System.out.println("是否增加酒店的房间？");
            if(Utility.readConfirmSelection() == 'N'){
                return;
            }
        }
        System.out.println("---------------------添加房屋---------------------");
        System.out.println("姓名：");
        String name = Utility.readString(6);
        System.out.println("电话：");
        String phone = Utility.readString(15);
        System.out.println("地址：");
        String addr = Utility.readString(15);
        System.out.println("月租：");
        int rent = Utility.readInt(3000);
        System.out.println("状态：");
        String stats = Utility.readString(6);
        House house = new House(houseId + 1, name, phone, addr, rent, stats);
        houseService.add(house, houseId);
        System.out.println("---------------------添加完成---------------------");
    }

    public void delHouse(){
        System.out.println("---------------------删除房屋---------------------");
        System.out.println("请选择待删除的房间编号 （您也也可以输入 -1 退出）：");
        int choose = Utility.readInt();
        if(choose == -1){
            return;
        }
        if(Utility.readConfirmSelection() == 'N'){
            return;
        }
        if(houseService.del(choose)){
            System.out.println("---------------------删除成功---------------------");
        }else{
            System.out.println("---------------------删除失败，房间不存在！---------------------");
        }
    }

    public void findHouse(){
        System.out.println("---------------------查找房屋---------------------");
        System.out.println("请选择待查找的房间编号 ：");
        int choose = Utility.readInt();
        if(houseService.find(choose) == null){
            System.out.println("---------------------查找失败，房间不存在！---------------------");
        }else{
            System.out.println(houseService.find(choose));
        }
    }

    public void updateHouse(){
        System.out.println("---------------------修改房屋---------------------");
        System.out.println("请选择待修改的房间编号（您也也可以输入 -1 退出）：");
        int choose = Utility.readInt();
        if(choose == -1){
            return;
        }
        if(houseService.find(choose) == null){
            System.out.println("---------------------修改失败，房间不存在！---------------------");
            return;
        }
        System.out.println(houseService.find(choose));
        System.out.println("姓名：");
        String name = Utility.readString(6);
        System.out.println("电话：");
        String phone = Utility.readString(15);
        System.out.println("地址：");
        String addr = Utility.readString(15);
        System.out.println("月租：");
        int rent = Utility.readInt(3000);
        System.out.println("状态：");
        String stats = Utility.readString(6);
        House house = new House(choose, name, phone, addr, rent, stats);
        houseService.update(choose, house);
        System.out.println("---------------------修改完成---------------------");
    }
}
