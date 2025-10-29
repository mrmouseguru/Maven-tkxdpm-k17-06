package presenters;

import nhan2so.OutputBoundary;
import nhan2so.OutputData;

public class Nhan2SoPresenterAPI implements OutputBoundary{

	private final Nhan2SoViewModelAPI responseModel;

    public Nhan2SoPresenterAPI(Nhan2SoViewModelAPI responseModel) {
        this.responseModel = responseModel;
    }

    @Override
    public void present(OutputData output) {
        responseModel.setResult(output.result);
        responseModel.setMessage("OK");
        responseModel.setSuccess(true);
    }
}
