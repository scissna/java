//2. Using 2D graphics commands in an Applet, construct a house. On mouse click event, change the color of the door from blue to red.


import java.awt.event.*;
import java.awt.*;

public class house extends Frame  implements MouseListener{
Color c2=new Color(0,0,255);


public house() {





// Anonymous inner class to handle window close events.
addMouseListener(this);
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}

public void paint(Graphics g) {

// Draw a polygon
int xpoints[] = {20,100,180};
int ypoints[] = {200,100,200};
int num = 3;

g.setColor(Color.orange);
g.fillPolygon(xpoints, ypoints, num);


// Draw rectangles.

g.setColor(Color.pink);
g.fillRect(25, 200, 150, 150);

g.setColor(c2);
g.fillRect(75,230, 50, 120);




}

public void mouseClicked(MouseEvent me){
c2=new Color(255,0,0);
repaint();}

public void mouseEntered(MouseEvent me) {}
public void mouseExited(MouseEvent me) {}
public void mousePressed(MouseEvent me) {}
public void mouseReleased(MouseEvent me) {}

public static void main(String[] args) {
house appwin = new house();

appwin.setSize(new Dimension(370, 700));
appwin.setTitle("house");
appwin.setVisible(true);
}
}
