package vista;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class CambiarPrecioArticulo extends JPanel{
	
	private JLabel lblPrecioActual;
	private JTextField txtPrecioActual;
	private JLabel lblNuevoPrecio;
	private JTextField txtNuevoPrecio;
	private JButton btnVolver;
	
	public CambiarPrecioArticulo() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 534, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblPrecioActual = new JLabel("Este es el precio actual:");
		lblPrecioActual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblPrecioActual = new GridBagConstraints();
		gbc_lblPrecioActual.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioActual.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPrecioActual.gridx = 1;
		gbc_lblPrecioActual.gridy = 1;
		add(lblPrecioActual, gbc_lblPrecioActual);
		
		txtPrecioActual = new JTextField();
		GridBagConstraints gbc_txtPrecioActual = new GridBagConstraints();
		gbc_txtPrecioActual.gridheight = 2;
		gbc_txtPrecioActual.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecioActual.fill = GridBagConstraints.BOTH;
		gbc_txtPrecioActual.gridx = 1;
		gbc_txtPrecioActual.gridy = 2;
		add(txtPrecioActual, gbc_txtPrecioActual);
		txtPrecioActual.setColumns(10);
		
		lblNuevoPrecio = new JLabel("Introduce nuevo precio:");
		lblNuevoPrecio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNuevoPrecio = new GridBagConstraints();
		gbc_lblNuevoPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblNuevoPrecio.anchor = GridBagConstraints.WEST;
		gbc_lblNuevoPrecio.gridx = 1;
		gbc_lblNuevoPrecio.gridy = 5;
		add(lblNuevoPrecio, gbc_lblNuevoPrecio);
		
		txtNuevoPrecio = new JTextField();
		GridBagConstraints gbc_txtNuevoPrecio = new GridBagConstraints();
		gbc_txtNuevoPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_txtNuevoPrecio.gridheight = 2;
		gbc_txtNuevoPrecio.fill = GridBagConstraints.BOTH;
		gbc_txtNuevoPrecio.gridx = 1;
		gbc_txtNuevoPrecio.gridy = 6;
		add(txtNuevoPrecio, gbc_txtNuevoPrecio);
		txtNuevoPrecio.setColumns(10);
		
		btnVolver = new JButton("Volver");
		GridBagConstraints gbc_btnVolver = new GridBagConstraints();
		gbc_btnVolver.insets = new Insets(0, 0, 0, 5);
		gbc_btnVolver.gridx = 1;
		gbc_btnVolver.gridy = 9;
		add(btnVolver, gbc_btnVolver);
	}


	public JLabel getLblPrecioActual() {
		return lblPrecioActual;
	}
	public void setLblPrecioActual(JLabel lblPrecioActual) {
		this.lblPrecioActual = lblPrecioActual;
	}
	public JTextField getTxtPrecioActual() {
		return txtPrecioActual;
	}
	public void setTxtPrecioActual(JTextField txtPrecioActual) {
		this.txtPrecioActual = txtPrecioActual;
	}
	public JLabel getLblNuevoPrecio() {
		return lblNuevoPrecio;
	}
	public void setLblNuevoPrecio(JLabel lblNuevoPrecio) {
		this.lblNuevoPrecio = lblNuevoPrecio;
	}
	public JTextField getTxtNuevoPrecio() {
		return txtNuevoPrecio;
	}
	public void setTxtNuevoPrecio(JTextField txtNuevoPrecio) {
		this.txtNuevoPrecio = txtNuevoPrecio;
	}
	public JButton getBtnVolver() {
		return btnVolver;
	}
	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}
	
	
	
	
}
