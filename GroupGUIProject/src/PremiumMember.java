import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PremiumMember extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private static JLabel fullname, bankname, pinnumber, expirydate;
	private static JTextField fullnamefield, banknamefield, pinnumberfield;
	private static JButton button1, button2, button3, button4, button5;
	private static JLabel label, label2;
	private static JFrame frame, frame2;
	private static JComboBox<Object> comboboxMonth, comboboxYear;
	

	public PremiumMember () {
		
		//Set FlowLayout, aligned left with horizontal gap 50 and vertical gap 20 between components
				setLayout(new FlowLayout(FlowLayout.CENTER, 50, 20));
				
				 button1 = new JButton("Upgrade Today!");
				 button2 = new JButton("No Thanks");
				
		     
				// Add labels and buttons to the frame
				frame = new JFrame ("Premium Membership");
			      label = new JLabel("UPGRADE YOUR MEMBERSHIP!");
			      label.setBounds(50, 50, 100, 30);
			      label.setFont(new Font("TimesRoman", Font.BOLD, 20));
			      frame.add(label);
			      frame.setSize(400,585);
			      frame.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 20));
			      frame.setLocationRelativeTo(null);
			      frame.setVisible(true);
			      
			  	label = new JLabel ("WHY GO PREMIUM?");
			  	 label.setBounds(50, 50, 100, 30);
			      label.setFont(new Font("TimesRoman", Font.BOLD + Font.ITALIC, 17 ));
			      frame.add(label);
			      
			      label = new JLabel ("Be part of a community!");
				  	 label.setBounds(50, 50, 100, 30);
				  	label.setFont(new Font("TimesRoman", Font.ITALIC + Font.BOLD, 17 ));
				      label.setOpaque(true);
				      label.setForeground(Color.WHITE);
				      label.setBackground(Color.BLACK);
				      frame.add(label);
				      
				      label = new JLabel ("-Gain access to special fitness events");
					  	 label.setBounds(50, 50, 100, 30);
					      label.setFont(new Font("TimesRoman", Font.PLAIN, 13 ));
					      frame.add(label);
					      
					      label = new JLabel ("Make a bigger difference!");
						  	 label.setBounds(50, 50, 100, 30);
						  	label.setFont(new Font("TimesRoman", Font.ITALIC + Font.BOLD, 17 ));
						      label.setOpaque(true);
						      label.setForeground(Color.WHITE);
						      label.setBackground(Color.BLACK);
						      frame.add(label);
				      
					      label = new JLabel ("-Stand the chance to double your points");
						  	 label.setBounds(50, 50, 100, 30);
						      label.setFont(new Font("TimesRoman", Font.PLAIN, 13 ));
						      frame.add(label);
						      
						      label = new JLabel ("Need a cheat day?");
							  	 label.setBounds(50, 50, 100, 30);
							  	label.setFont(new Font("TimesRoman", Font.ITALIC + Font.BOLD, 17 ));
							      label.setOpaque(true);
							      label.setForeground(Color.WHITE);
							      label.setBackground(Color.BLACK);
							      frame.add(label);
							      
							      label = new JLabel ("-No minimum steps needed per day to protect your points");
								  	 label.setBounds(50, 50, 100, 30);
								      label.setFont(new Font("TimesRoman", Font.PLAIN, 13 ));
								      frame.add(label);
								      
								      label = new JLabel ("Tired of ads?");
									  	 label.setBounds(50, 50, 100, 30);
									  	label.setFont(new Font("TimesRoman", Font.ITALIC + Font.BOLD, 17 ));
									      label.setOpaque(true);
									      label.setForeground(Color.WHITE);
									      label.setBackground(Color.BLACK);
									      frame.add(label);
									      
									      label = new JLabel ("-With premium membership, you can choose to disable ads");
										  	 label.setBounds(50, 50, 100, 30);
										      label.setFont(new Font("TimesRoman", Font.PLAIN, 13 ));
										      frame.add(label);
										      
										      label = new JLabel ("Reap the benefits now!");
											  	 label.setBounds(50, 50, 100, 30);
											      label.setFont(new Font("TimesRoman", Font.BOLD, 15 ));
											      frame.add(label);
											      
											      label = new JLabel ("For only RM 5 a month!");
												  	 label.setBounds(50, 50, 100, 30);
												      label.setFont(new Font("TimesRoman", Font.BOLD, 15 ));
												      frame.add(label);
			      
				
			      button1 = new JButton ("Upgrade Today!");
			      frame.add(button1);
			      button1.addActionListener (this);
			      
			     
				      button2 = new JButton ("No Thanks");
				      frame.add(button2);
				      button2.addActionListener (this);
				      
				      
	}
	


	@Override
	   public void actionPerformed(ActionEvent ae) {
	        String action = ae.getActionCommand();
	        
	        // For No Thanks
			if (action.equals("No Thanks")) {
	        	frame.dispose();
	        }
	        
	        // For Upgrade Today
			else if (action.equals("Upgrade Today!")) {
	    	 
	    	  button3 = new JButton("Submit");
	    	  

	    		 frame = new JFrame ("Payment Details");
	    	      label = new JLabel("To proceed, please enter your credit card details.");
	    	      label.setBounds(50, 50, 100, 30);
	    	      label.setFont(new Font("Times Roman", Font.BOLD, 16));
	    	      label.setOpaque(true);
			      label.setForeground(Color.WHITE);
			      label.setBackground(Color.PINK);
	    	      frame.add(label);
	    	      frame.setSize(400,300);
	    	      frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
	    	      frame.setLocationRelativeTo(null);
	    	      frame.setVisible(true);
	    	      
	    	 
	    	        //create empty JTextField
	    	      fullname = (new JLabel("Full Name:  "));
	    	        frame.add(fullname);
	    	        fullname.setFont(new Font("CenturyGothic", Font.PLAIN, 16));
	    	        fullname.setOpaque(true);
	    	        fullnamefield = new JTextField(16);
	    	        frame.add(fullnamefield);
	    	        
	    	        bankname = (new JLabel("Bank Name:"));
	    	        frame.add(bankname);
	    	        bankname.setFont(new Font("CenturyGothic", Font.PLAIN, 16));
	    	        bankname.setOpaque(true);
	    	        banknamefield = new JTextField(16);
	    	        frame.add(banknamefield);
	    	        
	    	        pinnumber = (new JLabel("Pin Number:"));
	    	        frame.add(pinnumber);
	    	        pinnumber.setFont(new Font("CenturyGothic", Font.PLAIN, 16));
	    	        pinnumber.setOpaque(true);
	    	        label.setFont(new Font("CenturyGothic", Font.PLAIN, 16));
	    	        pinnumberfield = new JTextField(16);
	    	        frame.add(pinnumberfield);
	    	        
	    	        expirydate = (new JLabel("Expiry date:"));
	    	        frame.add(expirydate);
	    	        expirydate.setFont(new Font("CenturyGothic", Font.PLAIN, 16));
	    	        expirydate.setOpaque(true);
	    	        label.setFont(new Font("CenturyGothic", Font.PLAIN, 16));
	    	        
	    	        comboboxMonth = new JComboBox<Object> ();
	    	        comboboxMonth.addItem("January");
	    	        comboboxMonth.addItem("February");
	    	        comboboxMonth.addItem("March");
	    	        comboboxMonth.addItem("April");
	    	        comboboxMonth.addItem("May");
	    	        comboboxMonth.addItem("June");
	    	        comboboxMonth.addItem("July");
	    	        comboboxMonth.addItem("August");
	    	        comboboxMonth.addItem("September");
	    	        comboboxMonth.addItem("October");
	    	        comboboxMonth.addItem("November");
	    	        comboboxMonth.addItem("December");
	    	        comboboxMonth.addActionListener (this);
	    	        frame.add(comboboxMonth);
	    	        
	    	        comboboxYear = new JComboBox<Object> ();
	    	        comboboxYear.addItem ("2020");
	    	        comboboxYear.addItem ("2021");
	    	        comboboxYear.addItem ("2022");
	    	        comboboxYear.addItem ("2023");
	    	        comboboxYear.addItem ("2024");
	    	        comboboxYear.addItem ("2025");
	    	        comboboxYear.addItem ("2026");
	    	        comboboxYear.addItem ("2027");
	    	        comboboxYear.addItem ("2028");
	    	        comboboxYear.addItem ("2029");
	    	        comboboxYear.addItem ("2030");
	    	        comboboxYear.addActionListener (this);
	    	        frame.add(comboboxYear);

	    	        button3 = new JButton ("Submit");
	    		      frame.add(button3);
	    		      button3.addActionListener (this);
	    		      
	      }
	
				String fullname = fullnamefield.getText();
				String bankname = banknamefield.getText();
				String pinnumber = pinnumberfield.getText();
				String selectedMonth = (String) comboboxMonth.getSelectedItem();
				String selectedYear = (String) comboboxYear.getSelectedItem();
				
				
				if (action.equals ("Submit")) {
					
					// For incorrect credentials
					 if (! fullname.contentEquals("Admin") || ! bankname.contentEquals("Maybank") || ! pinnumber.contentEquals("123456") ||  ! selectedMonth.contentEquals("November") || ! selectedYear.contentEquals ("2022")){
						JOptionPane.showMessageDialog(null, "Purchase Failed, Incorrect Credit Card Details", null, JOptionPane.ERROR_MESSAGE);
						}
					 
					// For correct credentials
					 else if (fullname.contentEquals("Admin") && bankname.contentEquals("Maybank") && pinnumber.contentEquals("123456") && selectedMonth.contentEquals("November") && selectedYear.contentEquals ("2022")){
					 button4 = new JButton("Confirm");
						button5 = new JButton("Cancel");
			  	  

			 	   frame2 = new JFrame("Confirmation");
			 	   label2 = new JLabel("Confirm this purchase?");
			 	   frame2.add(label2);
					      frame2.setSize(230,150);
					      frame2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
					      frame2.setLocationRelativeTo(null);
					      frame2.setVisible(true);
					      
					      button4 = new JButton ("Confirm");
					      frame2.add(button4);
					      button4.addActionListener (this);
					      
					     
						     button5 = new JButton ("Cancel");
						      frame2.add(button5);
						      button5.addActionListener (this);
						      
			     }
				}
						      
						     if (action.equals("Confirm")) {
						    		JOptionPane.showMessageDialog(null,"Congratulations! You are now a premium member.");
						    		System.exit(0);
						      }
						      
						     else if (action.equals("Cancel")) {
						    	 frame2.dispose();
						     }
						      
	}
	

	
	//* Main method/
			public static void main(String[] args) {
		
			PremiumMember frame = new PremiumMember ( );
			frame.setTitle("Premium Membership");
		
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