import javax.swing.JOptionPane;

public class GUIResultImpl implements OutputBoundary {

	@Override
	public void present(OutputData outData) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, 
				outData.result);
	}

}
