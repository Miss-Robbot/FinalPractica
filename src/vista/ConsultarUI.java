package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class ConsultarUI extends JFrame {

	private JPanel paneConsulta;
	private JTextArea textArea;
	private JComboBox comboBox;
	private JButton btnVolver;

	/**
	 * Create the frame.
	 */
	public ConsultarUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		paneConsulta = new JPanel();
		paneConsulta.setBackground(Color.LIGHT_GRAY);
		paneConsulta.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(paneConsulta);
		GridBagLayout gbl_paneConsulta = new GridBagLayout();
		gbl_paneConsulta.columnWidths = new int[]{0, 0};
		gbl_paneConsulta.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0,0};
		gbl_paneConsulta.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_paneConsulta.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		paneConsulta.setLayout(gbl_paneConsulta);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(192, 192, 192), null));
		panel.setBackground(new Color(255, 240, 245));
		panel.setLayout(null);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		paneConsulta.add(panel, gbc_panel);
		
		comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(27, 11, 354, 20);
		panel.add(comboBox);
		
		JPanel pnTextInfo = new JPanel();
		GridBagConstraints gbc_pnTextInfo = new GridBagConstraints();
		gbc_pnTextInfo.gridheight = 6;
		gbc_pnTextInfo.insets = new Insets(0, 0, 5, 0);
		gbc_pnTextInfo.fill = GridBagConstraints.BOTH;
		gbc_pnTextInfo.gridx = 0;
		gbc_pnTextInfo.gridy = 1;
		paneConsulta.add(pnTextInfo, gbc_pnTextInfo);
		GridBagLayout gbl_pnTextInfo = new GridBagLayout();
		gbl_pnTextInfo.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_pnTextInfo.rowHeights = new int[]{0, 0, 0};
		gbl_pnTextInfo.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnTextInfo.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		pnTextInfo.setLayout(gbl_pnTextInfo);
		
		JLabel lblInformacin = new JLabel("  INFORMACI\u00D3N");
		GridBagConstraints gbc_lblInformacin = new GridBagConstraints();
		gbc_lblInformacin.anchor = GridBagConstraints.WEST;
		gbc_lblInformacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblInformacin.gridx = 2;
		gbc_lblInformacin.gridy = 0;
		pnTextInfo.add(lblInformacin, gbc_lblInformacin);
		
		textArea = new JTextArea();
		textArea.setSelectionColor(Color.PINK);
		textArea.setEditable(false);
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 6;
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 1;
		pnTextInfo.add(textArea, gbc_textArea);
		
		btnVolver = new JButton(" Volver ");
		btnVolver.setBackground(new Color(255, 240, 245));
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVolver.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		GridBagConstraints gbc_btnVolver = new GridBagConstraints();
		gbc_btnVolver.anchor = GridBagConstraints.EAST;
		gbc_btnVolver.gridx = 0;
		gbc_btnVolver.gridy = 7;
		paneConsulta.add(btnVolver, gbc_btnVolver);
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}
	
	
	
}
