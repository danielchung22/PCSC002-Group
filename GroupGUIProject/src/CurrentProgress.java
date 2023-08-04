import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CurrentProgress extends JFrame
								implements ActionListener,
											PropertyChangeListener {

	private static final long serialVersionUID = 1L;
	
	int stepstoday=15000, stepsleftminreq=0, stepstakenperiod=65000, daysleft=4;
	int amountofsteps;
	
	private static JFrame frame;
	private static JLabel label1, stepstaken, stepstaken2, stepsleft, stepsleft2, totalsteps, totalsteps2, totalpoints, totalpoints2, days, days2, tip;

	public CurrentProgress () {

		//Set FlowLayout, aligned left with horizontal gap 100 and vertical gap 20 between components
				setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
				 
				frame = new JFrame("Current Progress");
				frame.setSize(400,550);
			      frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 40));
			      frame.setLocationRelativeTo(null);
			      frame.setVisible(true);
				
				label1 = new JLabel ("Progress for this current period");
				 label1.setBounds(50, 50, 100, 30);
				  	label1.setFont(new Font("TimesRoman", Font.BOLD, 25 ));
				      label1.setOpaque(true);
				      label1.setForeground(Color.BLACK);
				      frame.add(label1);

				stepstaken = (new JLabel ("Steps Taken Today "));
				stepstaken.setBounds(50, 50, 100, 30);
				stepstaken.setFont(new Font("Andalus", Font.ITALIC, 17 ));
				stepstaken.setOpaque(true);
				stepstaken.setForeground(Color.WHITE);
				stepstaken.setBackground(Color.PINK);
				      frame.add(stepstaken);
				      
				      stepstaken2= new JLabel (""+ stepstoday + "steps");
				  	stepstaken2.setBounds(50, 50, 100, 30);
					stepstaken2.setFont(new Font("Bookman Old Style", Font.ITALIC, 15 ));
					stepstaken2.setOpaque(true);
					stepstaken2.setForeground(Color.BLACK);
					      frame.add(stepstaken2);
					      
					  	stepsleft = (new JLabel ("Steps Left to meet daily minimum requirement - "));
					  	stepsleft.setBounds(50, 50, 100, 30);
					  	stepsleft.setFont(new Font("Andalus", Font.ITALIC, 15 ));
					  	stepsleft.setOpaque(true);
					  	stepsleft.setForeground(Color.WHITE);
					  	stepsleft.setBackground(Color.PINK);
						      frame.add(stepsleft);
						      
						      stepsleft2= new JLabel (""+ stepsleftminreq + "steps");
							  	stepsleft2.setBounds(50, 50, 100, 30);
								stepsleft2.setFont(new Font("Bookman Old Style", Font.ITALIC, 15 ));
								stepsleft2.setOpaque(true);
								stepsleft2.setForeground(Color.BLACK);
								      frame.add(stepsleft2);
						      
								      totalsteps= (new JLabel ("Total Steps Taken (Period) - "));
								      totalsteps.setBounds(50, 50, 100, 30);
								      totalsteps.setFont(new Font("Andalus", Font.ITALIC, 17 ));
								      totalsteps.setOpaque(true);
								      totalsteps.setForeground(Color.WHITE);
								      totalsteps.setBackground(Color.PINK);
						              frame.add(totalsteps);
						            
						           totalsteps2= new JLabel (""+ stepstakenperiod + "steps");
						           totalsteps2.setBounds(50, 50, 100, 30);
						           totalsteps2.setFont(new Font("Bookman Old Style", Font.ITALIC, 15 ));
						           totalsteps2.setOpaque(true);
						           totalsteps2.setForeground(Color.BLACK);
									      frame.add(totalsteps2);
						      
									      totalpoints= (new JLabel ("Total Available Points - "));
									      totalpoints.setBounds(50, 50, 100, 30);
									      totalpoints.setFont(new Font("Andalus", Font.ITALIC, 17 ));
									      totalpoints.setOpaque(true);
									      totalpoints.setForeground(Color.WHITE);
									      totalpoints.setBackground(Color.PINK);
					                      frame.add(totalpoints);
					                      
					                      totalpoints2= new JLabel (""+ stepstakenperiod + "steps");
					                      totalpoints2.setBounds(50, 50, 100, 30);
					                      totalpoints2.setFont(new Font("Bookman Old Style", Font.ITALIC, 15 ));
					                      totalpoints2.setOpaque(true);
					                      totalpoints2.setForeground(Color.BLACK);
											      frame.add(totalpoints2);
					      
						days= (new JLabel ("Days remaining in this period - "));
						days.setBounds(50, 50, 100, 30);
						days.setFont(new Font("Andalus", Font.ITALIC, 17 ));
						days.setOpaque(true);
						days.setForeground(Color.WHITE);
						days.setBackground(Color.PINK);
						      frame.add(days);
						      
						      days2= new JLabel (""+ daysleft + "days");
						      days2.setBounds(50, 50, 100, 30);
						      days2.setFont(new Font("Bookman Old Style", Font.ITALIC, 15 ));
						      days2.setOpaque(true);
						      days2.setForeground(Color.BLACK);
								      frame.add(days2);
						      
						     tip= (new JLabel ("You're doing a great job! Keep going!"));
						     tip.setFont(new Font("Comic Sans MS", Font.ITALIC, 12 ));
						     tip.setOpaque(true);
						     tip.setForeground(Color.BLACK);
						      frame.add(tip);
				      
				      
			
	}
	
	//* Main method/
			public static void main(String[] args) {
		
			CurrentProgress frame = new CurrentProgress ( );
			frame.setTitle("Progress");
		
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

@Override
public void propertyChange(PropertyChangeEvent evt) {
	// TODO Auto-generated method stub
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}