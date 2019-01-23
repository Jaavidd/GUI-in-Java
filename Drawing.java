import java.awt.*;

import javax.swing.*;


public class Drawing extends  JFrame {
	
	
	public Drawing() {
 		
		    setTitle("Swing");
	        setSize(1200, 1500);
	         
	        
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setVisible(true);
	}

	
	public  double random(double min, double max)
	{
	    double number = (Math.random()*((max-min)+1))+min;
	    return number;
	}	
	
     public void circle(Graphics grap,Color color,String s,int x,int y,int w,int h)
     {
    	 grap.setColor(color);
    	 grap.fillOval(x, y, w, h);
    	 grap.setColor(Color.BLACK); 
         grap.drawString(s, x+25, y+30);
	     grap.create();
	 
	 
     }
	
     public void rect(int x,int y,int width,int height,Graphics graph,Color c){
         for(int i=1;i<=7;i++)
         {
          graph.setColor(c);
         graph.fillRect(x,y,width,height);
         x+=12;
         }
      }
	
	
	public void paint(Graphics g)
  {
	
	circle(g,Color.CYAN,"ST",70,200,70,50);                           //// DRAWING DOTS
	circle(g,Color.CYAN,"IT1",250,200,70,50);                            rect(150,220,3,3,g,Color.DARK_GRAY);
	circle(g,Color.CYAN,"IT2",430,200,70,50);                            rect(330,220,3,3,g,Color.DARK_GRAY);
 	circle(g,Color.CYAN,"IT3",610,200,70,50);                            rect(510,220,3,3,g,Color.DARK_GRAY);
 	circle(g,Color.CYAN,"WT",790,200,70,50);                             rect(690,220,3,3,g,Color.DARK_GRAY);
 	circle(g,new Color(255,215,91),"B1",159,300,70,50);
   	circle(g,new Color(255,215,91),"B2",339,300,70,50);
    circle(g,new Color(255,215,91),"B3",519,300,70,50);
    circle(g,new Color(255,215,91),"B4",719,300,70,50); 
		
     	
        
        g.setColor(Color.DARK_GRAY);	int [] x1 = {250,230,230};	int [] y1 = {220,210,230};  g.fillPolygon(x1,y1,3);
        g.setColor(Color.DARK_GRAY);	int [] x2 = {430,410,410};  int [] y2 = {220,210,230};  g.fillPolygon(x2,y2,3);
        g.setColor(Color.DARK_GRAY);	int [] x3 = {610,590,590};  int [] y3 = {220,210,230};  g.fillPolygon(x3,y3,3);
        g.setColor(Color.DARK_GRAY);	int [] x4 = {790,770,770};  int [] y4 = {220,210,230};  g.fillPolygon(x4,y4,3);

                
        
        g.setColor(Color.DARK_GRAY);	g.drawLine(130,250,170,300);
        g.setColor(Color.DARK_GRAY); 	g.drawLine(280,250,205,300);
        g.setColor(Color.DARK_GRAY);	g.drawLine(290,250,350,300);
        g.setColor(Color.DARK_GRAY);	g.drawLine(463,252,390,300);
        g.setColor(Color.DARK_GRAY);	g.drawLine(470,250,530,300);
        g.setColor(Color.DARK_GRAY);	g.drawLine(645,250,580,300);
        g.setColor(Color.DARK_GRAY);	g.drawLine(650,250,717,305);
        g.setColor(Color.DARK_GRAY);	g.drawLine(810,250,770,300);
        //////////////////////////////////////////////////////////////
        
        g.setColor(Color.DARK_GRAY);	int [] x5 = {173,170,163};	int [] y5 = {303,293,300};	g.fillPolygon(x5,y5,3);
        g.setColor(Color.DARK_GRAY);	int [] x7 = {353,350,343};	int [] y7 = {303,293,300};	g.fillPolygon(x7,y7,3);
        g.setColor(Color.DARK_GRAY);	int [] x6 = {533,530,523};	int [] y6 = {303,293,300};	g.fillPolygon(x6,y6,3);
        g.setColor(Color.DARK_GRAY);	int [] x8 = {723,720,713};	int [] y8 = {311,301,308};	g.fillPolygon(x8,y8,3);

        //////////////////////////////////////////////////////////////
        
        g.setColor(Color.DARK_GRAY);     int [] x9 = {282,279,272};	    int [] y9 = {248,258,251};	g.fillPolygon(x9,y9,3);
        g.setColor(Color.DARK_GRAY); 	  int [] x10 = {467,464,457};	int [] y10 = {248,258,251}; g.fillPolygon(x10,y10,3);
        g.setColor(Color.DARK_GRAY);	  int [] x11 = {648,645,638};	int [] y11 = {248,258,251};	g.fillPolygon(x11,y11,3);
        g.setColor(Color.DARK_GRAY);	  int [] x12 = {815,812,805};	int [] y12 = {245,255,248};	g.fillPolygon(x12,y12,3);

            
  
        		try {
        			
        			  g.setFont(new Font("J", Font.PLAIN, 50));
                      int space=40;
        			  for(int i=5;i>0;i--) 
                      {
                       String s="After 5 seconds will start:";
                       String in=""+i;
                       g.drawString(s,80,100);
                       g.drawString(in, 720+space, 100);
                       space+=40;
                       Thread.sleep(1000);
                      
                         
                      }
        			 
					 
        			
        			
        			Thread.sleep((long)random(0,2000));
        			 g.setFont(new Font("J", Font.PLAIN, 20));
        			circle(g,Color.GREEN,"ST",70,200,70,50);
        			g.setColor(Color.GREEN);
        			g.drawLine(130,250,170,300);
        			g.fillPolygon(x5,y5,3);
        			
        			
        			
        			Thread.sleep((long)random(0,2000));	
        			circle(g,Color.RED,"B1",159,300,70,50);
        			rect(150,220,3,3,g,Color.RED);
        			g.setColor(Color.RED);
        			g.fillPolygon(x1,y1,3);
        			
        			g.setColor(Color.BLACK);
        	     	circle(g,Color.RED,"IT1",250,200,70,50);
        			g.setFont(new Font("J",Font.PLAIN, 20));
                    g.drawString("IT1 is Waiting",120,370);
                    Thread.sleep((long)random(0,2000));
                    circle(g,Color.GREEN,"IT1",250,200,70,50);
                    g.setColor(Color.GREEN);
                    g.drawLine(280,250,205,300);
                    g.fillPolygon(x9,y9,3);
                	g.setColor(Color.BLACK); 
                    g.setFont(new Font("J", Font.PLAIN, 20));
                    g.drawString("IT1 received",120,390); 
        			
                    ////////////////////////////////
                    Thread.sleep((long)random(0,2000));
                    g.drawString("       ", 140, 370);
                    g.setColor(Color.GREEN);
                    g.drawLine(290,250,350,300);
                    g.fillPolygon(x7,y7,3);
                    Thread.sleep((long)random(0,2000));
                    circle(g,Color.RED,"B2",339,300,70,50);
                    rect(330,220,3,3,g,Color.RED);
        			g.setColor(Color.RED);
        			g.fillPolygon(x2,y2,3);
        			
        			g.setColor(Color.BLACK);
        			circle(g,Color.RED,"IT2",430,200,70,50);
                    g.setFont(new Font("J", Font.PLAIN, 20));
                    g.drawString("IT2 is Waiting",300,370);
                    Thread.sleep((long)random(0,2000));
                    circle(g,Color.GREEN,"IT2",430,200,70,50);
                    g.setColor(Color.GREEN);
                    g.drawLine(463,252,390,300);
                    g.fillPolygon(x10,y10,3);
                    
                	g.setColor(Color.BLACK); 
                    g.setFont(new Font("J", Font.PLAIN, 20));
                    g.drawString("IT2 received",300,390); 
                    
                  
/////////////////////////////////////////////////////////////////                    
                    Thread.sleep((long)random(0,2000));
                    
                     g.setColor(Color.GREEN);
                     g.drawLine(470,250,530,300);
                 	 g.fillPolygon(x6,y6,3);
                    
                 	Thread.sleep((long)random(0,2000));	
                     circle(g,Color.red,"B3",519,300,70,50);
                     rect(510,220,3,3,g,Color.RED);
         			  g.setColor(Color.RED);
         			  g.fillPolygon(x3,y3,3);
         			 circle(g,Color.RED,"IT3",610,200,70,50);
         			  g.setColor(Color.BLACK);
                      g.setFont(new Font("J", Font.PLAIN, 20));
                      g.drawString("IT3 is Waiting",480,370);
                   
                      Thread.sleep((long)random(0,2000));
                      circle(g,Color.GREEN,"IT3",610,200,70,50);
                      g.setColor(Color.GREEN);
                      g.drawLine(645,250,580,300);
                 	  g.fillPolygon(x11,y11,3);
                     
                 	  g.setColor(Color.BLACK); 
                      g.setFont(new Font("J", Font.PLAIN, 20));
                      g.drawString("IT3 received",480,390); 
                    
                    
                     
    /////////////////////////////////////////////////////////////////                 
                      Thread.sleep((long)random(0,2000));	 
                     
                     g.setColor(Color.GREEN);
                     g.drawLine(650,250,717,305);
                     g.fillPolygon(x8,y8,3); 
                     
                     Thread.sleep((long)random(0,2000));	
                      circle(g,Color.RED,"B4",719,300,70,50); 
                      rect(690,220,3,3,g,Color.RED);
         			  g.setColor(Color.RED);
         			  g.fillPolygon(x4,y4,3);
         			 circle(g,Color.RED,"WT",790,200,70,50);
         			  g.setColor(Color.BLACK);
                      g.setFont(new Font("Tahoma", Font.PLAIN, 20));
                      g.drawString("WT is Waiting",680,370);    
        		
                      Thread.sleep((long)random(0,2000));
                     circle(g,Color.GREEN,"WT",790,200,70,50);
                     g.setColor(Color.GREEN);
                	 g.drawLine(810,250,770,300);
                	 g.fillPolygon(x12,y12,3);
                    
                	 g.setColor(Color.BLACK); 
                     g.setFont(new Font("Tahoma", Font.PLAIN, 20));
                     g.drawString("WT received",680,390);
                    
                     g.drawString("MISSION IS COMPLETED",870,250);
                    
                     
              
                     g.drawString("After 15 seconds program will exit",80,600);
                       Thread.sleep(15000);
                    
       		} catch (InterruptedException ee) {
        		
        			ee.printStackTrace();
        		}
        	
  

     }
}
