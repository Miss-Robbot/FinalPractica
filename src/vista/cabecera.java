package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class cabecera extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cabecera frame = new cabecera();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public cabecera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmInicio = new JMenuItem(" Inicio");
		mntmInicio.setIcon(new ImageIcon("/img/icono.png"));
		menuBar.add(mntmInicio);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		menuBar.add(mntmCliente);
		
		JMenuItem mntmPedidos = new JMenuItem("Pedidos");
		menuBar.add(mntmPedidos);
		
		JMenuItem mntmArtculos = new JMenuItem("Art\u00EDculos");
		mntmArtculos.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmArtculos);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
