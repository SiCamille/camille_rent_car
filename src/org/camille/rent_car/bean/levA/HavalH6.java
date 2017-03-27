package org.camille.rent_car.bean.levA;

import java.util.HashMap;
import java.util.Map;

public class HavalH6 {
	
	private HashMap<String, String> h6 = new HashMap<>();
	public static final int Money = 150;
	
	public HavalH6() {
		super();
		h6.put("陕A20EF3", "红色，6850公里");
		h6.put("陕ARC65Q", "银色，8637公里");
	}
	/*
	 * 第一辆车牌号为陕A20EF3，红色，6850公里
			第二辆车牌号为陕ARC65Q，银色，8637公里
	 */
	protected HavalH6(String ID , String nature) {			//传入新车
		h6.put(ID, nature);
		h6.put("陕A20EF3", "红色，6850公里");
		h6.put("陕ARC65Q", "银色，8637公里");
	}

	public HashMap<String, String> getH6() {
		return h6;
	}

	protected void setH6(String ID , String nature) {
		h6.put(ID, nature);
	}
}
