package tinh2so.nhan2so;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import tinh2so.RequestData2So;
import tinh2so.Tinh2SoControl;

public class TestNhan2SoControl {
	
	@Test
	public void testExecuteInvalidInput() {
		RequestData2So req = new RequestData2So();
		req.num1 = 1;
		req.num2 = 11;
		Tinh2SoControl nhan2so = new Nhan2SoControl(null);
		nhan2so.control(req);
		
		assertEquals("INVALID_INPUT", nhan2so.getRes().message);
		
	}

}
