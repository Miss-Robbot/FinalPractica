package vista;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

import modelo.Articulo;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class CambiarPrecioArticulo extends JPanel{
	
	private JLabel lblPrecioActual;
	private JTextField txtPrecioActual;
	private JLabel lblNuevoPrecio;
	private JTextField txtNuevoPrecio;
	private JButton btnVolver;
	private JComboBox comboBox;
	private JButton btnCambiar;
	
	public CambiarPrecioArticulo() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 534, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		comboBox = new JComboBox<>();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 1;
		add(comboBox, gbc_comboBox);
		
		lblPrecioActual = new JLabel("Este es el precio actual:");
		lblPrecioActual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblPrecioActual = new GridBagConstraints();
		gbc_lblPrecioActual.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioActual.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPrecioActual.gridx = 1;
		gbc_lblPrecioActual.gridy = 2;
		add(lblPrecioActual, gbc_lblPrecioActual);
		
		txtPrecioActual = new JTextField();
		GridBagConstraints gbc_txtPrecioActual = new GridBagConstraints();
		gbc_txtPrecioActual.gridheight = 2;
		gbc_txtPrecioActual.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecioActual.fill = GridBagConstraints.BOTH;
		gbc_txtPrecioActual.gridx = 1;
		gbc_txtPrecioActual.gridy = 3;
		txtPrecioActual.setEditable(false);
		txtPrecioActual.setBackground(Color.white);
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
		
		btnCambiar = new JButton("Cambiar");
		GridBagConstraints gbc_btnCambiar = new GridBagConstraints();
		gbc_btnCambiar.fill = GridBagConstraints.BOTH;
		gbc_btnCambiar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCambiar.gridx = 1;
		gbc_btnCambiar.gridy = 9;
		add(btnCambiar, gbc_btnCambiar);
		
		btnVolver = new JButton("Volver");
		GridBagConstraints gbc_btnVolver = new GridBagConstraints();
		gbc_btnVolver.insets = new Insets(0, 0, 0, 5);
		gbc_btnVolver.gridx = 1;
		gbc_btnVolver.gridy = 11;
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


	/**
	 * @return the comboBox
	 */
	public JComboBox getComboBox() {
		return comboBox;
	}


	/**
	 * @param comboBox the comboBox to set
	 */
	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}


	/**
	 * @return the btnCambiar
	 */
	public JButton getBtnCambiar() {
		return btnCambiar;
	}


	/**
	 * @param btnCambiar the btnCambiar to set
	 */
	public void setBtnCambiar(JButton btnCambiar) {
		this.btnCambiar = btnCambiar;
	}
	
	
	
	
}
