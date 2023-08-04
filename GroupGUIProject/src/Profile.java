import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Profile extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private static JPanel panel;
	private static JFrame frame;
	private static JLabel pagetitle;
	private static JLabel namelabel, countrylabel, agelabel, heightlabel, weightlabel;
	private static JLabel namedisplay, countrydisplay, agedisplay, heightdisplay, weightdisplay;
	private static JButton home;
	private static String name = "Jonathan Wong";
	private static String country = "Malaysia";
	private static int age = 22, height = 185, weight = 50;
	
	public Profile() {
	
	//Setting the fonts for the labels
	Font font1 = new Font ("Cambria", Font.BOLD, 12);
	Font font2 = new Font ("Times New Roman", Font.PLAIN, 12);
	
	//Add panels and frame for display
	panel = new JPanel();
	frame = new JFrame("User Profile");
	frame.setSize(350,500);
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	
	frame.add(panel);
	
	panel.setLayout(null);
	
	//Grouping and customizing the variables and labels
	pagetitle = new JLabel ("USER PROFILE");
	pagetitle.setBounds(60,30,250,30);
	pagetitle.setFont(new Font("Calibri", Font.BOLD, 24));
	pagetitle.setForeground(Color.RED);
	panel.add(pagetitle);
	
	namelabel = new JLabel ("Name: ");
	namelabel.setBounds(60, 70, 150, 30);
	namelabel.setFont(font1);
	namelabel.setOpaque(true);
	namelabel.setForeground(Color.WHITE);
	namelabel.setBackground(Color.GRAY);
	panel.add(namelabel);
	
	namedisplay = new JLabel ("" +name);
	namedisplay.setBounds(210, 70, 150, 30);
	namedisplay.setFont(font2);
	namedisplay.setOpaque(true);
	namedisplay.setForeground(Color.BLUE);
	panel.add(namedisplay);

	countrylabel = new JLabel ("Nationality: ");
	countrylabel.setBounds(60, 110, 150, 30);
	countrylabel.setFont(font1);
	countrylabel.setOpaque(true);
	countrylabel.setForeground(Color.WHITE);
	countrylabel.setBackground(Color.GRAY);
	panel.add(countrylabel);
	
	countrydisplay = new JLabel ("" +country);
	countrydisplay.setBounds(210, 110, 150, 30);
	countrydisplay.setFont(font2);
	countrydisplay.setOpaque(true);
	countrydisplay.setForeground(Color.BLUE);
	panel.add(countrydisplay);
	
	agelabel = new JLabel ("Age: ");
	agelabel.setBounds(60, 150, 150, 30);
	agelabel.setFont(font1);
	agelabel.setOpaque(true);
	agelabel.setForeground(Color.WHITE);
	agelabel.setBackground(Color.GRAY);
	panel.add(agelabel);
	
	agedisplay = new JLabel ("" +age + " Years Old");
	agedisplay.setBounds(210, 150, 150, 30);
	agedisplay.setFont(font2);
	agedisplay.setOpaque(true);
	agedisplay.setForeground(Color.BLUE);
	panel.add(agedisplay);

	heightlabel = new JLabel ("Height: ");
	heightlabel.setBounds(60, 190, 150, 30);
	heightlabel.setFont(font1);
	heightlabel.setOpaque(true);
	heightlabel.setForeground(Color.WHITE);
	heightlabel.setBackground(Color.GRAY);
	panel.add(heightlabel);
	
	heightdisplay = new JLabel ("" +height + " cm");
	heightdisplay.setBounds(210, 190, 150, 30);
	heightdisplay.setFont(font2);
	heightdisplay.setOpaque(true);
	heightdisplay.setForeground(Color.BLUE);
	panel.add(heightdisplay);
	
	weightlabel = new JLabel ("Weight: ");
	weightlabel.setBounds(60, 230, 150, 30);
	weightlabel.setFont(font1);
	weightlabel.setOpaque(true);
	weightlabel.setForeground(Color.WHITE);
	weightlabel.setBackground(Color.GRAY);
	panel.add(weightlabel);
	
	weightdisplay = new JLabel ("" +weight + " kg");
	weightdisplay.setBounds(210, 230, 150, 30);
	weightdisplay.setFont(font2);
	weightdisplay.setOpaque(true);
	weightdisplay.setForeground(Color.BLUE);
	panel.add(weightdisplay);
	
	//Assigning  the button action
	home = new JButton ("HOME");
	home.setBounds(130, 270, 100, 30);
	home.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
		}
	});
	panel.add(home);
	
	//setting the visibility of the frame
	frame.setVisible(true);
	}

//Main Method for this Application's GUI
public static void main(String[] args) {
	
	Profile frame = new Profile ( );
	frame.setTitle("Profile");

}
}