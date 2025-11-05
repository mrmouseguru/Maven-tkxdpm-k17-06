package tinh2so;

import java.util.Date;

public abstract class Tinh2So {
	protected int num1;
	protected int num2;
	
	public Tinh2So(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	public abstract int tinh2so();
	
	public static Date getCurrentDay() {
		return new Date();
	}
}
