import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MealPurchase extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private static JButton button1, button2, button3, button4;
	private static JLabel label;
	private static JFrame frame;

	public MealPurchase () {

		//Set FlowLayout, aligned left with horizontal gap 100 and vertical gap 20 between components
				setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
				int points = 65000;
				
				
				button1 = new JButton("Purchase Package A");
				button2 = new JButton("Purchase Package B");
				button3 = new JButton("Purchase Package C");
				button4 = new JButton("Purchase Package D");
		     
				// Add labels and buttons to the frame
				 frame = new JFrame("Meal Purchase");
			      label = new JLabel("Store");
			      label.setBounds(50, 50, 100, 30);
			      label.setFont(new Font("Bradley Hand ITC", Font.BOLD, 28));
			      label.setForeground(Color.BLACK);
			      frame.add(label);
			      frame.setSize(400,550);
			      frame.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
			      frame.setLocationRelativeTo(null);
			      frame.setVisible(true);
			     
			  	label = new JLabel ("Total Points - " +  points);
			  	 label.setBounds(50, 50, 100, 30);
			      label.setFont(new Font("TimesRoman", Font.PLAIN, 16));
			      label.setForeground(Color.BLACK);
			      frame.add(label);
			      
				label = new JLabel ("1 Meal = 10,000 points");
				 label.setBounds(50, 50, 100, 30);
			      label.setFont(new Font("TimesRoman", Font.PLAIN, 16));
			      label.setForeground(Color.BLACK);
			      frame.add(label);
			      
			      button1 = new JButton ("Purchase Package A");
			      frame.add(button1);
			      button1.addActionListener (this);
			      
			      label = new JLabel ("3 Meals = 25,000 points");
					 label.setBounds(50, 50, 100, 30);
				      label.setFont(new Font("TimesRoman", Font.PLAIN, 16));
				      label.setForeground(Color.BLACK);
				      frame.add(label);
				      
				      button2 = new JButton ("Purchase Package B");
				      frame.add(button2);
				      button2.addActionListener (this);
				      
				      label = new JLabel ("7 Meals = 50,000 points");
						 label.setBounds(50, 50, 100, 30);
					      label.setFont(new Font("TimesRoman", Font.PLAIN, 16));
					      label.setForeground(Color.BLACK);
					      frame.add(label);
					      
					      button3 = new JButton ("Purchase Package C");
					      frame.add(button3);
					      button3.addActionListener (this);
					      
					      label = new JLabel ("15 Meals = 100,000 points");
							 label.setBounds(50, 50, 100, 30);
						      label.setFont(new Font("TimesRoman", Font.PLAIN, 16));
						      label.setForeground(Color.BLACK);
						      frame.add(label);
						      
						      button4 = new JButton ("Purchase Package D");
						      frame.add(button4);
						      button4.addActionListener (this);
						      
						      label = new JLabel("Thank you for supporting us! Happy walking!");
						      label.setBounds(50, 50, 100, 30);
						      label.setFont(new Font("Bradley Hand ITC", Font.ITALIC + Font.BOLD, 14));						  
						      label.setBackground(Color.BLACK);
						      frame.add(label);
	}
	
	
	@Override
	   public void actionPerformed(ActionEvent ae) {
	        String action = ae.getActionCommand();
	        int points = 65000;
	        
	        // For Package A
	      if (action.equals("Purchase Package A")) {
	    	  int PointsRemaining = points- 10000;
	    	  if (points >=10000) {
	    	  JOptionPane.showMessageDialog(null, "Your purchase has been registered. \n You have just supplied one meal to someone in need! \n You now have " + PointsRemaining +  " points remaining.");
	    	  }
	    	  else {
	    		  JOptionPane.showMessageDialog(null, "You have insufficient points to make this purchase. \n Keep walking to earn more points!", null, JOptionPane.ERROR_MESSAGE);
	    	  }
	    	  System.exit(0);
	      }
	      
	      // For Package B
	        if (action.equals("Purchase Package B")) {
	        	int PointsRemaining = points - 25000;
	        	if (points >= 25000) {
	        	JOptionPane.showMessageDialog(null, "Your purchase has been registered. \n You have just supplied three meals to people in need! \n You now have " + PointsRemaining +  " points remaining.");
	        }
	        	  else {
	        		  JOptionPane.showMessageDialog(null, "You have insufficient points to make this purchase. \n Keep walking to earn more points!", null, JOptionPane.ERROR_MESSAGE);
		    	  }
	        	System.exit(0);
		      }
	        
	        	// For Package C
	        if (action.equals("Purchase Package C")) {
	        	int PointsRemaining = points - 50000;
	        	if (points >= 50000) {
	        	JOptionPane.showMessageDialog(null, "Your purchase has been registered. \n You have just supplied seven meals to people in need! \n You now have " + PointsRemaining +  " points remaining.");
	        }
	        	  else {
	        		  JOptionPane.showMessageDialog(null, "You have insufficient points to make this purchase. \n Keep walking to earn more points!", null, JOptionPane.ERROR_MESSAGE);
		    	  }
	        	System.exit(0);
		      }
	        
	        // For Package D
	         if (action.equals("Purchase Package D")) {
	        	 int PointsRemaining = points - 100000;
	        	 if (points >= 100000) {
	        	JOptionPane.showMessageDialog(null, "Your purchase has been registered. \n You have just supplied ten meals to people in need! \n You now have " + PointsRemaining +  " points remaining.");
	        } 
	        	  else {
	        		  JOptionPane.showMessageDialog(null, "You have insufficient points to make this purchase. \n Keep walking to earn more points!", null, JOptionPane.ERROR_MESSAGE);
		    	  }
	        	 System.exit(0);
		      }
	    }
	
	//* Main method/
			public static void main(String[] args) {
		
			MealPurchase frame = new MealPurchase ( );
			frame.setTitle("Meal Purchase");
		
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