import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class AboutProjectPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public AboutProjectPanel() {
//		setBounds(0, 0, 400, 392);
		setBounds(0, 0, 1100, 650);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel.setBounds(0, 0, 400, 392);
		lblNewLabel.setBounds(0, 0, 941, 650);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		ImageIcon img = new ImageIcon(this.getClass().getResource("/BatteryImg.jpg"));
		
		JLabel AboutProjectText_9 = new JLabel(".");
		AboutProjectText_9.setForeground(Color.BLUE);
		AboutProjectText_9.setFont(new Font("Tahoma", Font.PLAIN, 21));
		AboutProjectText_9.setBounds(37, 503, 904, 53);
		add(AboutProjectText_9);
		
		JLabel AboutProjectText_1 = new JLabel("We have been working on a project that can be more efficient for batteries which can have a");
		AboutProjectText_1.setForeground(Color.BLUE);
		AboutProjectText_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		AboutProjectText_1.setBounds(37, 100, 904, 65);
		add(AboutProjectText_1);
		
		JLabel lblNewLabel_1 = new JLabel("ABOUT PROJECT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
//		lblNewLabel_1.setBounds(92, 11, 202, 65);
		lblNewLabel_1.setBounds(400, 11, 277, 80);
		add(lblNewLabel_1);
		
		JLabel AboutProjectText_7 = new JLabel("battery charging and discharging modes. By entering the values of current and voltage");
		AboutProjectText_7.setForeground(Color.BLUE);
		AboutProjectText_7.setFont(new Font("Tahoma", Font.PLAIN, 21));
		AboutProjectText_7.setBounds(37, 411, 904, 53);
		add(AboutProjectText_7);
		
//		JLabel AboutProjectText_5 = new JLabel("\r\n"
//				+ "");
//		AboutProjectText_5.setForeground(Color.BLUE);
//		AboutProjectText_5.setFont(new Font("Tahoma", Font.PLAIN, 21));
//		AboutProjectText_5.setBounds(37, 304, 904, 53);
//		add(AboutProjectText_5);
		
		JLabel AboutProjectText_6 = new JLabel("We have estimated that using the Coulomb Counting method we can make a track record about");
		AboutProjectText_6.setForeground(Color.BLUE);
		AboutProjectText_6.setFont(new Font("Tahoma", Font.PLAIN, 21));
		AboutProjectText_6.setBounds(37, 365, 904, 53);
		add(AboutProjectText_6);
		
		JLabel AboutProjectText_4 = new JLabel("commonly used.");
		AboutProjectText_4.setForeground(new Color(0, 0, 255));
		AboutProjectText_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		AboutProjectText_4.setBounds(30, 249, 911, 53);
		add(AboutProjectText_4);
		
		JLabel AboutProjectText_8 = new JLabel("you can get the status of your battery");
		AboutProjectText_8.setForeground(Color.BLUE);
		AboutProjectText_8.setFont(new Font("Tahoma", Font.PLAIN, 21));
		AboutProjectText_8.setBounds(37, 460, 904, 53);
		add(AboutProjectText_8);
		
		JLabel AboutProjectText_2 = new JLabel("control on battery usage, its performance and its health capacity. So, we came across ");
		AboutProjectText_2.setForeground(Color.BLUE);
		AboutProjectText_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		AboutProjectText_2.setBounds(34, 149, 907, 53);
		add(AboutProjectText_2);
		
		JLabel AboutProjectText_3 = new JLabel("Lithium-ion batteries which are more advanced and efficient than the batteries which are");
		AboutProjectText_3.setForeground(Color.BLUE);
		AboutProjectText_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		AboutProjectText_3.setBounds(34, 200, 907, 53);
		add(AboutProjectText_3);
		lblNewLabel.setIcon(img);
		add(lblNewLabel);
		
		
		
//		JLabel lblNewLabel = new JLabel("ABOUT PROJECT");
//		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
//		lblNewLabel.setBounds(104, 22, 210, 24);
//		add(lblNewLabel);
		
	}

}
