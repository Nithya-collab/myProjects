



package CatchBoll;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.applet.AudioClip;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Demo extends Frame implements KeyListener { 
   int x = 80,y=650;   
   int i = 0 , j = 0 ,fast =  5;
   int k=0 , z=250 , w=100 , j1=0 , j2=0;
   int total=0 , high = 0 ;
   Label l , l1 , l2 , l3 , l4 , tittle;
   int color1 = 0 ,color2 = 0 ,color3 = 0 , sec = 0 , min = 0;
   Font f;
   Button b;
	public Demo()
	{

	    super("Tennis Game");
	    setSize(1000,1000);
	    setVisible(true);
	    setLayout(null);
	     
    
	    
	    f = new Font("MV BOLI",Font.CENTER_BASELINE,20);
	    

	    tittle = new Label("");
	    tittle.setBounds(350,50,280,30);
	    tittle.setBackground(Color.cyan);
	    tittle.setFont(new Font("arial",Font.BOLD,24));
	    
	    l = new Label("0");
	    l.setForeground(Color.black);
	    l.setBackground(Color.cyan);
	    l.setBounds(890,100,100,50);
	    l.setFont(f);
	    
	    l1 = new Label("Total");
	    l1.setForeground(Color.cyan);
	    l1.setFont(f);
	    l1.setBounds(890,150,100,50);
	    
	    l2 = new Label("0");
	    l2.setBounds(890,250,100,50);
	    l2.setBackground(Color.cyan);
	    l2.setFont(f);
	 
	    l3 = new Label("Time");
	    l3.setForeground(Color.cyan);
	    l3.setBounds(890,300,150,50);
	    l3.setFont(f);
	    
	    
	    l4= new Label(" ");
	    l4.setBounds(400,300,130,50);
	    l4.setBackground(Color.black);
	    l4.setFont(f);
	    l4.setForeground(Color.cyan);
	    
	    
	    l2.setText("0"+" Min");
	    
	    addKeyListener(this);
	    
	    setBackground(Color.black);
	    //setBackground(new Color(10,20,45));
	    
	    // Window Closing Code
	       addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent w) {System.exit(0);}});
	    
	    add(tittle) ;  
	       
	    add(l);
	    
	    add(l1);
	    
	    add(l2);
	    
	    add(l3);
	    
	    add(l4);
	    

	}
	    
	 int hour = 0 ;
	 
	public void paint(Graphics g)
	  {
		
		/*
		sec=sec+1;
	
		//l2.setText(String.valueOf(sec+"sec"));
		if(sec == 60)
		{
			min=min+1;
			
			l2.setText(String.valueOf(min+"min"));
		sec = 0;
		    
		 if(min == 60) {
			
			  hour=hour+1;
			l2.setText(String.valueOf(hour+"hour"));
			//min = 0;
			}
		 } */
		sec += 1;
	
		if(sec == 60) {
			min += 1;
			
			l2.setText(min+ " Min");
	 
		sec = 0;
		
	      if(min == 60) {
	    	  hour += 1;
	    	  
	    	  l2.setText(hour+" Hour");
	      }
			
		}
	
	
		 // min=0;
		  //sec=0;
		
		
		
		// up ---------------------
		g.setColor(Color.cyan);
		
		g.drawRect(70, 70,800, 5);
		g.fill3DRect(70, 70, 800,5,getFocusTraversalKeysEnabled());
		
		// left  |
	    g.drawRect(70, 70, 5, 635);
	    g.fill3DRect(70, 70, 5, 635,getFocusTraversalKeysEnabled());
	    
	    
	    //  right |
		g.drawRect(870, 70, 5, 635);
		g.fill3DRect(870, 70, 5, 635,getFocusTraversalKeysEnabled());

		// down ---------
		g.drawRect(70, 700, 800, 5);
		g.fill3DRect(70, 700, 800,5,getFocusTraversalKeysEnabled());

		g.drawRect(x, y, 80, 30);
		g.drawRect(x, y, 80, 30);
		g.setColor(Color.cyan);
		g.fill3DRect(x, y, 80, 30,getFocusTraversalKeysEnabled());
	
		
		// Ball  1
		g.drawOval(5,5,5,5);
	    g.setColor(new Color(color1+0,0+color2,0+color3));
		g.fillOval(90+k, 90+j, 25, 25);
		
		
		for(i = 0 ; i<= 20 ; i++)
		{
			 j++;
			 
			 
			 Random RedBall = new Random();  
			 
			 Random col1 = new Random();
			 
			 Random col2 = new Random();
			 
			 Random col3 = new Random();
			 
			 if(90+j == 700)
			 {
				 l4.setText("Game Over!!");
				 tittle.setText(" Press Any Key to Exit....");
				 j = 700;
			 }
			 
			 
			 if(90 + j == y && x + 120 > 90+k && x < 90+k) {
				 
				 total=total+1;
				// high = high+15;
				//String result1=String.valueOf(high);
				String result=String.valueOf(total);
				//l2.setText(result1);
				l.setText(result);
				
				if(total == 5) {
					l4.setText("Good....");
					
					fast = 3;
				}
				
	
				else if(total == 50) {
					
				   l4.setText(" Superb..");
				   if(fast > 0 )
				   fast = 2;
				   
				}
					  
				else if(total == 100) {
					l4.setText("Excellent**");
				    if(fast > 0)
				    	fast = 1;
				}
				else if(total == 250) {
					l4.setText("Hoo Hoo");
					fast = 5;
				}
				else if(total == 300) {
					l4.setText("High Score");
					fast = 0;
				}
			
				 else
					 l4.setText("    ");
				
				 for(int i = 100 ; i <= 150 ; i++)
				 {
					 k = RedBall.nextInt(750)+1;
				 }
				
				 
				    j = 0 ;
				
			
				    
			 }

		if(color1 < 255) {
			color1 = col1.nextInt(254)+1;}
		if(color2 < 255)
			color2 = col2.nextInt(254)+1;
		if(color3 < 255)
			color3 = col3.nextInt(254)+1;
		else
			color1 = color2 = color3 = 0;
       			 
		 
		repaint();
		

	     try 
	      {
		Thread.sleep(fast);
         }catch(Exception e){}
	    
	}
		
		  
		
}


		public void keyPressed(KeyEvent k)
		   {
			   int keyCode = k.getKeyCode();
               switch(keyCode) 
                       {
                                       
                           case KeyEvent.VK_LEFT:
                                              if(x>81)
                                                   x = x - 20;
                                             break;
                            case KeyEvent.VK_RIGHT :
                                         if(x < 770)     
                                             x = x + 20;
                                            break;
                            
                      }
             
               repaint();
               
              
		   }
		   public  void keyTyped(KeyEvent k)
           {
			   b = new Button("Exit");
			    b.setBounds(890,400,100,50);
			    b.setForeground(Color.cyan);
			    b.setFont(f);
			    b.setBackground(Color.black);
			    b.addActionListener(new ActionListener() {
			    	public void actionPerformed(ActionEvent e) {
			    		System.exit(0);
			    	}
			    });
			    
			    add(b);
			   
           }
        public  void keyReleased(KeyEvent k)
             {
        	
              	
             }
   
}
		
		
	//}}










