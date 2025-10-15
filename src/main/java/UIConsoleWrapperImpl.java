
import java.io.PrintWriter;
import java.util.Scanner;

public class UIConsoleWrapperImpl implements InputBoundary {
	private Scanner in;
	private PrintWriter out;
	
	public UIConsoleWrapperImpl(Scanner sc, PrintWriter out) {
		this.in = sc;
		this.out = out;
	}

	@Override
	public InputData getNumber() {
		// TODO Auto-generated method stub
		out.print("[CHO EM XIN SỐ]:");///?????Label
		out.flush();
		int number1 = in.nextInt();
		out.print("[CHO EM XIN SỐ]:");out.flush();
		int number2 = in.nextInt();
		InputData inData = new InputData();
		inData.num1 = number1;
		inData.num2 = number2;
		return inData;
	}
	
}
