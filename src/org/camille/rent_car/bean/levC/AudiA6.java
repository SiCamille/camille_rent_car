package org.camille.rent_car.bean.levC;

import java.util.HashMap;
import java.util.Map;

public class AudiA6 {
	
	private HashMap<String, String> a6 = new HashMap<>();
	public static final int Money = 800;
	
	public AudiA6() {
		super();
		a6.put("陕A88I48", "黑色，62824公里");
	}
	
	protected AudiA6(String ID , String nature) {			//传入新车
		a6.put(ID, nature);
		a6.put("陕A88I48", "黑色，62824公里");
	}

	public HashMap<String, String> getA6() {
		return a6;
	}

	protected void setA6(String ID , String nature) {
		a6.put(ID, nature);
	}
}
