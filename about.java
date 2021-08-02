import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.* ;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

class about  extends JFrame{
  about () {
      setSize(400,400);
      setResizable(false);
      setLocationRelativeTo(null);
      JPanel pan = new JPanel () ;
      pan.setSize(this.getSize().width,this.getSize().height);
      pan.setBackground(Color.DARK_GRAY);
      pan.setLayout(null);
      setContentPane(pan);
      JLabel border = new JLabel() ;
      border.setBorder(new LineBorder(Color.white, 2, true));
      border.setBounds(10,5,370,350);
      pan.add(border);
      JLabel me =new JLabel (new ImageIcon(getClass().getResource("me.png")));
      JLabel myName =new JLabel ("<html><center>Agriya Khetarpal, Nikunj Saini, Nischay Mahamana, Naman Priyadarshi, Sanket Agarwal<center></html>") ;
      JLabel copyright = new JLabel ("<html><center>Copyright © 2021. All rights reserved"
                                       + ".<center></html>");
      JLabel contact = new JLabel ("<html>"
                                       + "Product Version: Quiz 1.0.0<br/>"+ 
                                          "Updates : <a href='' style='color:white;'> Check for update</a><br/>" +
                                          "GitHub  : <a href=''>https://github.com/agriyakhetarpal/secondsemesterproject</a>"
                                           + "</html>");
      copyright.setBounds(85,290,200,30);
      copyright.setForeground(Color.white);
      border.add(copyright);
      contact.setBounds(80,140,250,150);
      contact.setForeground(Color.white);
      border.add(contact);
      myName.setBounds(0,110,80,20);
      myName.setFont(new Font("Verdana", Font.BOLD, 10));
      myName.setForeground(Color.white);
      me.setBounds(140,10,80,130);
      me.add(myName);
      JSeparator sep = new JSeparator();
      JSeparator sep2 = new JSeparator();
      sep.setBounds(30,150,300,5);
      sep2.setBounds(55,275,250,5);
      border.add(sep);
      border.add(sep2);
      border.add(me);
      setVisible(true);
  }
}