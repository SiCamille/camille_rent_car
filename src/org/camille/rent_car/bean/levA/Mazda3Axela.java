package org.camille.rent_car.bean.levA;

import java.util.HashMap;
import java.util.Map;

public class Mazda3Axela {
	
	private HashMap<String, String> axela = new HashMap<>();
	public static final int Money = 150;
	
	public Mazda3Axela() {
		super();
		axela.put("陕A43D51", "红色， 21042公里");
		axela.put("陕AF7252", "黑色，19305公里");
	}
	
	protected Mazda3Axela(String ID , String nature) {			//传入新车
		axela.put(ID, nature);
		axela.put("陕A43D51", "红色， 21042公里");
		axela.put("陕AF7252", "黑色，19305公里");
	}

	public HashMap<String, String> getAxela() {
		return axela;
	}

	protected void setAxela(String ID , String nature) {
		axela.put(ID, nature);
	}

}
