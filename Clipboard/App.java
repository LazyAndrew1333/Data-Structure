import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
	
	static LinkedList lList = new LinkedList();
	JLabel clipboardItemLabel;
	JLabel outputLabel;
	
	int items = 1;
	JButton ecItem1, ecItem2, ecItem3, ecItem4, ecItem5, ecItem6, ecItem7, ecItem8, ecItem9, ecItem10, ecItem11, ecItem12, ecItem13, ecItem14, ecItem15;
	JButton ecItems[] = {ecItem1, ecItem2, ecItem3, ecItem4, ecItem5, ecItem6, ecItem7, ecItem8, ecItem9, ecItem10, ecItem11, ecItem12, ecItem13, ecItem14, ecItem15};
	
	private JFrame frame;
	private JTextField inputTextField;
	/**
	 * @wbp.nonvisual location=163,-36
	 */
	private final JLabel label = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1051, 773);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(351, 10, 331, 716);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Input:");
		lblNewLabel.setBounds(10, 10, 136, 54);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		inputTextField = new JTextField();
		inputTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = inputTextField.getText();
				if (items <= 15) {
					lList.copy(input);
					clipboardItemLabel.setText(lList.clipboardItem.Item);
					ecItems[items - 1].setText(input);
					ecItems[items - 1].setVisible(true);
					items += 1;
				} else {
					for (int i = 0; i < 15; i++) {
						if (i < 14) {
							ecItems[i].setText(ecItems[i + 1].getText());
						} else {
							ecItems[i].setText(input);
							lList.copy(input);
							clipboardItemLabel.setText(lList.clipboardItem.Item);
						}
					}
				}
				inputTextField.setText("");
			}
		});
		inputTextField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		inputTextField.setHorizontalAlignment(SwingConstants.CENTER);
		inputTextField.setBounds(10, 217, 311, 86);
		panel.add(inputTextField);
		inputTextField.setColumns(10);
		
		JButton btnCopy = new JButton("COPY");
		btnCopy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String input = inputTextField.getText();
				if (items <= 15) {
					lList.copy(input);
					clipboardItemLabel.setText(lList.clipboardItem.Item);
					ecItems[items - 1].setText(input);
					ecItems[items - 1].setVisible(true);
					items += 1;
				} else {
					for (int i = 0; i < 15; i++) {
						if (i < 14) {
							ecItems[i].setText(ecItems[i + 1].getText());
						} else {
							ecItems[i].setText(input);
							lList.copy(input);
							clipboardItemLabel.setText(lList.clipboardItem.Item);
						}
					}
				}
				inputTextField.setText("");
			}
		});
		btnCopy.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCopy.setBounds(10, 345, 311, 54);
		panel.add(btnCopy);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(692, 10, 331, 716);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblOutput = new JLabel("Output:");
		lblOutput.setBounds(185, 10, 136, 54);
		panel_1.add(lblOutput);
		lblOutput.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOutput.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		outputLabel = new JLabel(">output goes here<");
		outputLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		outputLabel.setHorizontalAlignment(SwingConstants.CENTER);
		outputLabel.setBounds(10, 218, 311, 84);
		panel_1.add(outputLabel);
		
		JButton btnPaste = new JButton("PASTE");
		btnPaste.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				outputLabel.setText(lList.paste());
			}
		});
		btnPaste.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPaste.setBounds(10, 345, 311, 54);
		panel_1.add(btnPaste);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 10, 331, 716);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblClipboardItem = new JLabel("Clipboard Item");
		lblClipboardItem.setHorizontalAlignment(SwingConstants.CENTER);
		lblClipboardItem.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblClipboardItem.setBounds(10, 38, 311, 34);
		panel_2.add(lblClipboardItem);
		
		clipboardItemLabel = new JLabel(">Clipboard Item<");
		clipboardItemLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		clipboardItemLabel.setHorizontalAlignment(SwingConstants.CENTER);
		clipboardItemLabel.setBounds(10, 72, 311, 34);
		panel_2.add(clipboardItemLabel);
		
		JLabel lblExtendedClipboard = new JLabel("Extended Clipboard");
		lblExtendedClipboard.setHorizontalAlignment(SwingConstants.CENTER);
		lblExtendedClipboard.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblExtendedClipboard.setBounds(10, 149, 311, 34);
		panel_2.add(lblExtendedClipboard);
		
		ecItems[0] = new JButton("Item 1");
		ecItems[0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lList.extendedClipboard(1);
				clipboardItemLabel.setText(lList.clipboardItem.Item);
			}
		});
		ecItems[0].setBounds(10, 191, 311, 21);
		panel_2.add(ecItems[0]);
		ecItems[0].setVisible(false);
		
		ecItems[1] = new JButton("Item 2");
		ecItems[1].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lList.extendedClipboard(2);
				clipboardItemLabel.setText(lList.clipboardItem.Item);
			}
		});
		ecItems[1].setBounds(10, 222, 311, 21);
		panel_2.add(ecItems[1]);
		ecItems[1].setVisible(false);
		
		ecItems[2] = new JButton("Item 3");
		ecItems[2].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lList.extendedClipboard(3);
				clipboardItemLabel.setText(lList.clipboardItem.Item);
			}
		});
		ecItems[2].setBounds(10, 253, 311, 21);
		panel_2.add(ecItems[2]);
		ecItems[2].setVisible(false);
		
		ecItems[3] = new JButton("Item 4");
		ecItems[3].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lList.extendedClipboard(4);
				clipboardItemLabel.setText(lList.clipboardItem.Item);
			}
		});
		ecItems[3].setBounds(10, 284, 311, 21);
		panel_2.add(ecItems[3]);
		ecItems[3].setVisible(false);
		
		ecItems[4] = new JButton("Item 5");
		ecItems[4].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lList.extendedClipboard(5);
				clipboardItemLabel.setText(lList.clipboardItem.Item);
			}
		});
		ecItems[4].setBounds(10, 315, 311, 21);
		panel_2.add(ecItems[4]);
		ecItems[4].setVisible(false);
		
		ecItems[5] = new JButton("Item 6");
		ecItems[5].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lList.extendedClipboard(6);
				clipboardItemLabel.setText(lList.clipboardItem.Item);
			}
		});
		ecItems[5].setBounds(10, 346, 311, 21);
		panel_2.add(ecItems[5]);
		ecItems[5].setVisible(false);
		
		ecItems[6] = new JButton("Item 7");
		ecItems[6].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lList.extendedClipboard(7);
				clipboardItemLabel.setText(lList.clipboardItem.Item);
			}
		});
		ecItems[6].setBounds(10, 377, 311, 21);
		panel_2.add(ecItems[6]);
		ecItems[6].setVisible(false);
		
		ecItems[7] = new JButton("Item 8");
		ecItems[7].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lList.extendedClipboard(8);
				clipboardItemLabel.setText(lList.clipboardItem.Item);
			}
		});
		ecItems[7].setBounds(10, 408, 311, 21);
		panel_2.add(ecItems[7]);
		ecItems[7].setVisible(false);
		
		ecItems[8] = new JButton("Item 9");
		ecItems[8].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lList.extendedClipboard(9);
				clipboardItemLabel.setText(lList.clipboardItem.Item);
			}
		});
		ecItems[8].setBounds(10, 439, 311, 21);
		panel_2.add(ecItems[8]);
		ecItems[8].setVisible(false);
		
		ecItems[9] = new JButton("Item 10");
		ecItems[9].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lList.extendedClipboard(10);
				clipboardItemLabel.setText(lList.clipboardItem.Item);
			}
		});
		ecItems[9].setBounds(10, 470, 311, 21);
		panel_2.add(ecItems[9]);
		ecItems[9].setVisible(false);
		
		ecItems[10] = new JButton("Item 11");
		ecItems[10].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lList.extendedClipboard(11);
				clipboardItemLabel.setText(lList.clipboardItem.Item);
			}
		});
		ecItems[10].setBounds(10, 501, 311, 21);
		panel_2.add(ecItems[10]);
		ecItems[10].setVisible(false);
		
		ecItems[11] = new JButton("Item 12");
		ecItems[11].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lList.extendedClipboard(12);
				clipboardItemLabel.setText(lList.clipboardItem.Item);
			}
		});
		ecItems[11].setBounds(10, 532, 311, 21);
		panel_2.add(ecItems[11]);
		ecItems[11].setVisible(false);
		
		ecItems[12] = new JButton("Item 13");
		ecItems[12].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lList.extendedClipboard(13);
				clipboardItemLabel.setText(lList.clipboardItem.Item);
			}
		});
		ecItems[12].setBounds(10, 563, 311, 21);
		panel_2.add(ecItems[12]);
		ecItems[12].setVisible(false);
		
		ecItems[13] = new JButton("Item 14");
		ecItems[13].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lList.extendedClipboard(14);
				clipboardItemLabel.setText(lList.clipboardItem.Item);
			}
		});
		ecItems[13].setBounds(10, 594, 311, 21);
		panel_2.add(ecItems[13]);
		ecItems[13].setVisible(false);
		
		ecItems[14] = new JButton("Item 15");
		ecItems[14].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lList.extendedClipboard(15);
				clipboardItemLabel.setText(lList.clipboardItem.Item);
			}
		});
		ecItems[14].setBounds(10, 625, 311, 21);
		panel_2.add(ecItems[14]);
		ecItems[14].setVisible(false);
	}
}
