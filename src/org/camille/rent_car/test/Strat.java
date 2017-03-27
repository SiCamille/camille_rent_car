package org.camille.rent_car.test;

import org.camille.rent_car.demo.showClient;
import org.camille.rent_car.util.MyUtils;

public class Strat {

    public static void main(String[] args) {
        goToSystem();
    }

    private static void goToSystem() {
        Welcome();
    }

    private static void Welcome() {
        System.out.println("\t\t\t欢迎进入祀城租车系统");
        System.out.println("请选择您的身份。");
        selectID();
    }

    private static void selectID() {
        System.out.println("客户请按1,管理员请按2,退出系统请按3：");
        int key = MyUtils.getIn(3);
        if(key == 1) {
            showClient client = new showClient();
            client.main(null);
        } else if(key == 2) {
            
        } else if(key == 3) {
            System.out.println("\t\t\t十分感谢您的使用，下次再见");
            System.exit(0);
        }
    }
}
