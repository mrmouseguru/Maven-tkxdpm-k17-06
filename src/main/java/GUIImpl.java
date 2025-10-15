import javax.swing.JOptionPane;

public class GUIImpl implements InputBoundary {

	@Override
	public InputData getNumber() {
		String strNum1 = 
				JOptionPane.showInputDialog("[SỐ THỨ NHẤT]");
		String strNum2 = 
				JOptionPane.showInputDialog("[SỐ THỨ HAI]");
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		InputData inData = new InputData();
		inData.num1 = num1;
		inData.num2 = num2;
		return inData;
	}

}
