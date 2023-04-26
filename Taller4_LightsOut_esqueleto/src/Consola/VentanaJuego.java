package Consola;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

import uniandes.dpoo.taller4.modelo.Tablero;


public class VentanaJuego extends JFrame

{
	private PanelNorte panelnorte;
	private PanelSur panelsur;
	private TableroJuego tablero;
	private Tablero tablerox;
	
	public VentanaJuego()
	
	{
		setLayout( new BorderLayout( ) );
		
        panelnorte = new PanelNorte(this);
        panelnorte.setBackground(new Color( 13, 175, 255 ));
        panelnorte.setForeground(Color.WHITE);
        
        panelsur = new PanelSur();
        
        tablero = new TableroJuego(tablerox);
        
        add(panelnorte, BorderLayout.NORTH);
        add(panelsur, BorderLayout.SOUTH);
        //add(tablero, BorderLayout.WEST);
 
        
        setSize(700,650);
		setDefaultCloseOperation( DISPOSE_ON_CLOSE );
		setTitle( "Lights Out" );
        setVisible( true );
        setLocationRelativeTo( null );
        
        
	}
	
	public static void main (String[ ] args)
    {
        new VentanaJuego(); 
    }
	
	

}
