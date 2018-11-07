import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
 class Show extends JPanel 
	{
	 String ss1;
	 public Show(String str)
	 {
		 ss1=str;
	 }
	 	int x=450;
	 	int y=100;
	 	int y1=180;
	 	int y2=240;
	 	int y3=300;
	 	int y4=360;
	 	int redio=30;
		 public void paint(Graphics g)
		 {
			 super.paint(g);
			 for(int i=0;i<ss1.length();i++)
			 {
				 if(i==0)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y+20);
						 if(i*2+1<ss1.length()&&ss1.charAt(i*2+1)!='#')
						 {
							 g.drawLine(x+15, y+30,x-150, y+80);
						 }
						 if(i*2+2<ss1.length()&&ss1.charAt(i*2+2)!='#')
						 {
							 g.drawLine(x+15, y+30,x+190, y+80);
						 }
					 }
					 x=x-170;
				 }
				 if(i==1)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y1, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y1+20);
						 if(i*2+1<ss1.length()&&ss1.charAt(i*2+1)!='#')
						 {
							 g.drawLine(x+15, y1+30,x-70, y1+60);
						 }
						 if(i*2+2<ss1.length()&&ss1.charAt(i*2+2)!='#')
						 { 
							 g.drawLine(x+15, y1+30,x+100, y1+60);
						 }
					 }
					 x=x+340;
				 }
				 if(i==2)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y1, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y1+20);
						 if(i*2+1<ss1.length()&&ss1.charAt(i*2+1)!='#')
						 {
							 g.drawLine(x+15, y1+30,x-70, y1+60);
						 }
						 if(i*2+2<ss1.length()&&ss1.charAt(i*2+2)!='#')
						 { 
							 g.drawLine(x+15, y1+30,x+100, y1+60);
						 }
				 }
					 x=x-430;
				 }
				 if(i==3)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y2, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y2+20);
						 if(i*2+1<ss1.length()&&ss1.charAt(i*2+1)!='#')
						 {
							 g.drawLine(x+15, y2+30,x-30, y2+60);
						 }
						 if(i*2+2<ss1.length()&&ss1.charAt(i*2+2)!='#')
						 {
							 g.drawLine(x+15, y2+30,x+60, y2+60);
						 }
					 }
					 x=x+170;
				 }
				 if(i==4)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y2, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y2+20);
						 if(i*2+1<ss1.length()&&ss1.charAt(i*2+1)!='#')
						 {
							 g.drawLine(x+15, y2+30,x-30, y2+60);
						 }
						 if(i*2+2<ss1.length()&&ss1.charAt(i*2+2)!='#')
						 {
							 g.drawLine(x+15, y2+30,x+60, y2+60);
						 }
					 }
					 x=x+170;
				 }
				 if(i==5)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y2, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y2+20);
						 if(i*2+1<ss1.length()&&ss1.charAt(i*2+1)!='#')
						 {
							 g.drawLine(x+15, y2+30,x-30, y2+60);
						 }
						 if(i*2+2<ss1.length()&&ss1.charAt(i*2+2)!='#')
						 {
							 g.drawLine(x+15, y2+30,x+60, y2+60);
						 }
					 }
					 x=x+170;
				 } 
				 if(i==6)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y2, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y2+20);
						 if(i*2+1<ss1.length()&&ss1.charAt(i*2+1)!='#')
						 {
							 g.drawLine(x+15, y2+30,x-30, y2+60);
						 }
						 if(i*2+2<ss1.length()&&ss1.charAt(i*2+2)!='#')
						 {
							 g.drawLine(x+15, y2+30,x+60, y2+60);
						 }
					 }
					 x=x-560;
				 }
				 if(i==7)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y3, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y3+20);
						 if(i*2+1<ss1.length()&&ss1.charAt(i*2+1)!='#')
						 {
							 g.drawLine(x+15, y3+30,x-10, y3+60);
						 }
						 if(i*2+2<ss1.length()&&ss1.charAt(i*2+2)!='#')
						 {
							 g.drawLine(x+15, y3+30,x+35, y3+60);
						 }
					 }
					 x=x+90;
				 }
				 if(i==8)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y3, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y3+20);
						 if(i*2+1<ss1.length()&&ss1.charAt(i*2+1)!='#')
						 {
							 g.drawLine(x+15, y3+30,x-10, y3+60);
						 }
						 if(i*2+2<ss1.length()&&ss1.charAt(i*2+2)!='#')
						 {
							 g.drawLine(x+15, y3+30,x+35, y3+60);
						 }
					 }
					 x=x+90;
				 }
				 if(i==9)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y3, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y3+20);
						 if(i*2+1<ss1.length()&&ss1.charAt(i*2+1)!='#')
						 {
							 g.drawLine(x+15, y3+30,x-10, y3+60);
						 }
						 if(i*2+2<ss1.length()&&ss1.charAt(i*2+2)!='#')
						 {
							 g.drawLine(x+15, y3+30,x+35, y3+60);
						 }
					 }
					 x=x+90;
				 }
				 if(i==10)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y3, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y3+20);
						 if(i*2+1<ss1.length()&&ss1.charAt(i*2+1)!='#')
						 {
							 g.drawLine(x+15, y3+30,x-10, y3+60);
						 }
						 if(i*2+2<ss1.length()&&ss1.charAt(i*2+2)!='#')
						 {
							 g.drawLine(x+15, y3+30,x+35, y3+60);
						 }
					 }
					 x=x+80;
				 }
				 if(i==11)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y3, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y3+20);
						 if(i*2+1<ss1.length()&&ss1.charAt(i*2+1)!='#')
						 {
							 g.drawLine(x+15, y3+30,x-10, y3+60);
						 }
						 if(i*2+2<ss1.length()&&ss1.charAt(i*2+1)!='#')
						 {
							 g.drawLine(x+15, y3+30,x+35, y3+60);
						 }
					 }
					 x=x+80;
				 }
				 if(i==12)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y3, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y3+20);
						 if(i*2+1<ss1.length()&&ss1.charAt(i*2+1)!='#')
						 {
							 g.drawLine(x+15, y3+30,x-10, y3+60);
						 }
						 if(i*2+2<ss1.length()&&ss1.charAt(i*2+1)!='#')
						 {
							 g.drawLine(x+15, y3+30,x+35, y3+60);
						 }
					 }
					 x=x+80;
				 }
				 if(i==13)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y3, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y3+20);
						 if(i*2+1<ss1.length()&&ss1.charAt(i*2+1)!='#')
						 {
							 g.drawLine(x+15, y3+30,x-10, y3+60);
						 }
						 if(i*2+2<ss1.length()&&ss1.charAt(i*2+1)!='#')
						 {
							 g.drawLine(x+15, y3+30,x+35, y3+60);
						 }
					 }
					 x=x+100;
				 }
				 if(i==14)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y3, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y3+20);
						 if(i*2+1<ss1.length()&&ss1.charAt(i*2+1)!='#')
						 {
							 g.drawLine(x+15, y3+30,x-10, y3+60);
						 }
						 if(i*2+2<ss1.length()&&ss1.charAt(i*2+1)!='#')
						 {
							 g.drawLine(x+15, y3+30,x+35, y3+60);
						 }
					 }
					 x=x-635;
				 }
				 if(i==15)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y4, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y4+20);
					 }
					 x=x+50;
				 }
				 if(i==16)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y4, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y4+20);
					 }
					 x=x+45;
				 }
				 if(i==17)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y4, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y4+20);
					 }
					 x=x+45;
				 }
				 if(i==18)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y4, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y4+20);
					 }
					 x=x+40;
				 }
				 if(i==19)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y4, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y4+20);
					 }
					 x=x+45;
				 }
				 if(i==20)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y4, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y4+20);
					 }
					 x=x+50;
				 }
				 if(i==21)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y4, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y4+20);
					 }
					 x=x+45;
				 }
				 if(i==22)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y4, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y4+20);
					 }
					 x=x+30;
				 }
				 if(i==23)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y4, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y4+20);
					 }
					 x=x+45;
				 }
				 if(i==24)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y4, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y4+20);
					 }
					x=x+30;
				 }
				 if(i==25)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y4, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y4+20);
					 }
					 x=x+50;
				 }
				 if(i==26)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y4, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y4+20);
					 }
					 x=x+30;
				 }
				 if(i==27)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y4, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y4+20);
					 }
					 x=x+45;
				 }
				 if(i==28)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y4, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y4+20);
					 }
					 x=x+55;
				 }
				 if(i==29)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y4, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y4+20);
					 }
					 x=x+55;
				 }
				 if(i==30)
				 {
					 if(ss1.charAt(i)!='#')
					 {
						 g.drawOval(x, y4, redio, redio);
						 g.drawString(String.valueOf(ss1.charAt(i)), x+10, y4+20);
					 }
					 x=x+45;
				 }
				 if(i>30)
					 g.drawString("无法显示更多树节点", 500, 500);
			 }
		 }
	}

