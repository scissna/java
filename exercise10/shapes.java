import java.awt.*;
import java.awt.event.*;

public class shapes extends Frame implements ItemListener 
{
	Choice shapes;
	String msg = "";

public shapes() {


	setLayout(new FlowLayout());    // Use a flow layout.
	shapes = new Choice();          // Create choice lists.

	shapes.add("Select");           // Add items to shapes list.
	shapes.add("Square");
	shapes.add("Rectangle");
	shapes.add("Triangle");
	shapes.add("Circle");

	add(shapes);                    // Add choice lists to window.
	shapes.addItemListener(this);          // Add item listeners.
	
	
	
	
	
	addWindowListener(new WindowAdapter() 
	{
	 public void windowClosing(WindowEvent we)
		{
		System.exit(0);
		}
	});
}

public void itemStateChanged(ItemEvent ie)
   {
   repaint();
   }




public void paint(Graphics g)       // Display current selections
  {
   msg=shapes.getSelectedItem();
     if(msg.equals("Rectangle")) 
     {
     g.setColor(Color.red);
     g.fillRect(200,200,200,100);
     }



    else if(msg.equals("Square"))
        {
	g.setColor(Color.green);
	g.fillRect(200,200,200,200);
        }

    else if(msg.equals("Circle")) 
        {
     	g.setColor(Color.pink);
	g.fillOval(200,200,200,200);
        }


    else if(msg.equals("Triangle")) 
        {
     	g.setColor(Color.yellow);
	int xpoints[] = {150,300,450};
	int ypoints[] = {400,150,400};
	int num = 3;
	g.fillPolygon(xpoints, ypoints, num);
        }

     else{
	g.drawString("please select your choice",300,100);
        }
  }


public static void main(String[] args) 
{
	shapes appwin = new shapes();

	appwin.setSize(new Dimension(240, 180));
	appwin.setTitle("ChoiceDemo");
	appwin.setVisible(true);
}
}
