import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestNhan2SoControl {
	
	@Test
	public void testExecute() {
		//Input
		InputData inData = new InputData();
		inData.num1 = 2;
		inData.num2 = 2;
		Nhan2So n2so = new Nhan2So();
		InputBoundary in = null;
		OutputBoundary out = null;
		Nhan2SoViewModel model = new Nhan2SoViewModel();
		out = new Nhan2SoPresenter(model);
		//xử lý
		in = new Nhan2SoControl(out, n2so);
		
		//ouput
		OutputData outData =  in.execute(inData);
		
		assertEquals("4",model.result); //"4"
		
		assertEquals(4, outData.result);
		
		
	}
}
