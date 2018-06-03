package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DarAltaCliente extends JPanel {
	
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtDNI;
	private JTextField txtDireccion;
	private JTextField txtTelf;
	private JLabel lblError;
	private JButton btnDarDeAlta;


	/**
	 * Create the panel.
	 */
	public DarAltaCliente() {
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gbl_contentPane);
		
		JLabel lblNombre = new JLabel("Nombre/Raz\u00F3n Social:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 0);
		gbc_lblNombre.gridwidth = 4;
		gbc_lblNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 0;
		add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 2;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 0;
		gbc_txtNombre.gridy = 1;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblDninif = new JLabel("DNI/NIF:");
		lblDninif.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblDninif = new GridBagConstraints();
		gbc_lblDninif.anchor = GridBagConstraints.WEST;
		gbc_lblDninif.insets = new Insets(0, 0, 5, 5);
		gbc_lblDninif.gridx = 0;
		gbc_lblDninif.gridy = 2;
		add(lblDninif, gbc_lblDninif);
		
		txtDNI = new JTextField();
		GridBagConstraints gbc_txtDNI = new GridBagConstraints();
		gbc_txtDNI.gridwidth = 2;
		gbc_txtDNI.insets = new Insets(0, 0, 5, 5);
		gbc_txtDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDNI.gridx = 0;
		gbc_txtDNI.gridy = 3;
		contentPane.add(txtDNI, gbc_txtDNI);
		txtDNI.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblDireccin = new GridBagConstraints();
		gbc_lblDireccin.anchor = GridBagConstraints.WEST;
		gbc_lblDireccin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccin.gridx = 0;
		gbc_lblDireccin.gridy = 4;
		add(lblDireccin, gbc_lblDireccin);
		
		txtDireccion = new JTextField();
		GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
		gbc_txtDireccion.anchor = GridBagConstraints.NORTH;
		gbc_txtDireccion.gridwidth = 2;
		gbc_txtDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDireccion.gridx = 0;
		gbc_txtDireccion.gridy = 5;
		contentPane.add(txtDireccion, gbc_txtDireccion);
		txtDireccion.setColumns(10);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
		gbc_lblTelfono.anchor = GridBagConstraints.WEST;
		gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelfono.gridx = 0;
		gbc_lblTelfono.gridy = 6;
		add(lblTelfono, gbc_lblTelfono);
		
		txtTelf = new JTextField();
		GridBagConstraints gbc_txtTelf = new GridBagConstraints();
		gbc_txtTelf.gridwidth = 2;
		gbc_txtTelf.insets = new Insets(0, 0, 5, 5);
		gbc_txtTelf.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelf.gridx = 0;
		gbc_txtTelf.gridy = 7;
		contentPane.add(txtTelf, gbc_txtTelf);
		txtTelf.setColumns(10);
		
		lblError = new JLabel(" ");
		lblError.setForeground(Color.RED);
		GridBagConstraints gbc_lblError = new GridBagConstraints();
		gbc_lblError.anchor = GridBagConstraints.WEST;
		gbc_lblError.gridheight = 2;
		gbc_lblError.gridwidth = 2;
		gbc_lblError.insets = new Insets(0, 0, 5, 5);
		gbc_lblError.gridx = 0;
		gbc_lblError.gridy = 8;
		add(lblError, gbc_lblError);
		
		btnDarDeAlta = new JButton("Dar de Alta");
		btnDarDeAlta.setBackground(new Color(250, 240, 230));
		GridBagConstraints gbc_btnDarDeAlta = new GridBagConstraints();
		gbc_btnDarDeAlta.insets = new Insets(0, 0, 0, 5);
		gbc_btnDarDeAlta.gridx = 1;
		gbc_btnDarDeAlta.gridy = 10;
		add(btnDarDeAlta, gbc_btnDarDeAlta);
	}
	
	public JTextField getTxtNombre() {
		return txtNombre;
	}


	public void setTxtNombre(String string) {
		this.txtNombre.setText(string);
	}


	public JTextField getTxtDNI() {
		return txtDNI;
	}


	public void setTxtDNI(String txtDNI) {
		this.txtDNI.setText(txtDNI);
	}


	public JTextField getTxtDireccion() {
		return txtDireccion;
	}


	public void setTxtDireccion(String txtDireccion) {
		this.txtDireccion.setText(txtDireccion);
	}


	public JTextField getTxtTelf() {
		return txtTelf;
	}


	public void setTxtTelf(String txtTelf) {
		this.txtTelf.setText(txtTelf);
	}


	public JLabel getLblError() {
		return lblError;
	}


	public void setLblError(String lblError) {
		this.lblError.setText(lblError);
	}
	
	public JButton getBtnDarDeAlta() {
		return btnDarDeAlta;
	}


	public void setBtnDarDeAlta(JButton btnDarDeAlta) {
		this.btnDarDeAlta = btnDarDeAlta;
	}


	public void vaciarTextos(){
		this.txtTelf.setText("");
		this.txtDireccion.setText("");
		this.txtNombre.setText("");
		this.txtDNI.setText("");
	}

}
