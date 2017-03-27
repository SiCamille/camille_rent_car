package org.camille.rent_car.bean;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Car implements Comparable<Car>{
	
	private String color;
	private int km;
	private String lev;
	private String name;
	private String version;
	private int money;
	private String ID;
	private int num;
	
	public Car() {
		super();
	}
	
	public Car(int num , String lev, String name , String version ,String color, int km , int money , String ID) {
		super();
		this.num = num;
		this.color = color;
		this.km = km;
		this.lev = lev;
		this.name = name;
		this.version = version;
		this.money = money;
		this.ID = ID;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public String getLev() {
		return lev;
	}

	public void setLev(String lev) {
		this.lev = lev;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String toString() {
		return "��ţ�" + num + "  ��" + this.getName() + "Ϊ" + this.getVersion() + "�汾��" + this.getColor() + "ɫ��" + this.getKm() + "������Ϊ" + this.getMoney() + "Ԫ/�� ���ƺ�Ϊ " + this.getID();  
	}

	@Override
	public int compareTo(Car c2) {
		return this.name.compareToIgnoreCase(c2.name);
	}

}
