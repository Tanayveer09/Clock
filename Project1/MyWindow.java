package Project1;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyWindow extends JFrame {
	private JLabel heading;
	private JLabel ClockLabel;
	private Font font=new Font("", Font.BOLD, 35);
	
	
	public MyWindow() {
		super.setTitle("My Clock");
		super.setSize(400,400);
		super.setLocation(300, 50);
		
		this.Create_GUI();
		this.startClock();
		
		super.setVisible(true);
	}
	
	public void Create_GUI() {
		heading = new JLabel("My clock");
		ClockLabel=new JLabel("Clock");
		
		heading.setFont(font);
		ClockLabel.setFont(font);
		
		this.setLayout(new GridLayout(2,1));
		
		this.add(heading);
		this.add(ClockLabel);
	}
	
	public void startClock() {
		javax.swing.Timer timer =new javax.swing.Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Date d=new Date();
				SimpleDateFormat sdf=new SimpleDateFormat("E hh:mm:ss a y");
				String dateTime=sdf.format(d);
				ClockLabel.setText(dateTime);
				
			}
		});
		timer.start();
		
	}

}
