package tinh2so.nhan2so;

import tinh2so.OutputBoundaryTinh2So;
import tinh2so.RequestData2So;
import tinh2so.Tinh2SoControl;

public class Nhan2SoControl extends Tinh2SoControl{
	
	protected Nhan2SoControl(OutputBoundaryTinh2So out) {
		super(out);
		res = new ResponseDataNhan2So();
	}


	@Override
	protected void execute(RequestData2So req) {
		ResponseDataNhan2So resNhan = (ResponseDataNhan2So) res;
		//validate input num1, num2
		//nghiệp vụ phụ thuộc phần mềm
		//sai khiến Entity
		try {
			Nhan2So.checkInput(req.num1);
			Nhan2So.checkInput(req.num2);
		}catch (IllegalArgumentException e) {
			res.message = e.getMessage();//INVALID_INPUT
		}
		
		//sai khiến Entites
		Nhan2So n2so = new Nhan2So(req.num1, req.num2);
		int result = n2so.tinh2so();
		res.result = result;
		//kết quả chẵn: XANH / lẻ: ĐỎ
		resNhan.isEven = n2so.checkEven(result);
		
		//gán trở lại res
		res = resNhan;
	}

	
	
}
