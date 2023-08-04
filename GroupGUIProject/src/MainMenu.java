import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainMenu extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private static JPanel panel;
	private static JFrame mainmenuframe;
	private static JLabel appname;
	private static JButton profilebutton, storebutton, progressbutton, historybutton, upgradebutton, rateusbutton, logoutbutton;
	
	public MainMenu () {
	panel = new JPanel();
	mainmenuframe = new JFrame("Main Menu");
	mainmenuframe.setSize(300,500);
	mainmenuframe.setLocationRelativeTo(null);
    mainmenuframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
    mainmenuframe.add(panel);
	
	panel.setLayout(null);
	
	JPanel panel = new JPanel();
	mainmenuframe.getContentPane().add(panel, BorderLayout.NORTH);
	
	appname = new JLabel("FEET THE WORLD");
	appname.setOpaque(true);
	appname.setForeground(Color.WHITE);
	appname.setBackground(Color.BLUE);
	appname.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
	panel.add(appname);
	
	JPanel panel_1 = new JPanel();
	mainmenuframe.getContentPane().add(panel_1, BorderLayout.CENTER);
	
	profilebutton = new JButton("Profile");
	profilebutton.setForeground(new Color(65, 105, 225));
	profilebutton.setFont(new Font("Times New Roman", Font.BOLD, 20));
	profilebutton.setBounds(90, 11, 120, 39);
	profilebutton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			new Profile();
		}
	});
	
	panel_1.setLayout(null);
	panel_1.add(profilebutton);
	
	storebutton = new JButton("Store");
	storebutton.setFont(new Font("Times New Roman", Font.BOLD, 20));
	storebutton.setForeground(new Color(65, 105, 225));
	storebutton.setBounds(90, 61, 120, 39);
	storebutton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			new MealPurchase();
			}
	});
	panel_1.add(storebutton);
	
	progressbutton = new JButton("Progress");
	progressbutton.setForeground(new Color(65, 105, 225));
	progressbutton.setFont(new Font("Times New Roman", Font.BOLD, 20));
	progressbutton.setBounds(90, 111, 120, 39);
	progressbutton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			new CurrentProgress();
			}
	});
	panel_1.add(progressbutton);
	
	historybutton = new JButton("History");
	historybutton.setForeground(new Color(65, 105, 225));
	historybutton.setFont(new Font("Times New Roman", Font.BOLD, 20));
	historybutton.setBounds(90, 161, 120, 39);
	historybutton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			new StatTrack();
			}
	});
	panel_1.add(historybutton);
	
	upgradebutton = new JButton("Upgrade");
	upgradebutton.setForeground(new Color(65, 105, 225));
	upgradebutton.setFont(new Font("Times New Roman", Font.BOLD, 20));
	upgradebutton.setBounds(90, 211, 120, 39);
	upgradebutton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			new PremiumMember();
		}
	});
	panel_1.add(upgradebutton);
	
	rateusbutton = new JButton("Rate Us");
	rateusbutton.setForeground(new Color(65, 105, 225));
	rateusbutton.setFont(new Font("Times New Roman", Font.BOLD, 20));
	rateusbutton.setBounds(90, 261, 120, 39);
	rateusbutton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			new RateUs();
		}
	});
	panel_1.add(rateusbutton);

	logoutbutton = new JButton("Log Out");
	logoutbutton.setForeground(new Color(65, 105, 225));
	logoutbutton.setFont(new Font("Times New Roman", Font.BOLD, 20));
	logoutbutton.setBounds(90, 311, 120, 39);
	logoutbutton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
			JOptionPane.showMessageDialog(logoutbutton, "Logging Out,\nHave a Nice Day.");
			new LoginScreen();
			mainmenuframe.dispose();
		}
	});
	panel_1.add(logoutbutton);
	
	mainmenuframe.setVisible(true);
	
}
public static void main(String[] args) {

	MainMenu frame = new MainMenu ( );
frame.setTitle("Main Menu");


}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}

