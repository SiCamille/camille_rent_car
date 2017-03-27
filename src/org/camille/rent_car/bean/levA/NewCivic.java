package org.camille.rent_car.bean.levA;

import java.util.HashMap;

public class NewCivic {

	private HashMap<String, String> civic = new HashMap<>();
	public static final int Money = 120;
	
	public NewCivic() {
		super();
		civic.put("陕A43D51", "红色， 21042公里");
		civic.put("陕AF7252", "黑色，19305公里");
	}
	
	protected NewCivic(String ID , String nature) {			//传入新车
		civic.put(ID, nature);
		civic.put("陕A43D51", "红色， 21042公里");
		civic.put("陕AF7252", "黑色，19305公里");
	}

	public HashMap<String, String> getCivic() {
		return civic;
	}

	protected void setCivic(String ID , String nature) {
		civic.put(ID, nature);
	}

}
