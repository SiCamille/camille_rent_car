package org.camille.rent_car.demo;

import java.util.ArrayList;
import java.util.Scanner;
import org.camille.rent_car.bean.Car;
import org.camille.rent_car.service.SetCar;
import org.camille.rent_car.util.MyUtils;

public class GetACar {
	
	ArrayList<Car> hm = new SetCar().setCar();
	Scanner sc = new Scanner(System.in);
	
	GetACar() {}
	
	public void getACar() {
		showA();
	}

	private void showA() {
		System.out.println("本公司A级车现提供丰田卡罗拉(今年主打车型，三日之内八折),新思域,马3昂克赛拉。租金可能根据车况不同有轻微浮动。");
		showCar();
	}

	private void showCar() {
		System.out.println("1.新思域:2014款手动豪华版，特点为动力传感器灵敏，缺点为轮胎噪音大，底盘薄。日租金为120/天");
		System.out.println("-------------------------------------------------------------");
		System.out.println("2.马自达3昂克赛拉:2015款1.5自动挡，特点为省油(百公里7.5左右)，外观好看，缺点为轮胎较硬 , 噪音较大。日租金150/天");
		System.out.println("-------------------------------------------------------------");
		System.out.println("3.丰田卡罗拉:本公司今年主打车型，皆为新车，2016混动双擎1.6款,特点为省油(日产车) ，动力足，缺点为空间较小，日系车(手动微笑)。日租金200/天。(三日内八折)");
		getClientIn();
	}

	private void getClientIn() {
		System.out.println("请您选择您需要的车型。 \n 1:　新思域  \n 2:　马自达3昂克赛拉 \n 3:　丰田卡罗拉 \n 4:　返回上一层");
		int key = MyUtils.getIn(4);
		if(key == 1) {
			for(Car c : hm) {
				if(c.getName().equals("NewCivic")) {
					System.out.println(c);
				}
			}
			System.out.println("订车请输入对应的编号,返回请按0");
		} else if(key == 2) { 
			for(Car c : hm) {
				if(c.getName().equals("Mazda3Axela")) {
					System.out.println(c);
				}
			}
			System.out.println("订车请输入对应的编号,返回请按0");
		} else if(key == 3) {
			for(Car c : hm) {
				if(c.getName().equals("ToyotoCorolla")) {
					System.out.println(c);
				}
			}
			System.out.println("订车请输入对应的编号,返回请按0");
		} else if(key == 4) {
			showA();
		}
		
	}
	
}

