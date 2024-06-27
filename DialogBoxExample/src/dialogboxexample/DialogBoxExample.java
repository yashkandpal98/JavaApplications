package dialogboxexample;

import java.awt.*;
import java.awt.event.*;


class Dial extends Dialog implements ActionListener
{
    Button b;
    TextField tf;
    DialogBoxExample obj;
    
    Dial(DialogBoxExample obj)
    {
        super(obj, "Dialog Box", Dialog.ModalityType.DOCUMENT_MODAL);
        
        this.obj = obj;
        
        tf = new TextField();
        tf.setSize(100, 30);
        
        b = new Button();
        b.setSize(500, 500);
        b.addActionListener(this);
        
        setLayout(new FlowLayout(1, 50, 50));
        
        addWindowListener(new WindowAdapter()
                {
                    @Override
                    public void windowClosing(WindowEvent e)
                    {
                        dispose();
                    }
                });
        
        add(tf);
        add(b);
        
        setSize(300,300);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        obj.verify(tf.getText());
        
        tf.setText("");
        
        dispose();
    }
}



public class DialogBoxExample extends Frame implements ActionListener
{

    Button b;
    Dial d;
    Label l;
    
    DialogBoxExample()
    {
        d = new Dial(this);
        b = new Button("Password");
        l = new Label(); l.setBackground(Color.yellow); l.setForeground(Color.blue);
        
        b.addActionListener(this);
        
        add(b, BorderLayout.NORTH);
        add(l, BorderLayout.SOUTH);
        
        addWindowListener(new WindowAdapter()
                {
                    @Override
                    public void windowClosing(WindowEvent e)
                    {
                        dispose();
                    }
                });
        
        setSize(500,500);
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        d.setVisible(true);
    }
    
    public void verify(String ar)
    {
        if(ar.equals("OOP"))
        {
            l.setText("Valid");
        }
        else
        {
            l.setText("Not Valid");
            d.tf.setText("");
        }
    }
    
    public static void main(String[] args)
    {
        new DialogBoxExample();
    }

}
