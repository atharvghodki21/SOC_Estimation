import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class AboutUsPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public AboutUsPanel() {
		setBounds(0, 0, 400, 392);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ABOUT US");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(79, 144, 144, 124);
		add(lblNewLabel);
	}

}
