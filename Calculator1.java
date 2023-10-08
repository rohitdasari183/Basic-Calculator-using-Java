import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Calculator1 implements ActionListener
{
    JLabel l;
    JTextField t;
    int v1,v2;
    float result;
    char OP;
    Calculator1()
    {
         JButton b[]=new JButton[10];
         JButton add,sub,mul,div,clear,eq;
         JFrame f=new JFrame("CALCULATOR");
         f.setSize(300,480);
         f.setLayout(new GridLayout(5,5));
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         t=new JTextField(100);
         for(int i=0;i<10;i++)
         {
            b[i]=new JButton(""+i);
            b[i].setBackground(Color.green);
            b[i].setForeground(Color.white);



         }
        add=new JButton("+");
         sub=new JButton("-");
         mul=new JButton("*");
         div=new JButton("/");
         clear=new JButton("clear");
         eq=new JButton("=");
         t.addActionListener(this);


         for(int i=0;i<10;i++)
         {
            b[i].addActionListener(this);
         }
         add.addActionListener(this);
         sub.addActionListener(this);
         mul.addActionListener(this);
         div.addActionListener(this);
        clear.addActionListener(this);
         eq.addActionListener(this);
        f.add(t);

         for(int i=0;i<10;i++)
         {
            f.add(b[i]);
         }
         f.add(add);
         f.add(sub);
         f.add(mul);
         f.add(div);
         f.add(clear);
         f.add(eq);
         f.setVisible(true);

         



    }
    public void actionPerformed(ActionEvent ae)
    {
        String str=ae.getActionCommand();
        System.out.println(str);

        char ch=str.charAt(0);
        if(Character.isDigit(ch))
        {
            t.setText(t.getText()+str);
        }
        else if(str.equals("+"))
        {
            v1=Integer.parseInt(t.getText());
            OP='+';
            t.setText("");
        }
        else if(str.equals("-"))
        {
            v1=Integer.parseInt(t.getText());
            OP='-';
            t.setText("");
        }
        else if(str.equals("*"))
        {
            v1=Integer.parseInt(t.getText());
            OP='*';
            t.setText("");
        }
        else if(str.equals("*"))
        {
            v1=Integer.parseInt(t.getText());
            OP='/';
            t.setText("");
        }
        if(str.equals("="))
        {
            v2=Integer.parseInt(t.getText());
            if(OP=='+')
            {
                result=v1+v2;
            }
            else if(OP=='-')
            {
                result=v1-v2;
            } 
            else if(OP=='*')
            {
                result=v1*v2;
            }
            else if(OP=='/')
            {
                result=v1/v2;
            }
          t.setText(""+result);
            
        }
        if(str.equals("clear"))
        {
            t.setText("");
        }
    

    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable(){
             public void run()
        {
            new Calculator1();
        }
        }
       
        
        
        );
    }
}