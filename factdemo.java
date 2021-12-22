import java.awt.*;
import java.awt.event.*;
class fact extends Frame implements ActionListener
{
    Button b1;
    Label l1,l2;
    TextField t1,t2;
    public fact()
    {
        setTitle("factorial");
        l1=new Label("enter number");
        l2=new Label("factorial");
        t1=new TextField(20);
        t2=new TextField(20);
        b1 = new Button("click");
        setLayout(new FlowLayout());
        add (l1);
        add (t1);
        add (l2);
        add (t2);
        add (b1);
        b1.addActionListener(this);
        setSize(400,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            int num = Integer.parseInt(t1.getText());
            int fact=1;
            for(int i=num;i>=1;i--)
            {
                fact = fact*i;
            }
            t2.setText(String.valueOf(fact));
        }
    }
}
class factdemo
{
    public static void main(String args[])
    {
        fact ob = new fact();
    }
}
