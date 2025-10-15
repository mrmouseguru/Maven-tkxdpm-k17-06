package desktop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import nhan2so.InputData;

public class TestNhan2SoController {
	
	@Test
	public void testExecute() {
		InputDTO inDTO = new InputDTO();
		inDTO.num1 = "2";
		inDTO.num2 = "2";
		Nhan2SoController controller = new Nhan2SoController(null);
		controller.execute(inDTO);
		
		InputData inputData =  controller.getInData();
		
		assertEquals(2, inputData.num1);
		assertEquals(2, inputData.num2);
		
	}
}
