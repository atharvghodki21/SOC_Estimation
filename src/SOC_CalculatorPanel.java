import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SOC_CalculatorPanel extends JPanel {
	private JTextField jTextFieldInitial_SOC;
	private JTextField jTextField_SOH;
	private JTextField jTextFieldInitial_DOD;
	private JTextField jTextField_Ib;
	private JTextField jTextField_Vb;

	/**
	 * Create the panel.
	 */
	public SOC_CalculatorPanel() {
		setBounds(0, 0, 592, 493);
		setLayout(null);
		
		JLabel MainHeading = new JLabel("SOC Calculator Using Coulomb Counting Method");
		MainHeading.setFont(new Font("Tahoma", Font.PLAIN, 18));
		MainHeading.setBounds(10, 27, 390, 29);
		add(MainHeading);
		
		JLabel lblNewLabel = new JLabel("Enter initial SOC :");
		lblNewLabel.setBounds(10, 117, 163, 14);
		add(lblNewLabel);
		
		JLabel lblSoh = new JLabel("SOH :");
		lblSoh.setBounds(10, 155, 89, 14);
		add(lblSoh);
		
		JLabel lblDod = new JLabel("DOD : ");
		lblDod.setBounds(10, 192, 89, 14);
		add(lblDod);
		
		JLabel lblEnterBatteryCurrent = new JLabel("Enter battery current Ib (mA) : ");
		lblEnterBatteryCurrent.setBounds(10, 231, 179, 14);
		add(lblEnterBatteryCurrent);
		
		JLabel lblEnterBatteryVoltage = new JLabel("Enter battery voltage Vb (Volts) : ");
		lblEnterBatteryVoltage.setBounds(10, 274, 203, 14);
		add(lblEnterBatteryVoltage);
		
//		-------------------------------------------------------------------------------------------------------------------
		
		JButton jButtonSubmit = new JButton("Submit Parameters");
		jButtonSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					String Initial_SOC =jTextFieldInitial_SOC.getText();
	                String Ib = jTextField_Ib.getText();
	                String Vb = jTextField_Vb.getText();
	                String SOH = jTextField_SOH.getText();
	                
	                float Ib_in_float = Float.parseFloat(Ib);
	                float Vb_in_float = Float.parseFloat(Vb);
	                float SOH_in_float =Float.parseFloat(SOH);
	                float Initial_SOC_in_Float =Float.parseFloat(Initial_SOC);

	                float DOD = 100 - Initial_SOC_in_Float;

	                String DOD_in_String =Float.toString(DOD);

	                jTextFieldInitial_DOD.setText(DOD_in_String);


	                // Estimated SOC (Final)

	                float SOC = SOH_in_float-DOD;
	                String SOC_in_String = Float.toString(SOC);

	                float NewDOD = DOD - SOH_in_float;
	                String NewDOD_in_String = Float.toString(NewDOD);
	                
	              //----------------------------------------------------------------------

	                if(Ib_in_float> 0) {  //MAIN WALA IF CINDITION
	                    if(Vb_in_float == 4.2 && Ib_in_float == 55)
	                    {  // YE WALI CONDITION NAHI CHAL RAHI. PATA NAHI Q


//	                    int input = JOptionPane.showMessageDialog(jFrame,"Battery Full", JOptionPane.INFORMATION_MESSAGE);
	                        int input = JOptionPane.showConfirmDialog(null, "Battery is Fully Charged !!");

	                    if (input == 0)
	                    {
//	                        System.exit(0);
//	                        int input3 = JOptionPane.showConfirmDialog((jFrame, "SOC is equal to SOH");
	                        int input3 = JOptionPane.showConfirmDialog(null, "SOC is equal to SOH.");

	                        if (input3 == 0) {

	                        }
	                    }
	                    }


	                    if(Vb_in_float < 4.2 && Ib_in_float < 55)
	                    {
	                        int input = JOptionPane.showConfirmDialog(null, "Charging Mode !!");
	                        if (input == 0) {

	                        }
	                    }


	                    if(Vb_in_float > 4.2 || Ib_in_float > 55)
	                    {
	                        if (Ib_in_float> 55 && Vb_in_float>4.2) {
	                            int input = JOptionPane.showConfirmDialog(null, "Maximum limit Reached due to both parameters.");
	                            if (input == 0) {

	                            }
	                        }

	                        else if (Vb_in_float > 4.2)
	                        {
	                            int input1 = JOptionPane.showConfirmDialog(null, "Maximum limit Reached due to overvoltage.");
	                            if (input1 == 0) {

	                            }
	                        }

	                        else if (Ib_in_float > 55)
	                        {
	                            int input2 = JOptionPane.showConfirmDialog(null, "Maximum limit Reached due to overcurrent.");
	                            if (input2 == 0) {

	                            }
	                        }

	                    }

	                }
	                
	                else {  // MAIN WALE IF KA ELSE CONDITION
	                    int input = JOptionPane.showConfirmDialog(null, "Disharging Mode !!");

	                    if (Vb_in_float > 2.4)
	                    {
	                        int input2 = JOptionPane.showConfirmDialog(null, "SOC is " + SOC_in_String );
	                    }
	                    else { // Ye wali condition nahi samjhi. Jo nhi hai jaisa ka waisa likh diya.
	                        int input2 = JOptionPane.showConfirmDialog(null, "SOC is " + NewDOD_in_String );
	                    }
	                }
	                
				} // Try Block Ends
				
				finally {
//					int input = JOptionPane.showConfirmDialog(null, "Please enter all the required parameters.");
					JOptionPane.showMessageDialog(null, "Please enter all the required parameters.");
				} // Finally Block Ends
                
			}  // MouseClicked Function Ends
		}); // Add mouseListener ends
		
		jButtonSubmit.setBounds(0, 312, 173, 23);
		add(jButtonSubmit);
		
		
//		--------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		JButton jButtonReset = new JButton("Reset Parameters");
		jButtonReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int input =  JOptionPane.showConfirmDialog(null, "Do you want to RESET?");
                if (input == 0)
                {
                    jTextFieldInitial_SOC.setText("");
                    jTextFieldInitial_DOD.setText("");
                    jTextField_Ib.setText("");
                    jTextField_Vb.setText("");
                }
			} // MouseClicked Function Ends
		});  // Add mouseListener ends
		jButtonReset.setBounds(0, 344, 173, 23);
		add(jButtonReset);
		
		
//		------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		jTextFieldInitial_SOC = new JTextField();
		jTextFieldInitial_SOC.setBounds(253, 114, 86, 20);
		add(jTextFieldInitial_SOC);
		jTextFieldInitial_SOC.setColumns(10);
		
		jTextField_SOH = new JTextField();
		jTextField_SOH.setText("100");
		jTextField_SOH.setColumns(10);
		jTextField_SOH.setBounds(253, 152, 86, 20);
		jTextField_SOH.setEditable(false);
		add(jTextField_SOH);
		
		jTextFieldInitial_DOD = new JTextField();
		jTextFieldInitial_DOD.setColumns(10);
		jTextFieldInitial_DOD.setBounds(253, 189, 86, 20);
		add(jTextFieldInitial_DOD);
		
		jTextField_Ib = new JTextField();
		jTextField_Ib.setColumns(10);
		jTextField_Ib.setBounds(253, 228, 86, 20);
		add(jTextField_Ib);
		
		jTextField_Vb = new JTextField();
		jTextField_Vb.setColumns(10);
		jTextField_Vb.setBounds(253, 271, 86, 20);
		add(jTextField_Vb);
	}
}
