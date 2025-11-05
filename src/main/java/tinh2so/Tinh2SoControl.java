package tinh2so;

import tinh2so.nhan2so.OutputBoundary;

public abstract class Tinh2SoControl {
	protected OutputBoundaryTinh2So out;
	protected ResponseData2So res;
	
	public ResponseData2So getRes() {
		return res;
	}
	//protected ....DAO;
	
	
	protected Tinh2SoControl(OutputBoundaryTinh2So out) {
		this.out = out;
		this.res = new ResponseData2So();
	}
	
	protected abstract void execute(RequestData2So req);
	
	

	public void control(RequestData2So req) {
		res.currentDay =  Tinh2So.getCurrentDay();
		execute(req);
	}


}
