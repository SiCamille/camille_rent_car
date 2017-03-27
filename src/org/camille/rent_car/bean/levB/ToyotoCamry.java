package org.camille.rent_car.bean.levB;

import java.util.HashMap;
import java.util.Map;

public class ToyotoCamry {
	private HashMap<String, String> camry = new HashMap<>();
	public static final int Money = 300;
	
	public ToyotoCamry() {
		super();
		camry.put("陕A79EF2", "银色，5630公里");
		camry.put("陕A686E2", "银色，7875公里");
	}
	
	protected ToyotoCamry(String ID , String nature) {			//传入新车
		camry.put(ID, nature);
		camry.put("陕A79EF2", "银色，5630公里");
		camry.put("陕A686E2", "银色，7875公里");
	}

	public HashMap<String, String> getCamry() {
		return camry;
	}

	protected void setCamry(String ID , String nature) {
		camry.put(ID, nature);
	}
}
