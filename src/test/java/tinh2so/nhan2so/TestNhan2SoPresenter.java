package tinh2so.nhan2so;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

import tinh2so.OutputBoundaryTinh2So;
import tinh2so.ResponseData2So;

public class TestNhan2SoPresenter {
	
	@Test
	public void testPresentInvalid() {
		ResponseData2So res = new ResponseData2So();
		res.message = "INVALID_INPUT";
		res.currentDay = new Date();
		Nhan2SoViewModel model = new Nhan2SoViewModel();
		OutputBoundaryTinh2So n2so = new Nhan2soPresenter(model);
		n2so.present(res);
		
		assertEquals("INVALID_INPUT", model.message); 
		assertEquals("05/11/2025", model.currentDay);
		;
		
	}
	
	@Test
	public void testPresentValid() {
		ResponseData2So res = new ResponseDataNhan2So();
		res.currentDay = new Date();
		res.result = 9;
		Nhan2SoViewModel model = new Nhan2SoViewModel();
		OutputBoundaryTinh2So n2so = new Nhan2soPresenter(model);
		n2so.present(res);
		
		assertEquals("9", model.result); 
		assertEquals("RED", model.color);
		;
		
	}

}
