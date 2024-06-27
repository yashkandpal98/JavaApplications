package gridbagexample;



import java.awt.*;
import java.awt.event.*;



public class GridBagExample extends Frame implements ActionListener
{
    //Frame f;
    GridBagLayout grid;
    GridBagConstraints gbc;

    
    GridBagExample()
    {
        //f=new Frame("GridBag Layout Example");
        grid=new GridBagLayout();
        gbc=new GridBagConstraints();
        
        setLayout(grid);
        
        Button b1=new Button("First");
        Button b2=new Button("Second");
        Button b3=new Button("Third");
        Button b4=new Button("Fourth");
                
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridheight=1;
        gbc.fill=GridBagConstraints.VERTICAL;
        add(b1,gbc);
        
        gbc.gridx=1;
        gbc.gridy=1;
        add(b2, gbc);
        
        gbc.gridx=2;
        gbc.gridy=2;
        add(b3, gbc);
        
        gbc.gridx=3;
        gbc.gridy=3;
        gbc.gridwidth=1;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        add(b4, gbc);
        
        addWindowListener(new WindowAdapter(){@Override public void windowClosing(WindowEvent e){dispose();}});
        
        setSize(500,500);
        setVisible(true);
    }

    
    public static void main(String[] args)
    {
        new GridBagExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
