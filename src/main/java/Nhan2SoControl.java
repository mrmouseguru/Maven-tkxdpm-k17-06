

public class Nhan2SoControl {
	private InputInterface in;
	private OutputInterface out;
	private Nhan2So n2so;
	
	
	public Nhan2SoControl(InputInterface in,
			OutputInterface out, Nhan2So n2so) {
		this.in = in;
		this.out = out;
		this.n2so = n2so;
	}


	public void execute() {
		InputData inData = in.getNumber();
		int result = n2so.nhan2So(inData.num1, inData.num2);
		OutputData outData = new OutputData();
		outData.result = result;
		
		out.show(outData);
	}
	
	
}
