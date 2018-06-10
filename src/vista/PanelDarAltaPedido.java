package vista;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDarAltaPedido extends JPanel {
	private JTextField txtNombre;
	private JTextField txtDescripcion;
	private JTextField textField;
	private JButton btnDarAlta;
	private JLabel lblConfirmacion;
	//Yolanda
	/**
	 * Create the panel.
	 */
	public PanelDarAltaPedido() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNombre = new JLabel("Introduce NIF Cliente:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.fill = GridBagConstraints.BOTH;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.BOTH;
		gbc_txtNombre.gridx = 1;
		gbc_txtNombre.gridy = 2;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Introduce Articulo:");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.WEST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 1;
		gbc_lblDescripcion.gridy = 4;
		add(lblDescripcion, gbc_lblDescripcion);
		
		txtDescripcion = new JTextField();
		GridBagConstraints gbc_txtDescripcion = new GridBagConstraints();
		gbc_txtDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDescripcion.fill = GridBagConstraints.BOTH;
		gbc_txtDescripcion.gridx = 1;
		gbc_txtDescripcion.gridy = 5;
		add(txtDescripcion, gbc_txtDescripcion);
		txtDescripcion.setColumns(10);
		
		JLabel lblCantidadProducto = new JLabel("Cantidad Articulo:");
		lblCantidadProducto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblCantidadProducto = new GridBagConstraints();
		gbc_lblCantidadProducto.fill = GridBagConstraints.VERTICAL;
		gbc_lblCantidadProducto.anchor = GridBagConstraints.WEST;
		gbc_lblCantidadProducto.insets = new Insets(0, 0, 5, 5);
		gbc_lblCantidadProducto.gridx = 1;
		gbc_lblCantidadProducto.gridy = 7;
		add(lblCantidadProducto, gbc_lblCantidadProducto);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 8;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblConfirmacion = new JLabel("");
		GridBagConstraints gbc_lblConfirmacion = new GridBagConstraints();
		gbc_lblConfirmacion.anchor = GridBagConstraints.WEST;
		gbc_lblConfirmacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfirmacion.gridx = 1;
		gbc_lblConfirmacion.gridy = 10;
		add(lblConfirmacion, gbc_lblConfirmacion);
		
		btnDarAlta = new JButton("DarAltaPedido");
		btnDarAlta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnDarAlta = new GridBagConstraints();
		gbc_btnDarAlta.fill = GridBagConstraints.VERTICAL;
		gbc_btnDarAlta.insets = new Insets(0, 0, 0, 5);
		gbc_btnDarAlta.gridx = 1;
		gbc_btnDarAlta.gridy = 11;
		add(btnDarAlta, gbc_btnDarAlta);

	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtDescripcion() {
		return txtDescripcion;
	}

	public void setTxtDescripcion(JTextField txtDescripcion) {
		this.txtDescripcion = txtDescripcion;
	}


	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JButton getBtnDarAlta() {
		return btnDarAlta;
	}

	public void setBtnDarAlta(JButton btnDarAlta) {
		this.btnDarAlta = btnDarAlta;
	}

	public JLabel getLblConfirmacion() {
		return lblConfirmacion;
	}

	
	
	
}
