package Consola;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import uniandes.dpoo.taller4.modelo.Tablero;



public class TableroJuego extends JPanel
{
	public Tablero tablero;
	private int ladoTablero;
	

	public TableroJuego(Tablero tablero) {
		this.tablero = tablero;
	}


	public void paint(Graphics g)
    {
        Graphics2D  g2d = (Graphics2D) g;
        
        g.drawRect( 0, 0, 120, 320 );
        g.setColor( Color.CYAN );
        
        g.fillRect( 10, 50, 50, 60 );
        
        boolean[][] tableroJuego= tablero.darTablero( );
        ladoTablero=tableroJuego.length;
        
        int ancho=getWidth( )/ladoTablero;
        int alto= getHeight( )/ladoTablero;
        
        for(int i=0;i<ladoTablero;i++)
        {
            for(int j=0; j<ladoTablero;j++)
            {
                if(tableroJuego[i][j]==true)
                {
                    g.setColor( Color.YELLOW );
                    g.fillRect( i*ancho, j*alto, ancho, alto );
                    g.setColor( Color.BLACK );
                    g.drawRect( i*ancho, j*alto, ancho, alto );
                    
                }
                else
                {
                    g.setColor( Color.GRAY );
                    g.fillRect( i*ancho, j*alto, ancho, alto );
                    g.setColor( Color.BLUE );
                    g.drawRect( i*ancho, j*alto, ancho, alto );
                }
                
                
            }
            
        }
        
        
    }

}
