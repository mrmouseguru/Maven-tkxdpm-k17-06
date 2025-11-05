package tinh2so.nhan2so;

import tinh2so.Tinh2So;

public class Nhan2So extends Tinh2So {

	public Nhan2So(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public int tinh2so() {
		// TODO Auto-generated method stub
		return num1 * num2;
	}
	
	public static void checkInput(int num) {
		if(num < 0 || num >9) {
			throw new IllegalArgumentException("INVALID_INPUT");
		}
	}
	
	
	


	
}
