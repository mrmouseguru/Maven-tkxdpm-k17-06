package tinh2so.nhan2so;

import tinh2so.OutputBoundaryTinh2So;
import tinh2so.RequestData2So;
import tinh2so.Tinh2SoControl;

public class Nhan2SoControl extends Tinh2SoControl{
	
	protected Nhan2SoControl(OutputBoundaryTinh2So out) {
		super(out);
		
	}


	@Override
	protected void execute(RequestData2So req) {
		//validate input num1, num2
		//nghiệp vụ phụ thuộc phần mềm
		//sai khiến Entity
		try {
			Nhan2So.checkInput(req.num1);
			Nhan2So.checkInput(req.num2);
		}catch (IllegalArgumentException e) {
			res.message = e.getMessage();//INVALID_INPUT
		}
	}

	
	
}
