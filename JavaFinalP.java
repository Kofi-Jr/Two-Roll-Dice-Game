
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*

WA140 Capstone Project 3/4/2020:

Using both the Dice.java class file and the TwoDice2.java application as the foundation, create a GUI application that runs similar to the 
TwoDice2.java game created in Chapter 5. 

The GUI should display all the output from the original version and should run an instance of the game when a button on the GUI is clicked on. See the example below (it does not need to match exactly). Be sure to comment your code and accurately include indents to make the code readable. Project will be graded on the following levels:

GUI designed successfully

GUI designed successfully and GUI button triggers game application in some form

GUI designed successfully and GUI button triggers a properly working application

GUI designed successfully and styled with color, creative fonts and styling and GUI button triggers a properly working application.

*/

public class JavaFinalP extends JFrame implements ActionListener
{

	//Instance objects/ variable for this class
	JLabel title = new JLabel("Two Dice");

	//Create a JLabel
	JLabel roll1 = new JLabel("First Die Roll is:");
	final JTextField field1 = new JTextField(10);

	//Create a 2nd label
	JLabel roll2 = new JLabel("Second Die Roll is:");
	final JTextField field2 = new JTextField(10);

	//Create Button
	JButton click = new JButton("Click");
	JLabel button = new JLabel("");

	//Create a 2nd label
	JLabel higherRoll = new JLabel("Results here");
	final JTextField field3 = new JTextField(30);
	
	
	public JavaFinalP()
	{
		super("Dice Game");
		//Layout manager for GUI
		setLayout(null);
		Color color1 = new Color(102, 205, 170);
		getContentPane().setBackground(color1);

		setBounds(520, 250, 380, 300);		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		title.setBounds(125, 15, 150, 25);
		roll1.setBounds(60, 60, 150, 25);
		roll2.setBounds(60, 98, 150, 25);
		field1.setBounds(200, 60, 80, 25);
		field2.setBounds(200, 98, 80, 25);
		click.setBounds(135, 145, 90, 25);
		field3.setBounds(35, 202, 295, 25);
		title.setFont (new Font("Comic Sans MS", Font.BOLD, 25));
		roll1.setFont (new Font("Arial", Font.PLAIN, 14));
		roll2.setFont (new Font("Arial", Font.PLAIN, 14));

	
		//Add all components
		add(title);
		add(roll1);
		add(roll2);
		add(field1);
		add(field2);
		add(field3);
		add(click);
	


		// add the listener method to the button
		click.addActionListener(this);
		field1.addActionListener(this);
		field2.addActionListener(this);
		field3.addActionListener(this);
	}

	// actionPerformed details what should happen when the button is clicked on
	@Override
	public void actionPerformed(ActionEvent e)
	{

		Object source = e.getSource();


		playGame();
		}
		// method that handles the actual ***Pick Two game*** ...COPIED
		public void playGame()
		{
			// objects 
			Die firstDie = new Die();
			Die secondDie = new Die();
			
			// variables and constants
			int value1 = firstDie.getValue();
			int value2 = secondDie.getValue();
			String msg;
			
			// calculation phase
			if(value1 == value2)
			{
				msg = "The dice are a match!";
			}
			else
			{
				if(value1 > value2)
				{
					msg = "First die roll is greater.";
				}
				else
				{
					msg = "Second die roll is greater.";

				}
			}
			
		//Output phase	
		//field1.setInt(value1)
		
		field1.setText("" + value1);
		field2.setText("" + value2);
		field3.setText("                          " + msg);

		}
	}



