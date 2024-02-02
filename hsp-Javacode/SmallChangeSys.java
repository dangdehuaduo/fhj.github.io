package com.smallchange;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean b = true;
        Scanner scanner = new Scanner(System.in);
        String details = "==============================零钱通明细==============================";
        double income = 0;
        double expend = 0;
        String note = "";
        double money = 1000;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm");


        do {
            System.out.println("------------------------------零钱通菜单------------------------------");
            System.out.println("                        1、零钱的明细");
            System.out.println("                        2、收益入账");
            System.out.println("                        3、消费");
            System.out.println("                        4、退     出");
            System.out.println("请选择（1-4):");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println(details);
                    break;
                case 2:
                    while(true){
                        System.out.println("请输入收入金额：");
                        income = scanner.nextDouble();
                        if(income > 0){
                            break;
                        }else{
                            System.out.println("输入的金额有误！");
                        }
                    }
                    money += income;
                    date = new Date();
                    details += "\n收益入账\t+" + income + "\t" + sdf.format(date) + "\t余额：" + money;
                    break;
                case 3:
                    while(true){
                        System.out.println("请输入消费金额：");
                        expend = scanner.nextDouble();
                        if(expend > 0 && expend <= money){
                            break;
                        }else{
                            System.out.println("输入的金额有误！");
                        }
                    }
                    System.out.println("请输入消费的项目：");
                    note = scanner.next();
                    money -= expend;
                    date = new Date();
                    details += "\n" + note + "\t-" + expend + "\t" + sdf.format(date) + "\t余额：" + money;
                    break;
                case 4:
                    String confirm = "";
//                    System.out.println("确认退出零钱通吗？y/n");
//                    while(true){
//                        confirm = scanner.next();
//                        if("y".equals(confirm)){
//                            b = false;
//                            System.out.println("退出零钱通！！！");
//                            break;
//                        }else if("n".equals(confirm)){
//                            break;
//                        }else{
//                            System.out.println("输入有误，请重新输入");
//                        }
//                    }

                    while(true){//先判断是否输入为y或n 不是则重复循环 直到输入正确为止!
                        System.out.println("确认退出零钱通吗？y/n");
                        confirm = scanner.next();
                        if("y".equals(confirm) || "n".equals(confirm)){
                            break;
                        }else{
                            System.out.println("输入有误！！");
                        }
                    }
                    if("y".equals(confirm)){//再判断是y还是n  进一步做出处理
                        b = false;
                        System.out.println("退出零钱通！！！");
                        break;
                    }
                    break;
                default:
                    System.out.println("你的输入有误，请重新输入：");
            }

        }while(b);



    }
}
