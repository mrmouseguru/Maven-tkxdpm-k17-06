package desktop;

import nhan2so.InputBoundary;
import nhan2so.InputData;

public class Nhan2SoController {
	private InputBoundary in;
	private InputData inData;//testing
	public Nhan2SoController(InputBoundary in) {
		this.in = in;
	}
	
	public InputData getInData() {
		return inData;
	}

	public void execute(InputDTO inDTO) {
		inData = new InputData();
		inData.num1 = Integer.parseInt(inDTO.num1);
		inData.num2 = Integer.parseInt(inDTO.num2);
		
		in.execute(inData);//tested
		
	}

}
