import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RateUs extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private static JRadioButton OneButton, TwoButton, ThreeButton, FourButton, FiveButton;
	private static JPanel panel;
	private static JFrame rateusframe, frame;
	private static JLabel label, label1, label2;
	private static JButton button1, button2, button3;

	public RateUs () {
		
		Font font1 = new Font("Times New Roman", Font.BOLD, 14);
		
		panel = new JPanel();
		rateusframe = new JFrame("Rate Us");
		rateusframe.setSize(300,250);
		rateusframe.setLocationRelativeTo(null);
		rateusframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		rateusframe.add(panel);
		
		panel.setLayout(null);
		
		// Add labels to the frame
		label1 = new JLabel ("Enjoying our app?");
		label1.setBounds(10,10,200,50);
		label1.setFont(font1);
		panel.add(label1);
		
		label2 = new JLabel ("We could really use your feedback!");
		label2.setBounds(10,50,250,50);
		label2.setFont(font1);
		panel.add(label2);
		
		button1 = new JButton("Rate Us!");
		button1.setBounds(10,130,100,30);
		button1.addActionListener(this);
		panel.add(button1);

		button2 = new JButton("Not Now");
		button2.setBounds(120,130,100,30);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rateusframe.dispose();
				}
		});
		panel.add(button2);

		rateusframe.setVisible(true);
	
	}
	
	@Override
	   public void actionPerformed(ActionEvent ae) {
	        String action = ae.getActionCommand();
	        
	        if (action.equals ("Rate Us!")) {
	        	rateusframe.dispose();
        	          	  
        	   frame = new JFrame("Rate This App");
        	   label = new JLabel("How much would you rate us?");
        	   frame.add(label);
			      frame.setSize(230,200);
			      frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
			      frame.setLocationRelativeTo(null);
			      frame.setVisible(true);
			      
			  	button3 = new JButton("Submit");
			  	
			        OneButton = new JRadioButton("1");
				    OneButton.setActionCommand(toString());
				
				    TwoButton = new JRadioButton("2");
				    TwoButton.setActionCommand(toString());
				    
				    ThreeButton = new JRadioButton("3");
				    ThreeButton.setActionCommand(toString());
				    
				    FourButton = new JRadioButton("4");
				    FourButton.setActionCommand(toString());
				    
				    FiveButton = new JRadioButton("5");
				    FiveButton.setActionCommand(toString());
				    
				  //Group the radio buttons
					   frame.add(OneButton);
					   frame.add(TwoButton);
					   frame.add(ThreeButton);
					   frame.add(FourButton);
					  frame.add(FiveButton);
					    
					ButtonGroup A = new ButtonGroup();
					 A.add(OneButton);
					 A.add(TwoButton);
					 A.add(ThreeButton);
					 A.add(FourButton);
					 A.add(FiveButton);
			
					    // Register a listener for the radio buttons.
					    OneButton.addActionListener(this);
					    TwoButton.addActionListener(this);
					    ThreeButton.addActionListener(this);
					    FourButton.addActionListener(this);
					    FiveButton.addActionListener(this);
					  
					    add (button3);
						button3.addActionListener (this);
					    frame.add(button3);

           }
        
		if (action.equals("Submit")) {
			
			 if (OneButton.isSelected()|| (TwoButton.isSelected()) || (ThreeButton.isSelected()) || (FourButton.isSelected())|| (FiveButton.isSelected())){
       	JOptionPane.showMessageDialog(null,"Your feedback is appreciated. Happy walking!");
       	   frame.dispose();
			    }
			 
		else {
			JOptionPane.showMessageDialog(null,"Please select a button to rate us", null, JOptionPane.ERROR_MESSAGE);
		}
		}		    
           
	}
	
	//* Main method/
			public static void main(String[] args) {

			RateUs frame = new RateUs ( );
			frame.setTitle("AppRating");


			}
			public static void main1(String[] args) {
				 
				//creating and showing this application's GUI.

				javax.swing.SwingUtilities.invokeLater(new Runnable() {

				public void run() {

				createAndShowGUI(); 

				}

				private void createAndShowGUI() {
					// TODO Auto-generated method stub
					
				}

				});
				}

				}