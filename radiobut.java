import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class radiobut extends JFrame  implements ActionListener
{
    JRadioButton b1,b2,b3;
    JLabel l1;
    JTextField t1;
    public radiobut()
    {
        b1 = new JRadioButton("C");
        b2 = new JRadioButton("C++");
        b3 = new JRadioButton("JAVA");
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        l1 = new JLabel("Selected Language");
        t1 = new JTextField(30);
        add(b1);
        add(b2);
        add(b3);
        add(l1);
        add(t1);
        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        t1.setText(e.getActionCommand());
    }
    public static void main(String args[])
    {
        radiobut ob = new radiobut();
    }
}
