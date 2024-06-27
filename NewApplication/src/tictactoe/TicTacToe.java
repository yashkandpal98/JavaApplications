/*Tic-Tac-Toe*/

package tictactoe;

import java.awt.*;
import java.awt.event.*;

class ttt extends Frame implements ActionListener
{
    Label l[] , l2;
    Button b[];
    int count, c;
    Panel p;
    
    ttt()
    {
        b = new Button[9] ;
        for(int j=0; j<9; j++)
        {
            b[j] = new Button();
        }
        
        l2 = new Label() ;
        count = 0 ;
        p = new Panel() ;
    }
    
    public void proc()
    {
        p.setBackground(Color.black);
        p.setLayout(new GridLayout(3, 3, 10, 10));
        
        for(int i = 0 ; i < 9 ; i++)
        {
            p.add(b[i]) ;
            
            b[i].addActionListener(this);
        }
        
        addWindowListener(new WindowAdapter() {@Override public void windowClosing(WindowEvent e){dispose();}});
        
        add(p, BorderLayout.CENTER);
        add(l2, BorderLayout.SOUTH);
        
        setVisible(true);
        setSize(500,500);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Button b1=new Button();
        b1=(Button) e.getSource();
        /*for(int i=0; i<9; i++)
        {
            if(b1==b[i])
            {
                c=i;
                break;
            }
        }*/
        
        if(count%2==0)
        {
            b1.setLabel("X");
        }
        else
        {
            b1.setLabel("O");
        }
        count++;
        b1.removeActionListener(this);
        verify();
    }
    
    public void verify()
    {
        if(b[0].getLabel()==b[1].getLabel() && b[0].getLabel()==b[2].getLabel() &&(b[0].getLabel().equals("X") || b[0].getLabel().equals("O")))
        {
            l2.setText(b[0].getLabel()+" Wins");
            for(int i=1; i<9; i++)
            {
                b[i].removeActionListener(this);
            }
        }
        else if(b[0].getLabel()==b[4].getLabel() && b[0].getLabel()==b[8].getLabel()&&(b[0].getLabel().equals("X") || b[0].getLabel().equals("O")))
        {
            l2.setText(b[0].getLabel()+" Wins");
            for(int i=1; i<9; i++)
            {
                b[i].removeActionListener(this);
            }
        }
        else if(b[0].getLabel()==b[3].getLabel() && b[0].getLabel()==b[6].getLabel()&&(b[0].getLabel().equals("X") || b[0].getLabel().equals("O")))
        {
                l2.setText(b[0].getLabel()+" Wins");
            for(int i=1; i<9; i++)
            {
                b[i].removeActionListener(this);
            }
        }
        else if(b[3].getLabel()==b[4].getLabel() && b[3].getLabel()==b[5].getLabel()&&(b[3].getLabel().equals("X") || b[3].getLabel().equals("O")))
        {
            l2.setText(b[3].getLabel()+" Wins");
            for(int i=0; i<9; i++)
            {
                if(i==3)
                {
                    continue;
                }
                b[i].removeActionListener(this);
            }
        }
        else if(b[6].getLabel()==b[7].getLabel() && b[6].getLabel()==b[8].getLabel()&&(b[6].getLabel().equals("X") || b[6].getLabel().equals("O")))
        {
            l2.setText(b[6].getLabel()+" Wins");
            for(int i=0; i<9; i++)
            {
                if(i==6)
                {
                    continue;
                }
                b[i].removeActionListener(this);
            }
        }
        else if(b[6].getLabel()==b[4].getLabel() && b[6].getLabel()==b[2].getLabel()&&(b[6].getLabel().equals("X") || b[6].getLabel().equals("O")))
        {
            l2.setText(b[6].getLabel()+" Wins");
            for(int i=0; i<9; i++)
            {
                if(i==6)
                {
                    continue;
                }
                b[i].removeActionListener(this);
            }
        }
        else if(b[1].getLabel()==b[4].getLabel() && b[1].getLabel()==b[7].getLabel()&&(b[1].getLabel().equals("X") || b[1].getLabel().equals("O")))
        {
            l2.setText(b[1].getLabel()+" Wins");
            for(int i=0; i<9; i++)
            {
                if(i==1)
                {
                    continue;
                }
                b[i].removeActionListener(this);
            }
        }
        else if(b[2].getLabel()==b[5].getLabel() && b[2].getLabel()==b[8].getLabel()&&(b[2].getLabel().equals("X") || b[2].getLabel().equals("O")))
        {
            l2.setText(b[2].getLabel()+" Wins");
            for(int i=0; i<9; i++)
            {
                if(i==2)
                {
                    continue;
                }
                b[i].removeActionListener(this);
            }
        }
    }
}

public class TicTacToe
{
    
    public static void main(String[] args)
    {
        ttt obj=new ttt();
        
        obj.proc();
    }
    
}
