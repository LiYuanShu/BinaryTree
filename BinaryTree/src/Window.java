
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Window extends JFrame implements ActionListener,Runnable
{
	JLabel lable,lable1;
	JButton button1,button2,button3,generateTree;
	static JTextField text1,text2,text3,text4;
	Show show;
	Tree r=new Tree();
	Node n;
	 public Window()
	 {}
	public Window(String title)
	{
		init();
		setVisible(true);
		setExtendedState(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		setBounds(100,100,1000,800);
		Thread th=new Thread(this);
		 th.start();
	}
	
	private void init() 
	{
		// TODO 自动生成的方法存根
		lable1=new JLabel(str11);
		setLayout(null);
		lable=new JLabel("请输入二叉树");
		button1=new JButton("前序遍历");
		button2=new JButton("中序遍历");
		button3=new JButton("后序遍历");
		generateTree=new JButton("二叉树图形");
		text1=new JTextField(20);
		text1.setEditable(true);
		text2=new JTextField(20);
		text2.setEditable(false);
		text3=new JTextField(20);
		text3.setEditable(false);
		text4=new JTextField(20);
		text4.setEditable(false);
		add(lable);
		lable.setBounds(300, 20, 80, 30);
		add(text1);
		text1.setBounds(400, 20, 200, 30);
		add(button1);
		button1.setBounds(300, 60, 90, 30);
		add(text2);
		text2.setBounds(400, 60, 200, 30);
		add(button2);
		button2.setBounds(300, 100, 90, 30);
		add(text3);
		text3.setBounds(400, 100, 200, 30);
		add(button3);
		button3.setBounds(300, 140, 90, 30);
		add(text4);
		text4.setBounds(400, 140, 200, 30);
		add(generateTree);
		generateTree.setBounds(400, 200, 100, 30);
		add(lable1);
		lable1.setBounds(380, 250, 250, 30);
		generateTree.addActionListener(this);
		text1.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		// TODO 自动生成的方法存根
		
		String str=text1.getText();
		n=r.creatTree(str);
		String preorder=r.preorder(n);
		String sequence=r.sequence(n);
		String epilogue=r.epilogue(n);
		if(e.getSource()==generateTree)
		{
			show=new Show(text1.getText());
			add(show);
			show.setBounds(0, 200, 800, 800);
		}
		if(e.getSource()==button1)
		{
			text2.setText(preorder);
			
		}
		if(e.getSource()==button2)
		{
			text3.setText(sequence);	
		}
		if(e.getSource()==button3)
		{
			text4.setText(epilogue);	
		}
	}
	public String tree()
	 {
		if(text1.getText()==null)
			return tree();
		else
		 return text1.getText();
	 }
	
		Calendar calendar=Calendar.getInstance();
		int year=calendar.get(Calendar.YEAR),
				month=calendar.get(Calendar.MONTH)+1,
				day=calendar.get(Calendar.DAY_OF_MONTH);
        String str11=String.valueOf(year)+"年"+String.valueOf(month)+"月"+String.valueOf(day)+"日";
        SimpleDateFormat m=new  SimpleDateFormat("hh.mm.ss");
        Date date;
		public void run() 
		{
			while(true)
			{
				
				date=new Date();
				lable1.setText(str11+"     "+m.format(date));	
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException ee){}
			}
		}	
}
