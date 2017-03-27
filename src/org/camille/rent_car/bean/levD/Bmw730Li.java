package org.camille.rent_car.bean.levD;

import java.util.HashMap;
import java.util.Map;

public class Bmw730Li {

	private HashMap<String, String> BMW = new HashMap<>();
	public static final int Money = 2000;
	
	public Bmw730Li() {
		super();
		BMW.put("陕ADL888", "银色，13730公里");
	}

	protected Bmw730Li(String ID , String nature) {			//传入新车
		BMW.put(ID, nature);
		BMW.put("陕ADL888", "银色，13730公里");
	}

	public HashMap<String, String> getBmw() {
		return BMW;
	}

	protected void setBmw(String ID , String nature) {
		BMW.put(ID, nature);
	}
}
