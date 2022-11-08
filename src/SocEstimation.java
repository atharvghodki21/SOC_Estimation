import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class SocEstimation extends JFrame {

	private JPanel contentPane;
	
	private AboutProjectPanel aboutProject;
	private InformationPanel infoPanel;
	private SOC_CalculatorPanel SOC_Calculator;
	private AboutUsPanel aboutUs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SocEstimation frame = new SocEstimation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SocEstimation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 453);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		setLocationRelativeTo(null);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		aboutProject = new AboutProjectPanel();
		infoPanel = new InformationPanel();
		SOC_Calculator = new SOC_CalculatorPanel();
		aboutUs = new AboutUsPanel();
		
		
		
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(128, 128, 255));
		panelMenu.setBounds(10, 11, 159, 392);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		JLabel lblimg = new JLabel("Battery Image");
		lblimg.setBackground(new Color(255, 255, 255));
		lblimg.setBounds(10, 11, 139, 116);
//		lblimg.setIcon(new ImageIcon(BatteryImg));
		ImageIcon img = new ImageIcon(this.getClass().getResource("/BatteryImg.jpg"));
//		Image image = BufferedImage.getScaledInstance(800, 500, Image.SCALE_DEFAULT);
		lblimg.setIcon(img);
		panelMenu.add(lblimg);
		
//		-----------------------------------------------------------------------------------------------
		
		JPanel paneAboutProject = new JPanel();
		paneAboutProject.addMouseListener(new PanelButtonMouseAdapter(paneAboutProject) {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuClicked(aboutProject);
			}
		});
		
//		paneAboutProject.addMouseListener(new MouseAdapter(paneAboutProject));
		
		paneAboutProject.addMouseListener(new PanelButtonMouseAdapter(paneAboutProject));
		
		paneAboutProject.setForeground(new Color(128, 0, 255));
		paneAboutProject.setBackground(new Color(128, 0, 255));
		paneAboutProject.setBounds(10, 154, 139, 45);
		panelMenu.add(paneAboutProject);
		paneAboutProject.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("About Project");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(22, 11, 107, 14);
		paneAboutProject.add(lblNewLabel);
		
		JPanel InformationPane = new JPanel();
		
		InformationPane.addMouseListener(new PanelButtonMouseAdapter(InformationPane) {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuClicked(infoPanel);
			}
		});
		
		InformationPane.addMouseListener(new PanelButtonMouseAdapter(InformationPane));
		InformationPane.setBackground(new Color(128, 0, 255));
		InformationPane.setBounds(10, 210, 139, 45);
		panelMenu.add(InformationPane);
		
		JLabel lblInformation = new JLabel("Information");
		lblInformation.setVerticalAlignment(SwingConstants.CENTER);
		lblInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblInformation.setBackground(Color.WHITE);
		InformationPane.add(lblInformation);
		
		JPanel paneCalculator = new JPanel();
		
		paneCalculator.addMouseListener(new PanelButtonMouseAdapter(paneCalculator) {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuClicked(SOC_Calculator);
			}
		});
		
		
		paneCalculator.addMouseListener(new PanelButtonMouseAdapter(paneCalculator));
		paneCalculator.setBackground(new Color(128, 0, 255));
		paneCalculator.setBounds(10, 266, 139, 45);
		panelMenu.add(paneCalculator);
		
		JLabel lblCalculator = new JLabel("SOC Calculator");
		lblCalculator.setVerticalAlignment(SwingConstants.CENTER);
		lblCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculator.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCalculator.setBackground(Color.WHITE);
		paneCalculator.add(lblCalculator);
		
		JPanel paneAboutUS = new JPanel();
		
		paneAboutUS.addMouseListener(new PanelButtonMouseAdapter(paneAboutUS) {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuClicked(aboutUs);
			}
		});
		
		paneAboutUS.addMouseListener(new PanelButtonMouseAdapter(paneAboutUS));
		paneAboutUS.setBackground(new Color(128, 0, 255));
		paneAboutUS.setBounds(10, 322, 139, 45);
		panelMenu.add(paneAboutUS);
		
		JLabel lblAboutUs = new JLabel("About Us");
		lblAboutUs.setVerticalAlignment(SwingConstants.CENTER);
		lblAboutUs.setHorizontalAlignment(SwingConstants.CENTER);
		lblAboutUs.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAboutUs.setBackground(Color.WHITE);
		paneAboutUS.add(lblAboutUs);
		
		JPanel paneMainContent = new JPanel();
		paneMainContent.setBounds(179, 11, 400, 392);
		contentPane.add(paneMainContent);
		paneMainContent.setLayout(null);
		paneMainContent.add(aboutProject);
		paneMainContent.add(infoPanel);
		paneMainContent.add(SOC_Calculator);
		paneMainContent.add(aboutUs);
		
		MenuClicked(aboutProject);
		
//		JLabel lblNewLabel_1 = new JLabel("ABOUT PROJECT");
//		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
//		lblNewLabel_1.setBounds(94, 11, 203, 51);
//		panel.add(lblNewLabel_1);
	}
	
	
	public void MenuClicked(JPanel panel) {
		aboutProject.setVisible(false);
		infoPanel.setVisible(false);
		SOC_Calculator.setVisible(false);
		aboutUs.setVisible(false);
		
		panel.setVisible(true);
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter{
		
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
//			paneAboutProject.setBackground(new Color(128, 0, 255));
			panel.setBackground(new Color(0, 0, 255));
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(47, 79, 79));
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(60, 179, 113));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(0, 0, 255));
		}
	}
}
