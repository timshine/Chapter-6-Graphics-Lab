
/**************************************
	 *     Timothy Shine                  * 
	 *     AP Lab 06 - Graphics Lab       * 
	 *     10/6/2015                      * 
	 *                                    *
	 **************************************/

	import java.awt.*;
	import java.applet.*;
	import java.util.*; 


	public class GraphicsLab extends Applet {
		
		public void init(){
			setSize(800,600);
		}
		
		public void paint(Graphics g) 	
		{
			// Draw Grid
			g.drawRect(10,10,780,580);
			g.drawLine(400,10,400,590);//Vertical Line
			g.drawLine(10,300,790,300); //Horizontal Line
				
			// Draw Random Lines
			for (int k = 0; k<100; k++){
				//Random Color
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				g.setColor(new Color(red,green,blue));
				
				//Random Lines
				int x1 = (int)(Math.random()*390 + 10);
				int y1 = (int)(Math.random()*290 + 10);
				int x2 = (int)(Math.random()*390 + 10);
				int y2 = (int)(Math.random()*290 + 10);
				g.drawLine(x1, y1, x2, y2); //Draw Random Lines
			}
			
			// Draw Random Squares
			for (int k = 0; k<100; k++){
				//Random Color
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				g.setColor(new Color(red,green,blue));
				
				//Random Squares
				int x1 = (int)(Math.random()*330 + 410);
				int y1 = (int)(Math.random()*230 + 20);
				g.fillRect(x1, y1, 50, 50);
			}
			
			// Draw Random Circles
			
			for (int k = 0; k<200; k++){
				//Random Color
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				g.setColor(new Color(red,green,blue));
				
				//Random Circles
				int width = (int)(Math.random()*200);				
				int x1 = (int)(Math.random()*390-width + 10);
				int y1 = (int)(Math.random()*280-width + 310);
				if(x1>10 && y1>310)
					g.drawOval(x1,y1,width,width);
			}
			
			// Draw 3-D Box
				//Red Square
				g.setColor(new Color(255,0,0));
				g.fillRect(600, 400, 100, 100);
				
				//Blue Triangle
				g.setColor(new Color(0,0,255));
				Polygon tri = new Polygon();
				tri.addPoint(700,400);
				tri.addPoint(650,400);
				tri.addPoint(650,350);
				g.fillPolygon(tri);
				
				//Green Parallelogram
				g.setColor(new Color(0,255,0));
				Polygon para = new Polygon();
				para.addPoint(600,400);
				para.addPoint(600,500);
				para.addPoint(550,450);
				para.addPoint(550,350);
				g.fillPolygon(para);
				
				//Yellow Trap
				g.setColor(new Color(255,243,17));
				Polygon trap = new Polygon();
				trap.addPoint(650,400);
				trap.addPoint(650,350);
				trap.addPoint(550,350);
				trap.addPoint(600,400);
				g.fillPolygon(trap);

		}	


	}

