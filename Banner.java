//simple banner applet
import java.awt.*;
import java.applet.*;
/*
   <applet code="Banner" width=300 height=50>
   </applet>
*/

public class Banner extends Applet implements Runnable {
    String msg = " Java is kind of ok  ";
    Thread t;
    boolean stopFlag;

    public void init() {
        t = null;
    }
     public void start() {
         t = new Thread(this);
         stopFlag = false;
         t.start();
     }

     //entry point for thread
     public void run() {
         //redisplay the banner
         for(;;) {
             try {
                 repaint();
                 Thread.sleep(250);
                 if(stopFlag) {
                     break;
                 }
             } catch (InterruptedException ex) {}
         }
     }

     //pause the banner
     public void stop() {
         stopFlag = true;
         t = null;
     }

     //display the banner
     public void paint(Graphics g) {
         char ch;
         ch = msg.charAt(0);
         msg = msg.substring(1, msg.length());
         msg += ch;
         g.drawString(msg, 50, 30);
         showStatus("what is this doing???");
     }
}
