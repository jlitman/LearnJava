import javax.swing.*;

class SwingDemo {

    SwingDemo() {
        //create JFrame container
        JFrame jfrm = new JFrame("Simple Swing Application");
        jfrm.setSize(275, 100);

        //terminate the program when the user closes the app
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel("Swing is a modern-ish Java gui");

        jfrm.add(jlab);

        //make the frame visible
        jfrm.setVisible(true);
    }

    public static void main(String argvs[]) {
        //create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
