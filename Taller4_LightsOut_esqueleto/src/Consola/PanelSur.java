package Consola;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelSur extends JPanel

{
	private JLabel jugadas, jugador;
	private JTextField txt_jugadas, txt_jugador;
	
	public PanelSur()
	{
		setLayout(new GridLayout( 1, 4 ));
		jugadas = new JLabel("Jugadas: ");
		jugador = new JLabel("Jugador: ");
		
		txt_jugadas = new JTextField();
		txt_jugadas.setEditable(false);
		txt_jugador = new JTextField();
		
		add(jugadas);
		add(txt_jugadas);
		add(jugador);
		add(txt_jugador);
		
		
		
	}
	
	
}
