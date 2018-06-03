package vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelInicio extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelInicio() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblSaludoIncial = new JLabel("Bienvenido a la tienda de Miss Robot");
		lblSaludoIncial.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblSaludoIncial = new GridBagConstraints();
		gbc_lblSaludoIncial.insets = new Insets(0, 0, 5, 5);
		gbc_lblSaludoIncial.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSaludoIncial.gridx = 1;
		gbc_lblSaludoIncial.gridy = 1;
		add(lblSaludoIncial, gbc_lblSaludoIncial);
		
		JLabel lblImagen = new JLabel("");
		GridBagConstraints gbc_lblImagen = new GridBagConstraints();
		gbc_lblImagen.insets = new Insets(0, 0, 5, 5);
		gbc_lblImagen.gridx = 1;
		gbc_lblImagen.gridy = 4;
		lblImagen.setIcon(new ImageIcon("img/MissRobot.png"));
		add(lblImagen, gbc_lblImagen);

	}

}
