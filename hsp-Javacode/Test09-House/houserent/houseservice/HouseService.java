package houserent.houseservice;

import houserent.domain.House;
import houserent.untility.Utility;

public class HouseService {
    private House[] houses;

    public HouseService(int size) {
        houses = new House[size];
    }

    public int houseBoolean(){//判断是否有空房  有返回房间号 无则返回-1
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void add(House newhouse, int houseId){//新增房屋信息
        if(houseId == -1){//初始房屋数组满了  进行扩容
            House[] newhouses = new House[houses.length + 1];
            for (int i = 0; i < houses.length; i++) {
                newhouses[i] = houses[i];
            }
            newhouses[houses.length] = newhouse;
            houses = newhouses;
            houses[houses.length - 1].setId(houses.length);//扩容后的id不对 需要重新设置
            return;
        }
       houses[houseId] = newhouse;
    }

    public House find(int choose){
        if(choose < 1 || choose > houses.length){//选择查找的房间编号不在房屋编号内
            return null;
        }
        if(houses[choose - 1] == null){//空房间  查找失败
            return null;
        }
        return houses[choose - 1];
    }

    public boolean del(int choose){
        if(choose < 1 || choose > houses.length){//选择删除的房间编号不在房屋编号内
            return false;
        }
        if(houses[choose - 1] == null){//空房间  删除失败
            return false;
        }
        houses[choose - 1 ] = null;//将此房间删除
        return true;
    }

    public void update(int choose, House upHouse){
        houses[choose - 1] = upHouse;
    }

    public House[] list(){
        return houses;
    }



}
