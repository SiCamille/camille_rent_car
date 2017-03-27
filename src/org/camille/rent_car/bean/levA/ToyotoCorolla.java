package org.camille.rent_car.bean.levA;

import java.util.HashMap;
import java.util.Map;

public class ToyotoCorolla {

	private HashMap<String, String> corolla = new HashMap<>();
	public static final int Money = 200;

	public ToyotoCorolla() {
		super();
		corolla.put("陕A5B2D7", "银色， 13058公里");
		corolla.put("陕A9W34F", "银色，9088公里");
		corolla.put("陕A75F5T", "黑色，10353公里");
	}
	
	protected ToyotoCorolla(String ID , String nature) {			//传入新车
		corolla.put(ID, nature);
		corolla.put("陕A5B2D7", "银色， 13058公里");
		corolla.put("陕A9W34F", "银色，9088公里");
		corolla.put("陕A75F5T", "黑色，10353公里");
	}

	public HashMap<String, String> getCorolla() {
		return corolla;
	}

	protected void setCorolla(String ID , String nature) {
		corolla.put(ID, nature);
	}
}
