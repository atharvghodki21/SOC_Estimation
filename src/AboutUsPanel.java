import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class AboutUsPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public AboutUsPanel() {
		setBounds(0, 0, 1100, 650);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 1100, 650);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/7.png"));
		lblNewLabel.setIcon(img);
		add(lblNewLabel);
		
//		JLabel lblNewLabel = new JLabel("Shri Ramdeobaba College of Engineering and Management, Nagpur");
//		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
//		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel.setBounds(10, 23, 1080, 74);
//		add(lblNewLabel);
	}

}
