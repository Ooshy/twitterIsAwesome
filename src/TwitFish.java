import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;


public class TwitFish extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	private static JFrame window = null;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TwitFish frame = new TwitFish();
					frame.setVisible(true);
					window = frame;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TwitFish() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new LogIn();
		
		setBounds(100, 100, 250, 175);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		
		contentPane.add(panel);
		
		
		
	}

}
