import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Receipt extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	int startPos = 36;
	int startX = 40;

	public Receipt(boolean state, LinkedList list) {
		int num = 0;
		if (state) {
			num = list.size() - list.resSize();
		}
		else {
			num = list.resSize();
		}
		
		String[] temp = new String[num];
		
		if (state) {
			temp = list.availableSeats();
		}
		else {
			temp = list.reservedSeats();
		}
		
		JLabel[] jb = new JLabel[num];
		

		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(30, 11, 124, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblNewLabel);
		
		if (state) lblNewLabel.setText("Available Seats");
		else lblNewLabel.setText("Reserved Seats");
			
		for (int i = 0; i < num; i++) {
			jb[i] = new JLabel(temp[i]);
			if (startPos == 256) {
				startX += 100;
				startPos = 36;
				jb[i].setBounds(startX, startPos, 134, 14);		
			}
			else {
				jb[i].setBounds(startX, startPos, 134, 14);
			}
			jb[i].setFont(new Font("Tahoma", Font.PLAIN, 9));
			contentPane.add(jb[i]);
			

			
			startPos += 20;
		}
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.setBounds(166, 286, 89, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton.setBackground(Color.RED);
		contentPane.add(btnNewButton);
	}
}
