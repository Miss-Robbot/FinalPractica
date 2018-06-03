package vista;

import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelInicio extends JPanel{
	public PanelInicio() {
		setLayout(null);
		
		JLabel lblImagen = new JLabel("");
		lblImagen.setBounds(93, 101, 269, 199);
		ImageIcon imgIcon = new ImageIcon("img/MissRobot.png");
		Image imgEscalada = imgIcon.getImage().getScaledInstance(lblImagen.getWidth(),
				lblImagen.getHeight(), Image.SCALE_SMOOTH);
		Icon iconoEscalado = new ImageIcon(imgEscalada);
		setLayout(null);
		lblImagen.setIcon(iconoEscalado);
		add(lblImagen);
		
		JLabel lblSaludoInicial = new JLabel("Bienvenidos a la tienda de Miss Robot");
		lblSaludoInicial.setFont(new Font("Garamond", Font.BOLD, 19));
		lblSaludoInicial.setBounds(68, 43, 320, 22);
		add(lblSaludoInicial);
	}

	private JLabel lblInformacion;
	private JLabel lblImagen;
	
	public JLabel getLblInformacion() {
		return lblInformacion;
	}
	public void setLblInformacion(JLabel lblInformacion) {
		this.lblInformacion = lblInformacion;
	}
	public JLabel getLblImagen() {
		return lblImagen;
	}
	public void setLblImagen(JLabel lblImagen) {
		this.lblImagen = lblImagen;
	}
}
