package presenters;

import nhan2so.OutputBoundary;
import nhan2so.OutputData;

public class Nhan2SoPresenter implements OutputBoundary{
	private Nhan2SoViewModel model;
	
	
	public Nhan2SoPresenter(Nhan2SoViewModel model) {
		this.model = model;
	}


	@Override
	public void present(OutputData outData) {
		model.result = String.valueOf(outData.result);
	}

}
