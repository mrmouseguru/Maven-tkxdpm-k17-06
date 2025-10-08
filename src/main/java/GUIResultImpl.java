import javax.swing.JOptionPane;

public class GUIResultImpl implements OutputInterface {

	@Override
	public void show(OutputData outData) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, 
				outData.result);
	}

}
