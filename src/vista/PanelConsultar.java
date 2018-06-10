package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;

public class PanelConsultar extends JPanel{
	
	protected JComboBox comboBox;	//Poner en <> el tipo de objeto que tiene
	protected JTextArea txtInformacion;
	protected JButton btnVolver;
	
	public PanelConsultar() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 2;
		add(comboBox, gbc_comboBox);
		
		txtInformacion = new JTextArea();
		GridBagConstraints gbc_txtInformacion = new GridBagConstraints();
		gbc_txtInformacion.gridheight = 7;
		gbc_txtInformacion.insets = new Insets(0, 0, 5, 5);
		gbc_txtInformacion.fill = GridBagConstraints.BOTH;
		gbc_txtInformacion.gridx = 1;
		gbc_txtInformacion.gridy = 5;
		txtInformacion.setEditable(false);
		txtInformacion.setBackground(Color.white);
		add(txtInformacion, gbc_txtInformacion);
		
		btnVolver = new JButton("Volver");
		btnVolver.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_btnVolver = new GridBagConstraints();
		gbc_btnVolver.insets = new Insets(0, 0, 0, 5);
		gbc_btnVolver.gridx = 1;
		gbc_btnVolver.gridy = 13;
		add(btnVolver, gbc_btnVolver);
	}


	public JComboBox getComboBox() {
		return comboBox;
	}
	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}
	
	public JTextArea getTxtInformacion() {
		return txtInformacion;
	}
	public void setTxtInformacion(String string) {
		this.txtInformacion.setText(string);
	}
	public JButton getBtnVolver() {
		return btnVolver;
	}
	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}
	
	
}
