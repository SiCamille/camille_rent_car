package org.camille.rent_car.demo;

import java.util.ArrayList;
import org.camille.rent_car.bean.Car;
import org.camille.rent_car.service.SetCar;
import org.camille.rent_car.util.MyUtils;

public class showClient {

	public static void main(String[] args) {
		welcome();
	}

	private static void welcome() {
		System.out.println("\t\t\t欢迎进入客户界面");
		System.out.println("本页面将为您展示本公司现存车辆");
		showCar();
		
	}

	private static void showCar() {
		ArrayList<Car> hm = new SetCar().setCar();
		System.out.println("请选择您心仪的价格或车型:");
		System.out.println("1:A级车(120-220/日) \n2:家用SUV(190-230/日) \n3:B级车(300-450/日) \n4:C级车(800/日) \n5:D级车(2000/日)");
		int key = MyUtils.getIn(6);
		if(key == 1) {
			boolean b = false;
			System.out.println("本公司的A级车余车情况如下:");
			for(Car c : hm) {
				if(c.getLev().equals("A")) {
					b = true;
					System.out.println(c);
				}
			}
			if(b) {
				System.out.println("您准备好订车了吗？订车请按1,继续浏览请按2,离开请按3");
				int clientIn = MyUtils.getIn(3);
				if(clientIn == 1) {
					GetACar gac = new GetACar();
					gac.getACar();
				} else if(clientIn == 2) {
					showCar();
				} else if(clientIn == 3) {
				    MyUtils.byebye();
				}
			}
			if(!b) {
				System.out.println("A级车已租空,请等待或选择其他等级。");
				showCar();
			}
		} else if(key == 2) {
			boolean b = false;
			System.out.println("本公司的SUV现仅提供哈佛H6余车情况如下:");
			for(Car c : hm) {
				if(c.getLev().equals("SUV")) {
					b = true;
					System.out.println(c);
				}
			}
			if(b) {
				System.out.println("您准备好订车了吗？订车请按1,继续浏览请按2,离开请按3");
				int clientIn = MyUtils.getIn(3);
				if(clientIn == 1) {
					
				} else if(clientIn == 2) {
					showCar();
				} else if(clientIn == 3) {
				    MyUtils.byebye();
				}
			}
			if(!b) {
				System.out.println("SUV已租空,请等待或选择其他等级。");
				showCar();
			}
		} else if (key == 3) {
			boolean b = false;
			System.out.println("本公司的B级车现提供丰田凯美瑞,奥迪A4,余车情况如下:");
			for(Car c : hm) {
				if(c.getLev().equals("B")) {
					b = true;
					System.out.println(c);
				}
			}
			if(b) {
				System.out.println("您准备好订车了吗？订车请按1,继续浏览请按2,离开请按3");
				int clientIn = MyUtils.getIn(3);
				if(clientIn == 1) {
					
				} else if(clientIn == 2) {
					showCar();
				} else if(clientIn == 3) {
				    MyUtils.byebye();
				}
			}
			if(!b) {
				System.out.println("B级车已租空,请等待或选择其他等级。");
				showCar();
			}
		} else if(key == 4) {
			boolean b = false;
			System.out.println("本公司的C级车现仅提供奥迪A4余车情况如下:");
			for(Car c : hm) {
				if(c.getLev().equals("C")) {
					b = true;
					System.out.println(c);
				}
			}
			if(b) {
				System.out.println("您准备好订车了吗？订车请按1,继续浏览请按2,离开请按3");
				int clientIn = MyUtils.getIn(3);
				if(clientIn == 1) {
					
				} else if(clientIn == 2) {
					showCar();
				} else if(clientIn == 3) {
				    MyUtils.byebye();
				}
			}
			if(!b) {
				System.out.println("C级车已租空,请等待或选择其他等级。");
				showCar();
			}
		} else if(key == 5) {
			boolean b = false;
			System.out.println("本公司的D级车为镇店车BMW730LI:");
			for(Car c : hm) {
				if(c.getLev().equals("D")) {
					b = true;
					System.out.println(c);
				}
			}
			if(b) {
				System.out.println("您准备好订车了吗？订车请按1,继续浏览请按2,离开请按3");
				int clientIn = MyUtils.getIn(3);
				if(clientIn == 1) {
					
				} else if(clientIn == 2) {
					showCar();
				} else if(clientIn == 3) {
				    MyUtils.byebye();
				}
			}
			if(!b) {
				System.out.println("D级车已租空,请等待或选择其他等级。");
				showCar();
			}
		}
	} 
}
