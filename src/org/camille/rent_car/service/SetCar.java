package org.camille.rent_car.service;

import java.util.ArrayList;
import org.camille.rent_car.bean.Car;

public class SetCar extends Car{

	public ArrayList<Car> setCar() {
		/* HashMap<String , HashMap<String, HashMap<String , String>>> hm = new HashMap<>();
		Mazda3Axela m3a = new Mazda3Axela();
		HashMap<String , String> axela =  m3a.getAxela();
		NewCivic nc = new NewCivic();
		HashMap<String, String> civic = nc.getCivic();
		ToyotoCorolla tco = new ToyotoCorolla();
		HashMap<String, String> corolla = tco.getCorolla();
		HashMap<String, HashMap<String , String>> tmA = new HashMap<>();
		tmA.put("Axela", axela);
		tmA.put("Civic", civic);
		tmA.put("Corolla", corolla);
		hm.put("A级车", tmA);
		AudiA4 aa4 = new AudiA4();
		HashMap<String, String> a4 = aa4.getA4();
		ToyotoCamry tca = new ToyotoCamry();
		HashMap<String, String> camry = tca.getCamry();
		HashMap<String, HashMap<String , String>> tmB = new HashMap<>();
		tmB.put("A4", a4);
		tmB.put("Camry", camry);
		hm.put("B级车", tmB);
		AudiA6 aa6 = new AudiA6();
		HashMap<String, String> a6 = aa6.getA6();
		HashMap<String, HashMap<String , String>> tmC = new HashMap<>();
		tmC.put("A6", a6);
		hm.put("C级车", tmC);
		Bmw730Li bmw = new Bmw730Li();
		HashMap<String, String> bmw730 = bmw.getBmw();
		HashMap<String, HashMap<String , String>> tmD = new HashMap<>();
		tmD.put("BMW730", bmw730);
		hm.put("D级车", tmD);
		HavalH6 hh = new HavalH6();
		HashMap<String, String> h6 = hh.getH6();
		HashMap<String, HashMap<String , String>> suv = new HashMap<>();
		suv.put("H6", h6);
		hm.put("SUV", suv);
		return hm; */
		Car c1 = new Car(14,"A","NewCivic","2014款手动1.5豪华版","银",35752 , 120 , "陕A2FA85");
		Car c2 = new Car(13,"A","Mazda3Axela","2014款1.4手动挡","黑",19305 , 140 , "陕AF7252");
		Car c3 = new Car(12,"A","Mazda3Axela","2015款1.6自动挡","红",21042 , 160 , "陕A43D51");
		Car c4 = new Car(11,"A","ToyotaCorolla","2016混动双擎1.6款","银",13058 , 200 , "陕A5B2D7");
		Car c5 = new Car(10,"A","ToyotaCorolla","2016混动双擎1.6款","黑",10353 , 210 , "陕A75F5T");
		Car c6 = new Car(9,"A","ToyotaCorolla","2016混动双擎1.6款","蓝",9088 , 220 , "陕A9W34F");
		Car c7 = new Car(8,"SUV","HavalH6","2016 1.6运动款","红",6850 , 190 , "陕A20EF3");
		Car c8 = new Car(7,"SUV","HavalH6","2016 1.6顶配款","白银",8637 , 230 , "陕ARC65Q");
		Car c9 = new Car(6,"B","ToyotaCamry","2014 2.0标准版","黑",44832 , 270 , "陕A686E2");
		Car c10 = new Car(5,"B","ToyotaCamry","10周年纪念2.0豪华版","银",5630 , 300 , "陕A79EF2");
		Car c11 = new Car(4,"B","AudiA4","2014 3.0舒适款","黑",53052 , 400 , "陕A73DT5");
		Car c12 = new Car(3,"B","AudiA4","2014 3.0运动款","红",43283 , 430 , "陕A686E2");
		Car c13 = new Car(2,"C","AudiA6","2014 TFSI运动型","黑",62824 , 800 , "陕A88I48");
		Car c14 = new Car(1,"D","Bmw730Li","2016 730Li领先款","红",13434 , 2000 , "陕ADL888");
		ArrayList<Car> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		list.add(c6);
		list.add(c7);
		list.add(c8);
		list.add(c9);
		list.add(c10);
		list.add(c11);
		list.add(c12);
		list.add(c13);
		list.add(c14);
		return list;
	}
}
