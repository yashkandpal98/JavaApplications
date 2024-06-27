package sample;

import java.awt.*;
import java.awt.event.*;
class Sample extends Frame implements ActionListener
{
    Panel p1,p2,p3;
    Button b1,b2;
    Label l1,l2;
    TextField t1,t2;
    Sample()
    {

    p1=new Panel(new GridLayout(2,2,10,10));
    p2=new Panel();
    p3=new Panel();
    l1=new Label("Name");
    l2=new Label("Password");
    t1=new TextField(10);
    t2=new TextField(10);
    t2.setEchoChar('*');
    b1=new Button("Reset");
    b2=new Button("Submit");

    b1.addActionListener(this);
    b2.addActionListener(this);
    p1.setVisible(true);
    p2.setVisible(true);
    p3.setVisible(false);
    add(p1,BorderLayout.NORTH);
    add(p2,BorderLayout.SOUTH);
    add(p3);
    p1.add(l1);
    p1.add(t1);
    p1.add(l2);
    p1.add(t2);

    p2.add(b1);
    p2.add(b2);

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
    @Override
    public void actionPerformed(ActionEvent e)
    {
    	if(b1==e.getSource())
        {
            if(!t2.getText().equals(""))
            {
                t2.setText("");
            }
            else
            {
                t1.setText(" ");
            }
        }
        else {
            if(e.getSource()==b2&&t2.getText().equals("abcd"))
            {
                Label l=new Label("Name = "+t1.getText());
                p3.add(l);
                p1.setVisible(false);
                p2.setVisible(false);
                p3.setVisible(true);
                setVisible(true);
            }
        }
    }
    public static void main(String args[])
    {
        new Sample();
    }
}
