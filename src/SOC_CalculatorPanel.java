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
//		setBounds(0, 0, 592, 493);
		setBounds(0, 0, 1100, 650);
		setLayout(null);
		
		JLabel MainHeading = new JLabel("SOC Calculator Using Coulomb Counting Method");
		MainHeading.setFont(new Font("Tahoma", Font.BOLD, 30));
		MainHeading.setBounds(194, 32, 765, 35);
		add(MainHeading);
		
		JLabel lblNewLabel = new JLabel("Enter initial SOC :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setBounds(268, 117, 361, 27);
		add(lblNewLabel);
		
		JLabel lblSoh = new JLabel("SOH :");
		lblSoh.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblSoh.setBounds(268, 155, 361, 27);
		add(lblSoh);
		
		JLabel lblDod = new JLabel("DOD : ");
		lblDod.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblDod.setBounds(268, 192, 361, 27);
		add(lblDod);
		
		JLabel lblEnterBatteryCurrent = new JLabel("Enter battery current Ib (mA) : ");
		lblEnterBatteryCurrent.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblEnterBatteryCurrent.setBounds(268, 231, 361, 27);
		add(lblEnterBatteryCurrent);
		
		JLabel lblEnterBatteryVoltage = new JLabel("Enter battery voltage Vb (Volts) : ");
		lblEnterBatteryVoltage.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblEnterBatteryVoltage.setBounds(268, 274, 361, 27);
		add(lblEnterBatteryVoltage);
		
//		-------------------------------------------------------------------------------------------------------------------
		
		JButton jButtonSubmit = new JButton("Submit Parameters");
		jButtonSubmit.setFont(new Font("Tahoma", Font.PLAIN, 21));
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

	                if(Ib_in_float> 0) {  //MAIN WALA IF CONDITION
	                    if(Vb_in_float == 4.2 && Ib_in_float == 55)
	                    {  // YE WALI CONDITION NAHI CHAL RAHI. PATA NAHI Q


//	                    int input = JOptionPane.showMessageDialog(jFrame,"Battery Full", JOptionPane.INFORMATION_MESSAGE);
	                        int input = JOptionPane.showConfirmDialog(null, "Battery is Fully Charged !!");

	                    if (input == 0)
	                    {
//	                        System.exit(0);
//	                        int input3 = JOptionPane.showConfirmDialog((jFrame, "SOC is equal to SOH");
//	                        int input3 = JOptionPane.showConfirmDialog(null, "SOC is equal to SOH.");
//
//	                        if (input3 == 0) {
//
//	                        }
	                    	JOptionPane.showMessageDialog(null, "SOC is equal to SOH.");
	                    }
	                    }


	                    if(Vb_in_float < 4.2 && Ib_in_float < 55)
	                    {
//	                        int input = JOptionPane.showConfirmDialog(null, "Charging Mode On!!");
//	                        if (input == 0) {
//
//	                        }
	                    	JOptionPane.showMessageDialog(null, "Charging Mode On!!");
	                    }


	                    if(Vb_in_float > 4.2 || Ib_in_float > 55)
	                    {
	                        if (Ib_in_float> 55 && Vb_in_float>4.2) {
//	                            int input = JOptionPane.showConfirmDialog(null, "Maximum limit Reached due to both parameters.");
//	                            if (input == 0) {
//
//	                            }
	                        	JOptionPane.showMessageDialog(null, "Maximum limit Reached due to both parameters.");
	                        }

	                        else if (Vb_in_float > 4.2)
	                        {
//	                            int input1 = JOptionPane.showConfirmDialog(null, "Maximum limit Reached due to overvoltage.");
//	                            if (input1 == 0) {
//
//	                            }
	                        	JOptionPane.showMessageDialog(null, "Maximum limit Reached due to overvoltage.");
	                        }

	                        else if (Ib_in_float > 55)
	                        {
//	                            int input2 = JOptionPane.showConfirmDialog(null, "Maximum limit Reached due to overcurrent.");
//	                            if (input2 == 0) {
//
//	                            }
	                        	JOptionPane.showMessageDialog(null,  "Maximum limit Reached due to overcurrent.");
	                        }

	                    }

	                }
	                
	                else {  // MAIN WALE IF KA ELSE CONDITION
//	                    int input = JOptionPane.showConfirmDialog(null, "Disharging Mode !!");
	                    JOptionPane.showMessageDialog(null,  "Disharging Mode !!");

	                    if (Vb_in_float > 2.4)
	                    {
//	                        int input2 = JOptionPane.showConfirmDialog(null, "SOC is " + SOC_in_String );
	                    	JOptionPane.showMessageDialog(null,  "SOC is " + SOC_in_String);
	                    }
	                    else { // Ye wali condition nahi samjhi. Jo nhi hai jaisa ka waisa likh diya.
//	                        int input2 = JOptionPane.showConfirmDialog(null, "SOC is " + NewDOD_in_String );
	                        JOptionPane.showMessageDialog(null,  "SOC is " + NewDOD_in_String);
	                    }
	                }
	                
				} // Try Block Ends
				
				catch (Exception ex) {
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "Please enter all the required parameters.");
				}
				
				finally {
//					int input = JOptionPane.showConfirmDialog(null, "Please enter all the required parameters.");
					
//					JOptionPane.showMessageDialog(null, "Please enter all the required parameters.");
				} // Finally Block Ends
                
			}  // MouseClicked Function Ends
		}); // Add mouseListener ends
		
		jButtonSubmit.setBounds(398, 349, 319, 27);
		add(jButtonSubmit);
		
		
//		--------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		JButton jButtonReset = new JButton("Reset Parameters");
		jButtonReset.setFont(new Font("Tahoma", Font.PLAIN, 21));
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
		jButtonReset.setBounds(398, 381, 319, 27);
		add(jButtonReset);
		
		
//		------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		jTextFieldInitial_SOC = new JTextField();
		jTextFieldInitial_SOC.setBounds(747, 117, 86, 20);
		add(jTextFieldInitial_SOC);
		jTextFieldInitial_SOC.setColumns(10);
		
		jTextField_SOH = new JTextField();
		jTextField_SOH.setText("100");
		jTextField_SOH.setColumns(10);
		jTextField_SOH.setBounds(747, 155, 86, 20);
		jTextField_SOH.setEditable(false);
		add(jTextField_SOH);
		
		jTextFieldInitial_DOD = new JTextField();
		jTextFieldInitial_DOD.setColumns(10);
		jTextFieldInitial_DOD.setBounds(747, 192, 86, 20);
		add(jTextFieldInitial_DOD);
		
		jTextField_Ib = new JTextField();
		jTextField_Ib.setColumns(10);
		jTextField_Ib.setBounds(747, 231, 86, 20);
		add(jTextField_Ib);
		
		jTextField_Vb = new JTextField();
		jTextField_Vb.setColumns(10);
		jTextField_Vb.setBounds(747, 274, 86, 20);
		add(jTextField_Vb);
		
		JLabel lblNewLabel_1 = new JLabel("This calculator calculates the State of Charge (SOC) and State of Health (SOH) of Lithium-ion");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(194, 473, 765, 35);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("batteries. It gives indication about the battery usage and also indicates about the charging and");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(194, 519, 765, 35);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("discharging mode of the battery to be tested. Max. value for Ib is 55 mA and Max value for Vb");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(194, 565, 765, 35);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("is 4.2 Volts");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(194, 604, 765, 35);
		add(lblNewLabel_4);
	}
}
