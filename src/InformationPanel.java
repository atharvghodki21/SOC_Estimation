import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class InformationPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public InformationPanel() {
		setBounds(0, 0, 400, 392);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("This is info panel");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(35, 68, 342, 167);
		add(lblNewLabel);
	}
}
