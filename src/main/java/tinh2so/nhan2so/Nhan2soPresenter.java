package tinh2so.nhan2so;

import java.text.SimpleDateFormat;
import java.util.Date;

import tinh2so.OutputBoundaryTinh2So;
import tinh2so.ResponseData2So;

public class Nhan2soPresenter implements OutputBoundaryTinh2So{
	private Nhan2SoViewModel model;
	
	public Nhan2soPresenter(Nhan2SoViewModel model) {
		this.model = model;
	}



	@Override
	public void present(ResponseData2So res) {
		if(res.message != null) {
			model.message = res.message;
		}
		
		model.currentDay = converter(res.currentDay);
	}



	private String converter(Date currentDay) {
		SimpleDateFormat converter = new SimpleDateFormat("dd/MM/yyyy");
		return converter.format(currentDay);
	}

}
