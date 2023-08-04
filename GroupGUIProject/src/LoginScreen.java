import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginScreen extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private static JPanel panel;
	private static JFrame loginframe;
	private static JLabel appname, pageheader;
	private static JLabel userLabel;
	private static JTextField textfield;
	private static JLabel passwordLabel;
	private static JPasswordField passwordfield;
	private static JLabel signupusernamelabel, signuppasswordlabel, emaillabel;
	private static JTextField usernamefield, emailfield;
	private static JPasswordField signuppasswordfield;
	private static JButton loginbutton, createbutton;
	

	public LoginScreen () {
		JButton loginbutton, createbutton;
		
		//Create the frame
		panel = new JPanel();
		loginframe = new JFrame();
		loginframe.setSize(350,350);
		loginframe.setLocationRelativeTo(null);
		loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		loginframe.add(panel);
		  
		panel.setLayout(null);
		
		//Inserting the elements into the frame
		appname = new JLabel("FEET THE WORLD");
		appname.setBounds(60, 30, 250, 30);
		appname.setFont(new Font("DengXianLight", Font.BOLD + Font.ITALIC, 24));
		appname.setForeground(Color.BLUE);
		panel.add(appname);
		
		pageheader = new JLabel("Please login to your account");
		pageheader.setBounds(20, 60, 250, 30);
		pageheader.setFont(new Font("DengXianLight", Font.ITALIC, 16));
		panel.add(pageheader);
		
		userLabel = new JLabel("Username: ");
		userLabel.setBounds(20, 100, 100, 30);
		userLabel.setFont(new Font("CenturyGothic", Font.PLAIN, 16));
		userLabel.setOpaque(true);
		userLabel.setBackground(Color.PINK);
		panel.add(userLabel);
		  
		passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(20, 140, 100, 30);
		passwordLabel.setFont(new Font("CenturyGothic", Font.PLAIN, 16));
		passwordLabel.setOpaque(true);
		passwordLabel.setBackground(Color.PINK);
		panel.add(passwordLabel);
		
		textfield = new JTextField(20);
		textfield.setBounds(120, 100, 150, 30);
		textfield.setOpaque(true);
		textfield.setBackground(Color.ORANGE);
		panel.add(textfield);
		  
		passwordfield = new JPasswordField();
		passwordfield.setBounds(120, 140, 150, 30);
		passwordfield.setOpaque(true);
		passwordfield.setBackground(Color.ORANGE);
		panel.add(passwordfield);
		
		loginbutton = new JButton("LOGIN");
		loginbutton.setBounds(100, 180, 80, 25);
		loginbutton.addActionListener(this);
		panel.add(loginbutton);

		createbutton = new JButton("CREATE ACCOUNT");
		createbutton.setBounds(60, 220, 160, 25);
		createbutton.addActionListener(this);
		panel.add(createbutton);
		
		loginframe.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
		
        //Get the username and password from the username and password fields
		String user = textfield.getText();
		String password = passwordfield.getText();
		
		//If the Login Button is pressed
		if(action.contentEquals("LOGIN")) {
		
		// If the login credentials are accurate, login will succeed
		if(user.contentEquals("admin") && password.contentEquals("admin")) {
		JOptionPane.showMessageDialog(null, "Login Successful");
		new MainMenu();
		loginframe.dispose();
		}
		
		// If they are incorrect, login will fail
		else {
		JOptionPane.showMessageDialog(null, "Login Failed", null, JOptionPane.ERROR_MESSAGE);
		}
		}
		
		// If the create account button is pressed
		if(action.contentEquals("CREATE ACCOUNT")) {
		JButton submitbutton;
	    
		// Account creation frame
		JLabel label;
		JFrame frame = new JFrame ("Account Information");
	      label = new JLabel("Please insert your information to create an account.");
	      label.setBounds(50, 50, 100, 30);
	      label.setFont(new Font("Times Roman", Font.BOLD, 12));
	      label.setOpaque(true);
	      label.setForeground(Color.BLACK);
	      label.setBackground(Color.YELLOW);
	      frame.add(label);
	      frame.setSize(400,300);
	      frame.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 20));
	      frame.setVisible(true);
	      
	      	emaillabel = new JLabel("Email:     ");
	      	frame.add(emaillabel);
	        
	        emailfield = new JTextField(16);
	        frame.add(emailfield);	
	      
	        signupusernamelabel = (new JLabel("Username: "));
	        frame.add(signupusernamelabel);
	        
	        usernamefield = new JTextField(16);
	        frame.add(usernamefield);
	        
	        signuppasswordlabel = (new JLabel("Password: "));
	        frame.add(signuppasswordlabel);
	        
	        signuppasswordfield = new JPasswordField(16);
	        frame.add(signuppasswordfield);
	        
	        submitbutton = new JButton ("Submit");
	        frame.add(submitbutton);
	        submitbutton.addActionListener (this);
	        
	    	loginframe.setVisible(true);
}
	
		
		  	if(action.contentEquals("Submit")) {
		  		String email=emailfield.getText();
		  		String username2 = usernamefield.getText();
		  		String password2 = signuppasswordfield.getText();
		  		
		  		if ((email.contentEquals("abc@gmail.com")) && (username2.contentEquals("tom123")) && (password2.contentEquals("1234"))) {
		  			JOptionPane.showMessageDialog(null, "Sign-Up Successful");
		  			System.exit(0);
		  		}
		  		else {
		  			JOptionPane.showMessageDialog(null, "Sign-Up Failed", null, JOptionPane.ERROR_MESSAGE);
		  			System.exit(0);
		  			}
		  	}
	      }
	public static void main(String[] args) {
		LoginScreen frame = new LoginScreen ( );
		frame.setTitle("Login Screen");
	}			
		}