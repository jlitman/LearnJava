//pass params to an applet
import java.awt.*;
import java.applet.*;
/*
   <applet code="Param" width=300 height=80>
   <param name=author value="Joe Litman">
   <param name=purpose value="Show parameters">
   <param name=version value=2>
   </applet>
*/

public class Param extends Applet {
    String author;
    String purpose;
    int ver;

    public void start() {
        String temp;
        author = getParameter("author");
        if(author == null) author = "not found";

        purpose = getParameter("purpose");
        if(purpose == null) purpose = "not found";

        temp = getParameter("version");
        try {
            if(temp != null) {
                ver = Integer.parseInt(temp);
            }
            else {
                ver = 0;
            }
        } catch(NumberFormatException e) {
            ver = -1;
        }
    }

    public void paint(Graphics g) {
        g.drawString("Purpose: " + purpose, 10, 20);
        g.drawString("by: " + author, 10, 40);
        g.drawString("version: " + ver, 10, 60);
    }
}
