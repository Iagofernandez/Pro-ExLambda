

package exemplolambda;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ifernandezblanco
 */
public class ClaseLambda {
      JFrame marco;
    JPanel panel;
    JButton boton;
    
     public ClaseLambda() {
        marco = new JFrame();
        panel = new JPanel();
        boton = new JButton("Pon cor");
        marco.setSize(500, 200);
        
        panel.add(boton);
        panel.add(panel);

     boton.addActionListener((ActionEvent e) -> {
         panel.setBackground(Color.red);
        });
     
}
}

