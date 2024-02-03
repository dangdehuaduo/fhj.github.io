package com.smallchangeoop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOOP {
    boolean b = true;
    Scanner scanner = new Scanner(System.in);
    String details = "==============================零钱通明细==============================";
    double income = 0;
    double expend = 0;
    String note = "";
    double money = 1000;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm");

    public void mianMenu(){
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
                    this.details();
                    break;
                case 2:
                    this.income();
                    break;
                case 3:
                    this.expend();
                    break;
                case 4:
                    this.exit();
                    break;
                default:
                    System.out.println("你的输入有误，请重新输入：");
            }

        }while(b);
    }

    public void details(){
        System.out.println(details);
    }

    public void income(){
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
    }

    public void expend(){
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
    }

    public void exit(){
        String confirm = "";
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
            return;
        }
    }
}
