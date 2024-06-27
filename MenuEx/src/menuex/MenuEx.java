package menuex;

import java.awt.*;
import java.awt.event.*;

public class MenuEx extends Frame implements ActionListener
{
    MenuBar mb;
    Menu f,e;
    Label l;

    MenuEx()
    {
        mb=new MenuBar();
        f=new Menu("File");
        e=new Menu("Edit");
    }

    public void proc()
    {
        setMenuBar(mb);
        mb.add(f);
        mb.add(e);
        
        f.addActionListener(this);
        e.addActionListener(this);
        
        f.add(new MenuItem("New"));
        f.add(new MenuItem("Open"));
        f.add(new MenuItem("Save"));
        
        e.add(new MenuItem("Cut"));
        e.add(new MenuItem("Copy"));
        e.add(new MenuItem("Paste"));
        
        l=new Label();
        
        addWindowListener(new WindowAdapter(){@Override public void windowClosing(WindowEvent e){dispose();}});
        add(l, BorderLayout.SOUTH);
        
        setSize(500,500);
        setVisible(true);
    }

@Override
    public void actionPerformed(ActionEvent e)
    {
        l.setText(e.getActionCommand());
        l.setVisible(true);
    }

    public static void main(String[] args)
    {
        MenuEx obj=new MenuEx();
        obj.proc();
    }
}
