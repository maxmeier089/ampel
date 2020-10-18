import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MAINFRAME extends JFrame
{
    
    private JPanel drawPanel;

    public MAINFRAME()
    {
        // Fenstername
        super("Ampel");
        
        // Neues Zeichenfeld
        drawPanel = new MAINPANEL();
        
        // Weißer Hintergrund
        drawPanel.setBackground(Color.white); 
        
        // An Fensterrahmen zuweisen
        setContentPane(drawPanel);
        
        // Tastatureingaben verarbeiten
        addKeyListener((KeyListener)drawPanel);
        
        // Fenstergröße
        setSize(220,445);
        
        // Sichtbar machen
        setVisible(true);
    }
    
}