import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatTrack extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private static JPanel panel;
	private static JFrame frame;
	private static JLabel pagetitle;
	private static JLabel totalsteps, distance, calories, heartrate, mealsredeemed, penalties, streak;
	private static JLabel totalsteps2, distance2, calories2, heartrate2, mealsredeemed2, penalties2, streak2;
	private static JButton home;
	private static int nStep = 350000, nMeals = 30, nPenalty = 3, nStreak = 50, nHeartRate = 90;
	private static int nDistance = nStep/1250;
	private static int nCalories = (int)(nStep*0.04);
	
	public StatTrack() {
		
		Font font1 = new Font ("Cambria", Font.BOLD, 12);
		Font font2 = new Font ("Times New Roman", Font.PLAIN, 12);
		
		panel = new JPanel();
		frame = new JFrame("Statistics Tracking");
		frame.setSize(350,500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		frame.add(panel);
		
		panel.setLayout(null);
		
		pagetitle = new JLabel ("HISTORY");
		pagetitle.setBounds(60,30,250,30);
		pagetitle.setFont(new Font("Calibri", Font.BOLD, 24));
		pagetitle.setForeground(Color.RED);
		panel.add(pagetitle);
		
		totalsteps = new JLabel ("Total Steps Taken:");
		totalsteps.setBounds(60, 70, 150, 30);
		totalsteps.setFont(font1);
		totalsteps.setOpaque(true);
		totalsteps.setForeground(Color.WHITE);
		totalsteps.setBackground(Color.GRAY);
		panel.add(totalsteps);
		
		totalsteps2 = new JLabel ("" +nStep + " steps");
		totalsteps2.setBounds(210, 70, 150, 30);
		totalsteps2.setFont(font2);
		totalsteps2.setOpaque(true);
		totalsteps2.setForeground(Color.BLUE);
		panel.add(totalsteps2);
		
		distance = new JLabel ("Total Distance Covered:");
		distance.setBounds(60, 110, 150, 30);
		distance.setFont(font1);
		distance.setOpaque(true);
		distance.setForeground(Color.WHITE);
		distance.setBackground(Color.GRAY);
		panel.add(distance);
		
		distance2 = new JLabel ("" +nDistance + " km");
		distance2.setBounds(210, 110, 150, 30);
		distance2.setFont(font2);
		distance2.setOpaque(true);
		distance2.setForeground(Color.BLUE);
		panel.add(distance2);
		
		calories = new JLabel ("Total Calories Burnt:");
		calories.setBounds(60, 150, 150, 30);
		calories.setFont(font1);
		calories.setOpaque(true);
		calories.setForeground(Color.WHITE);
		calories.setBackground(Color.GRAY);
		panel.add(calories);
		
		calories2 = new JLabel ("" +nCalories + " Calories");
		calories2.setBounds(210, 150, 150, 30);
		calories2.setFont(font2);
		calories2.setOpaque(true);
		calories2.setForeground(Color.BLUE);
		panel.add(calories2);
		
		heartrate = new JLabel ("Average Heart Rate:");
		heartrate.setBounds(60, 190, 150, 30);
		heartrate.setFont(font1);
		heartrate.setOpaque(true);
		heartrate.setForeground(Color.WHITE);
		heartrate.setBackground(Color.GRAY);
		panel.add(heartrate);
		
		heartrate2 = new JLabel ("" +nHeartRate + " bpm");
		heartrate2.setBounds(210, 190, 150, 30);
		heartrate2.setFont(font2);
		heartrate2.setOpaque(true);
		heartrate2.setForeground(Color.BLUE);
		panel.add(heartrate2);
		
		mealsredeemed = new JLabel ("Number of Meals Redeemed:");
		mealsredeemed.setBounds(60, 230, 150, 30);
		mealsredeemed.setFont(font1);
		mealsredeemed.setOpaque(true);
		mealsredeemed.setForeground(Color.WHITE);
		mealsredeemed.setBackground(Color.GRAY);
		panel.add(mealsredeemed);
		
		mealsredeemed2 = new JLabel ("" +nMeals + " Meals Redeemed");
		mealsredeemed2.setBounds(210, 230, 150, 30);
		mealsredeemed2.setFont(font2);
		mealsredeemed2.setOpaque(true);
		mealsredeemed2.setForeground(Color.BLUE);
		panel.add(mealsredeemed2);
		
		penalties = new JLabel ("Number of Penalties:");
		penalties.setBounds(60, 270, 150, 30);
		penalties.setFont(font1);
		penalties.setOpaque(true);
		penalties.setForeground(Color.WHITE);
		penalties.setBackground(Color.GRAY);
		panel.add(penalties);
		
		penalties2 = new JLabel ("" +nPenalty + " Penalties");
		penalties2.setBounds(210, 270, 150, 30);
		penalties2.setFont(font2);
		penalties2.setOpaque(true);
		penalties2.setForeground(Color.BLUE);
		panel.add(penalties2);
		
		streak = new JLabel ("Longest Streak:");
		streak.setBounds(60, 310, 150, 30);
		streak.setFont(font1);
		streak.setOpaque(true);
		streak.setForeground(Color.WHITE);
		streak.setBackground(Color.GRAY);
		panel.add(streak);
		
		streak2 = new JLabel ("" +nStreak + " days");
		streak2.setBounds(210, 310, 150, 30);
		streak2.setFont(font2);
		streak2.setOpaque(true);
		streak2.setForeground(Color.BLUE);
		panel.add(streak2);
		
		home = new JButton ("HOME");
		home.setBounds(150, 350, 100, 30);
		panel.add(home);
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		
		StatTrack frame = new StatTrack ( );
		frame.setTitle("Statistics");

	}
}