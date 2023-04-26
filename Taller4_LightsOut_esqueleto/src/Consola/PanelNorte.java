package Consola;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelNorte extends JPanel

{
	private JLabel txt_tamano, txt_dificultad;
	private JComboBox<String> tamano;
	private JRadioButton d1, d2, d3;
	
	public PanelNorte(VentanaJuego ventanajuego)
	{
		setLayout( new GridLayout( 1, 6 ) );
		
		txt_tamano = new JLabel("Tamaño: ");
		txt_tamano.setForeground(Color.WHITE);
		tamano = new JComboBox<String>();			
		txt_dificultad = new JLabel("Dificultad: ");
		txt_dificultad.setForeground(Color.WHITE);
			
		d1 = new JRadioButton();
		d1.setText("Fácil");
		d1.setBackground(new Color( 13, 175, 255 ));
		d1.setForeground(Color.WHITE);
		d2 = new JRadioButton();
		d2.setText("Medio");
		d2.setBackground(new Color( 13, 175, 255 ));
		d2.setForeground(Color.WHITE);
		d3 = new JRadioButton();
		d3.setText("Difícil");
		d3.setBackground(new Color( 13, 175, 255 ));
		d3.setForeground(Color.WHITE);
		
		add(txt_tamano);
		add(tamano);
		tamano.addItem("5x5");
		add(txt_dificultad);
		
		add(d1);
		add(d2);
		add(d3);
		
	}
}
