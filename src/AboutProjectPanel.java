import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

public class AboutProjectPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public AboutProjectPanel() {
		setSize(400, 392);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 400, 392);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		ImageIcon img = new ImageIcon(this.getClass().getResource("/BatteryImg.jpg"));
		
		JLabel AboutProjectText_9 = new JLabel("of your battery.");
		AboutProjectText_9.setForeground(Color.BLUE);
		AboutProjectText_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		AboutProjectText_9.setBounds(0, 311, 400, 53);
		add(AboutProjectText_9);
		
		JLabel AboutProjectText_8 = new JLabel("By entering the values of current and voltage you can get the status ");
		AboutProjectText_8.setForeground(Color.BLUE);
		AboutProjectText_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		AboutProjectText_8.setBounds(0, 279, 400, 53);
		add(AboutProjectText_8);
		
		JLabel AboutProjectText_7 = new JLabel("make a track record about battery charging and discharging modes.");
		AboutProjectText_7.setForeground(Color.BLUE);
		AboutProjectText_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		AboutProjectText_7.setBounds(0, 247, 400, 53);
		add(AboutProjectText_7);
		
		JLabel AboutProjectText_6 = new JLabel("We have estimated that using the Coulomb Counting method we can");
		AboutProjectText_6.setForeground(Color.BLUE);
		AboutProjectText_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		AboutProjectText_6.setBounds(0, 215, 400, 53);
		add(AboutProjectText_6);
		
		JLabel AboutProjectText_5 = new JLabel("than the batteries which are commonly used.\r\n"
				+ "");
		AboutProjectText_5.setForeground(Color.BLUE);
		AboutProjectText_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		AboutProjectText_5.setBounds(0, 183, 380, 53);
		add(AboutProjectText_5);
		
		JLabel AboutProjectText_1 = new JLabel("We have been working on a project that can be more efficient");
		AboutProjectText_1.setForeground(Color.BLUE);
		AboutProjectText_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		AboutProjectText_1.setBounds(0, 55, 380, 53);
		add(AboutProjectText_1);
		
		JLabel AboutProjectText_2 = new JLabel("for batteries which can have a control on battery usage, its");
		AboutProjectText_2.setForeground(Color.BLUE);
		AboutProjectText_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		AboutProjectText_2.setBounds(0, 87, 380, 53);
		add(AboutProjectText_2);
		
		JLabel AboutProjectText_3 = new JLabel("performance and its health capacity. So, we came across");
		AboutProjectText_3.setForeground(Color.BLUE);
		AboutProjectText_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		AboutProjectText_3.setBounds(0, 119, 380, 53);
		add(AboutProjectText_3);
		
		JLabel AboutProjectText_4 = new JLabel(" Lithium-ion batteries which are more advanced and efficient");
		AboutProjectText_4.setForeground(new Color(0, 0, 255));
		AboutProjectText_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		AboutProjectText_4.setBounds(0, 151, 380, 53);
		add(AboutProjectText_4);
		
		JLabel lblNewLabel_1 = new JLabel("ABOUT PROJECT");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(92, 11, 202, 65);
		add(lblNewLabel_1);
		lblNewLabel.setIcon(img);
		add(lblNewLabel);
		
//		JLabel lblNewLabel = new JLabel("ABOUT PROJECT");
//		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
//		lblNewLabel.setBounds(104, 22, 210, 24);
//		add(lblNewLabel);
		
	}

}
