package org.camille.rent_car.bean.levB;

import java.util.HashMap;
import java.util.Map;

public class AudiA4 {

	private HashMap<String, String> a4 = new HashMap<>();
	public static final int Money = 400;
	
	public AudiA4() {
		super();
		a4.put("陕A73DT5", "黑色，53052公里");
		a4.put("陕A686E2", "黑色，43283公里");
	}
	
	protected AudiA4(String ID , String nature) {
		a4.put(ID, nature);
		a4.put("陕A73DT5", "黑色，53052公里");
		a4.put("陕A686E2", "黑色，43283公里");
	}
	
	public HashMap<String, String> getA4() {
		return a4;
	}
	
	protected void setA4(String ID , String nature) {
		a4.put(ID, nature);
	}
	
	
}
