package tinh2so.nhan2so;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

import tinh2so.OutputBoundaryTinh2So;
import tinh2so.RequestData2So;
import tinh2so.Tinh2SoControl;

public class TestNhan2SoControl {
	
	@Test
	public void testExecuteInvalidInput() {
		Nhan2SoViewModel model = new Nhan2SoViewModel();
		OutputBoundaryTinh2So out = new Nhan2soPresenter(model);
		RequestData2So req = new RequestData2So();
		req.num1 = 1;
		req.num2 = 11;
		Tinh2SoControl nhan2so = new Nhan2SoControl(out);
		nhan2so.control(req);
		
		assertEquals("INVALID_INPUT", nhan2so.getRes().message);
		assertEquals(new Date().getDay(), 
				nhan2so.getRes().currentDay.getDay());
		
		assertEquals("INVALID_INPUT", model.message);
		
		
	}
	

	@Test
	public void testExecuteValidInput() {
		RequestData2So req = new RequestData2So();
		req.num1 = 1;
		req.num2 = 9;
		Tinh2SoControl nhan2so = new Nhan2SoControl(null);
		nhan2so.control(req);
		
		assertEquals(null, nhan2so.getRes().message);
		assertEquals(9, nhan2so.getRes().result);
		assertEquals(false, ((ResponseDataNhan2So)nhan2so.getRes()).isEven);
		
		
	}

}
