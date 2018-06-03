package vista;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDarAltaCliente extends JPanel {
	private JTextField txtNombre;
	private JTextField txtDni;
	private JTextField txtDireccion;
	private JTextField texTelefono;

	/**
	 * Create the panel.
	 */
	public PanelDarAltaCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNombre = new JLabel("Introduce nombre:");
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
		
		JLabel lblDni = new JLabel("Introduce DNI:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.WEST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 1;
		gbc_lblDescripcion.gridy = 4;
		add(lblDni, gbc_lblDescripcion);
		
		txtDni = new JTextField();
		GridBagConstraints gbc_txtDescripcion = new GridBagConstraints();
		gbc_txtDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDescripcion.fill = GridBagConstraints.BOTH;
		gbc_txtDescripcion.gridx = 1;
		gbc_txtDescripcion.gridy = 5;
		add(txtDni, gbc_txtDescripcion);
		txtDni.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Introduce Dirección:");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNombreProveedor = new GridBagConstraints();
		gbc_lblNombreProveedor.fill = GridBagConstraints.VERTICAL;
		gbc_lblNombreProveedor.anchor = GridBagConstraints.WEST;
		gbc_lblNombreProveedor.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreProveedor.gridx = 1;
		gbc_lblNombreProveedor.gridy = 7;
		add(lblDireccion, gbc_lblNombreProveedor);
		
		txtDireccion = new JTextField();
		GridBagConstraints gbc_txtProveedor = new GridBagConstraints();
		gbc_txtProveedor.insets = new Insets(0, 0, 5, 5);
		gbc_txtProveedor.fill = GridBagConstraints.BOTH;
		gbc_txtProveedor.gridx = 1;
		gbc_txtProveedor.gridy = 8;
		add(txtDireccion, gbc_txtProveedor);
		txtDireccion.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Introduce Teléfono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblCantidadProducto = new GridBagConstraints();
		gbc_lblCantidadProducto.fill = GridBagConstraints.VERTICAL;
		gbc_lblCantidadProducto.anchor = GridBagConstraints.WEST;
		gbc_lblCantidadProducto.insets = new Insets(0, 0, 5, 5);
		gbc_lblCantidadProducto.gridx = 1;
		gbc_lblCantidadProducto.gridy = 10;
		add(lblTelefono, gbc_lblCantidadProducto);
		
		texTelefono = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 11;
		add(texTelefono, gbc_textField);
		texTelefono.setColumns(10);
		
		JButton btnDarAlta = new JButton("DarAlta");
		GridBagConstraints gbc_btnDarAlta = new GridBagConstraints();
		gbc_btnDarAlta.fill = GridBagConstraints.VERTICAL;
		gbc_btnDarAlta.insets = new Insets(0, 0, 0, 5);
		gbc_btnDarAlta.gridx = 1;
		gbc_btnDarAlta.gridy = 13;
		add(btnDarAlta, gbc_btnDarAlta);

	}

}
