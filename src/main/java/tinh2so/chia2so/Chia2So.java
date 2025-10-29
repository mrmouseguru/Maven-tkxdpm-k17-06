package tinh2so.chia2so;

import tinh2so.Tinh2So;

public class Chia2So extends Tinh2So{

	public Chia2So(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public int tinh2so() {
		// TODO Auto-generated method stub
		return num1/num2;
	}
	
	public static boolean checkNum2(int n2) {
		if(n2 != 0 ) {
			return true;
		}
		
		return false;
	}

}
