import java.awt.*;  
import java.awt.event.*;  

class AWTExample1 extends Frame implements ActionListener{ 
	
	TextField tf;  
	
	AWTExample1(){  	  
		
		// and using the windowClosing() method of WindowAdapter class  
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });   
        
        
		//create components
		Label l = new Label("This is a label:");   
	    l.setBounds(60,30,170,20);    
		tf=new TextField();  
		tf.setBounds(60,50,170,20);  
		Button b=new Button("click me");  
		b.setBounds(100,120,80,30);  
		  
		//register listener  
		b.addActionListener(this);//passing current instance  
		  
		//add components and set size, layout and visibility  
		add(l);add(b);add(tf);  
		setSize(300,300);  
		setLayout(null);  
		setVisible(true);  
	}  
	
	public void actionPerformed(ActionEvent e){  
		tf.setText("You clicked the button");  
	}  
	
	public static void main(String args[]){  
		new AWTExample1();  
	}  
}  