import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonDemo implements ActionListener {
    JLabel jlab;
    
    ButtonDemo() {
        JFrame jframe = new JFrame("A Button Example");

        jframe.setLayout(new FlowLayout());

        jframe.setSize(250,90);

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jBtnUp = new JButton("up");
        JButton jBtnDown = new JButton("down");

        jBtnUp.addActionListener(this);
        jBtnDown.addActionListener(this);

        jframe.add(jBtnUp);
        jframe.add(jBtnDown);

        jlab = new JLabel("Press a button");

        jframe.add(jlab);

        jframe.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("up")) {
            jlab.setText("You pressed 'up'");
        }
        else
        {
            jlab.setText("You pressed 'down'");
        }
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new ButtonDemo();
                }
        });
    }
}
