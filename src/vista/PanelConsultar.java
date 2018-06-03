package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelConsultar extends JPanel{

	private JComboBox comboBox;	//Poner en <> el tipo de objeto que tiene
	private JTextArea txtInformacion;
	private JButton btnVolver;
	
	public JComboBox getComboBox() {
		return comboBox;
	}
	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}
	
	public JTextArea getTxtInformacion() {
		return txtInformacion;
	}
	public void setTxtInformacion(JTextArea txtInformacion) {
		this.txtInformacion = txtInformacion;
	}
	public JButton getBtnVolver() {
		return btnVolver;
	}
	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}
	
	
}
