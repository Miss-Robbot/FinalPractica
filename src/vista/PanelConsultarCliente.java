package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelConsultarCliente extends JPanel{

	private JComboBox comboBox;	//Poner en <> el tipo de objeto que tiene
	private JTextField txtInformacion;
	private JButton btnVolver;
	
	public JComboBox getComboBox() {
		return comboBox;
	}
	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}
	public JTextField getTxtInformacion() {
		return txtInformacion;
	}
	public void setTxtInformacion(JTextField txtInformacion) {
		this.txtInformacion = txtInformacion;
	}
	public JButton getBtnVolver() {
		return btnVolver;
	}
	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}
	
	
}