public class Boll extends Frame{

	static String s;
	
	public static void main(String[] args)throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub
	//	Demo obj = new Demo();
		    Frame f = new Frame();
		    f.setSize(1000,1000);
		    f.setBackground(Color.BLACK);
		    f.setVisible(true);
		    f.setLayout(null);
		    
		    
		    f.addWindowListener(new WindowAdapter() {
		    	public void windowClosing(WindowEvent e) {
		    		System.exit(0);
		    	}
		    });
		    
		    Panel p = new Panel();
		    p.setBounds(250,200,500,500);
		    
		    p.setBackground(Color.CYAN);
		    p.setLayout(null);
		   
		    Font font = new Font("arial",Font.BOLD,23);
		    
		    Button b1 = new Button("Start");
			b1.setBounds(130,230,100,50);
		  //   b1.setBounds(300,350,100,40);
			b1.setForeground(Color.cyan);
			b1.setFont(font);
			b1.setBackground(Color.black);
			p.add(b1);
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				   s = e.getActionCommand();
				   if(s.equals("Start")) {
					  Demo obj = new Demo();
				   }
				}
			});
			
			Button b2 = new Button("Exit");
			//b2.setBounds(460,350,100,40);
            b2.setBounds(250,230,100,50);
			b2.setForeground(Color.cyan);
			b2.setFont(font);
			b2.setBackground(Color.black);
			p.add(b2);
			
			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					s = e.getActionCommand();
					if(s.equals("Exit")) {
						System.exit(0);
					}
				}
			});
		
		  f.add(p);
		Scanner scan = new Scanner(System.in);
	       File file = new File("gamemusic.wav");
	       
	       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
	       
	       Clip clip = AudioSystem.getClip();
	       
	       clip.open(audioStream);
	       
	       clip.start();
	      
	       String response = scan.next();
	    
	   
	    
		
	}

}
