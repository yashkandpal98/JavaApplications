/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author kandp
 */
public class AWT extends Frame implements ActionListener{
    
    TextField tf;
    AWT()
    {
        Button b=new Button("Click me");
        b.setBounds(100,150,80,30);
        b.addActionListener(this);
        
        tf=new TextField();
        tf.setBounds(300,150,80,30);
        
        add(b);
        add(tf);
        
        setTitle("First Program");
        setSize(500,500);
        
        addWindowListener(new WindowAdapter(){@Override public void windowClosing(WindowEvent e){dispose();}});
        
        setLayout(null);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("Text set");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AWT AWT = new AWT();
    }
    
}
