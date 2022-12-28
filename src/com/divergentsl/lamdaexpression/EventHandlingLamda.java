package com.divergentsl.lamdaexpression;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class EventHandlingLamda
{  
   public static void main(String[] args)
   {  

	    JFrame frame=new JFrame("Lamda Example With Event"); 
	    JTextField textField=new JTextField();
	    JButton button=new JButton("Click Me");  
	    
	    textField.setBounds(90,90, 250,20);   
	    button.setBounds(120,150,150,50);  
	    
	    frame.add(textField);
	    frame.add(button);  
	    frame.setSize(400,400);  
	    frame.setLayout(null);  
	    frame.setVisible(true);   
	  
	    
//	    button.addActionListener(new ActionListener(){  
//	    	public void actionPerformed(ActionEvent e){  
//	    	            textField.setText("Done");  
//	    	        }  
//	    	    });
	    
	    button.addActionListener( (e)->textField.setText("Done By Lamda Expression") );  
  }  
}  