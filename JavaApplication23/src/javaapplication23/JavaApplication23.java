package javaapplication23;

import java.awt.*;
import java.awt.event.*;



public class JavaApplication23 extends Frame{

    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    TextField t4 = new TextField();
       
    
    JavaApplication23()
    {
        
        
        t1.addKeyListener
        (
                new KeyAdapter()
                {
                    public void keyPressed(KeyEvent e)
                    {
                        switch (e.getKeyCode())
                        {
                            case KeyEvent.VK_CONTROL:
                                t2.setText(t1.getText());
                                break;
                            case KeyEvent.VK_SHIFT:
                                t3.setText(t1.getText());
                                break;
                            case KeyEvent.VK_ALT:
                                t4.setText(t1.getText());
                                break;
                            default:
                                break;
                        }
                    }
                }
        );
        
        add(t1, BorderLayout.NORTH);
        add(t2, BorderLayout.SOUTH);
        add(t3, BorderLayout.EAST);
        add(t4, BorderLayout.WEST);
        
        addWindowListener(
                new WindowAdapter()
                {
                    @Override
                    public void windowClosing(WindowEvent e)
                    {
                        dispose();
                    }
                }
        );
        
        setSize(500,500);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        new JavaApplication23();
        
    }
}
