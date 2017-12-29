package demo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class Demo extends JFrame implements MouseListener {
   /* public void windowClosing(WindowEvent e) {  
                dispose(); 
    }*/
    
    
    public Demo()
    {
        
        this.addMouseListener(this);
        this.setSize(400,400);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       
        setBackground(Color.BLACK);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        setBackground(Color.GRAY);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        setBackground(Color.magenta);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setBackground(Color.yellow);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setBackground(Color.blue);
    }
    public static void main(String args[]){
       Demo d = new Demo();
      d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
