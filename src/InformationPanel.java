import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class InformationPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public InformationPanel() {
//		setBounds(0, 0, 484, 454);
		setBounds(0, 0, 1100, 650);
		setLayout(null);
		
		JLabel InfoText13 = new JLabel("Due to these advantages, Li-ion batteries have displaced Ni-Cd batteries as the market");
		InfoText13.setForeground(Color.BLUE);
		InfoText13.setFont(new Font("Tahoma", Font.PLAIN, 21));
		InfoText13.setBounds(157, 506, 834, 25);
		add(InfoText13);
		
		JLabel InfoText14 = new JLabel("market leader in portable electronic devices (such as smartphones and laptops).");
		InfoText14.setForeground(Color.BLUE);
		InfoText14.setFont(new Font("Tahoma", Font.PLAIN, 21));
		InfoText14.setBounds(157, 542, 834, 25);
		add(InfoText14);
		
		JLabel InfoText15 = new JLabel("Currently, the best selling electric cars, the Nissan Leaf and the Tesla Models, both use");
		InfoText15.setForeground(Color.BLUE);
		InfoText15.setFont(new Font("Tahoma", Font.PLAIN, 21));
		InfoText15.setBounds(157, 578, 834, 25);
		add(InfoText15);
		
		JLabel InfoText12 = new JLabel("Li-ion batteries are also comparatively low maintenance.");
		InfoText12.setForeground(Color.BLUE);
		InfoText12.setFont(new Font("Tahoma", Font.PLAIN, 21));
		InfoText12.setBounds(157, 470, 834, 25);
		add(InfoText12);
		
		JLabel InfoText9 = new JLabel("(100-265 Wh/kg or 250-670 Wh/L). In addition, Li-ion battery cells can deliver ");
		InfoText9.setForeground(Color.BLUE);
		InfoText9.setFont(new Font("Tahoma", Font.PLAIN, 21));
		InfoText9.setBounds(157, 362, 834, 25);
		add(InfoText9);
		
		JLabel InfoText6 = new JLabel("Compared to the other high-quality rechargeable battery technologies (nickel ");
		InfoText6.setForeground(Color.BLUE);
		InfoText6.setFont(new Font("Tahoma", Font.PLAIN, 21));
		InfoText6.setBounds(157, 254, 834, 25);
		add(InfoText6);
		
		JLabel InfoText7 = new JLabel("-cadmium or nickel-metal-hydride), Li-ion batteries have a number of advantages. ");
		InfoText7.setForeground(Color.BLUE);
		InfoText7.setFont(new Font("Tahoma", Font.PLAIN, 21));
		InfoText7.setBounds(157, 290, 834, 25);
		add(InfoText7);
		
		JLabel InfoText8 = new JLabel("They have one of the highest energy densities of any battery technology today");
		InfoText8.setForeground(Color.BLUE);
		InfoText8.setFont(new Font("Tahoma", Font.PLAIN, 21));
		InfoText8.setBounds(157, 326, 834, 25);
		add(InfoText8);
		
		JLabel InfoText3 = new JLabel("materials as electrodes. The most common combination is that of lithium cobalt oxide");
		InfoText3.setForeground(Color.BLUE);
		InfoText3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		InfoText3.setBounds(157, 146, 834, 25);
		add(InfoText3);
		
		JLabel InfoText5 = new JLabel("devices such as cellphones and laptops.");
		InfoText5.setForeground(Color.BLUE);
		InfoText5.setFont(new Font("Tahoma", Font.PLAIN, 21));
		InfoText5.setBounds(157, 218, 834, 25);
		add(InfoText5);
		
		JLabel InfoText11 = new JLabel("that they can deliver large amounts of current for high-power applications, while ");
		InfoText11.setForeground(Color.BLUE);
		InfoText11.setFont(new Font("Tahoma", Font.PLAIN, 21));
		InfoText11.setBounds(157, 434, 834, 25);
		add(InfoText11);
		
		JLabel InfoText10 = new JLabel("up to 3.6 Volts, 3 times higher than technologies such as Ni-Cd or Ni-MH. This means");
		InfoText10.setForeground(Color.BLUE);
		InfoText10.setFont(new Font("Tahoma", Font.PLAIN, 21));
		InfoText10.setBounds(157, 398, 834, 25);
		add(InfoText10);
		
		JLabel InfoText4 = new JLabel("(cathode) and graphite (anode), which is most commonly found in portable electronic");
		InfoText4.setForeground(Color.BLUE);
		InfoText4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		InfoText4.setBounds(157, 182, 834, 25);
		add(InfoText4);
		
		JLabel InfoText2 = new JLabel("uses lithium ions as a key component. Li-ion batteries can use a number of different");
		InfoText2.setForeground(Color.BLUE);
		InfoText2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		InfoText2.setBounds(157, 110, 834, 25);
		add(InfoText2);
		
		
		JLabel InfoText1 = new JLabel("A lithium-ion (Li-ion) battery is an advanced and rechargeable battery technology that");
		InfoText1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		InfoText1.setForeground(new Color(0, 0, 255));
		InfoText1.setBounds(157, 74, 834, 25);
		add(InfoText1);
		
		JLabel lblNewLabel_1 = new JLabel("Information");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(398, 25, 183, 35);
		add(lblNewLabel_1);
		
//		Background Image
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 5, 941, 650);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/BatteryImg.jpg"));
		lblNewLabel.setIcon(img);
		add(lblNewLabel);
		
		JLabel InfoText16 = new JLabel("Li-ion batteries as their primary fuel source.");
		InfoText16.setForeground(Color.BLUE);
		InfoText16.setFont(new Font("Tahoma", Font.PLAIN, 21));
		InfoText16.setBounds(157, 614, 834, 25);
		add(InfoText16);
		
		
//
//		JTextArea textArea = new JTextArea();
//		textArea.setText("Info aera");
//		textArea.setToolTipText("");
//		textArea.setRows(30);
//		textArea.setBounds(0, 0, 484, 454);
//		add(textArea);
		
//		JScrollBar scrollBar = new JScrollBar();
//		scrollBar.setBounds(467, 0, 17, 454);
//		add(scrollBar);
		
////		Background Image
//		JLabel imageLabel = new JLabel("New label");
//		imageLabel.setForeground(new Color(0, 0, 0));
//		imageLabel.setBounds(0, 0, 484, 454);
//		add(imageLabel);
//		ImageIcon img = new ImageIcon(this.getClass().getResource("/BatteryImg.jpg"));
//		imageLabel.setIcon(img);
//		add(imageLabel);
//		

	}
}
