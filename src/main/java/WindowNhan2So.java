
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class WindowNhan2So extends JFrame {

	public WindowNhan2So() {
		khoiTao();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// setSize(400, 400);
		pack();
		setVisible(true);
	}

	private void khoiTao() {
		JLabel lbl1 = new JLabel("Number 1:");
		JTextField tf1 = new JTextField(20);
		JLabel lbl2 = new JLabel("Number 2:");
		JTextField tf2 = new JTextField(20);
		GridLayout grid = new GridLayout(3, 2);

		setLayout(grid);
		// đưa label vào dòng 1 cột 1
		add(lbl1);
		// dòng 1 cột 2
		add(tf1);

		// dòng 2 cột 1
		add(lbl2);
		// dòng 2 cột 2
		add(tf2);
		//dòng 3 
		//cột 1
		JLabel lbl3 = new JLabel("");
		add(lbl3);
		//cột 2
		//nút
		JButton btX = new JButton("X");
		btX.addActionListener(
				
				
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						//click vào nút thì làm//
						//sinh viên code vào đây
						JOptionPane.
						showMessageDialog(null, "Hello ...");
						
					}
				}
				
				);
		add(btX);
	}

	public static void main(String[] args) {
		WindowNhan2So wn2so = new WindowNhan2So();
	}

}
