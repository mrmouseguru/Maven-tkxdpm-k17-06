
import java.io.PrintWriter;

public class UIConsoleResultImpl implements OutputBoundary{
	private PrintWriter pwt;
	
	
	
	public UIConsoleResultImpl(PrintWriter pwt) {
		this.pwt = pwt;
	}



	@Override
	public void present(OutputData outData) {
		// TODO Auto-generated method stub
		pwt.println("Result: " + outData.result);
		pwt.flush();
		
	}

}
