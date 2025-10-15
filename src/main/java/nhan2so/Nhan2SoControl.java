package nhan2so;


public class Nhan2SoControl implements InputBoundary{
	private OutputBoundary out;
	private Nhan2So n2so;
	
	
	public Nhan2SoControl(OutputBoundary out, Nhan2So n2so) {
		this.out = out;
		this.n2so = n2so;
	}

	@Override
	public OutputData execute(InputData inData) {
		int result = n2so.nhan2So(inData.num1, inData.num2);
		OutputData outData = new OutputData();
		outData.result = result;
		out.present(outData);
		return outData;//testing
		//out.show(outData);
	}
	
	
}
