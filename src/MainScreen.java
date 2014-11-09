import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;


public class MainScreen extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public MainScreen() {
		setBackground(new Color(175, 238, 238));
		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblNewLabel = new JLabel("TwitFish");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel, "2, 2, center, default");
		
		JLabel lblNewLabel_1 = new JLabel("Search");
		add(lblNewLabel_1, "8, 2, right, default");
		
		textField = new JTextField();
		add(textField, "9, 2, fill, default");
		textField.setColumns(10);
		
		JLabel lblMessage = new JLabel("Action Panel");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblMessage, "2, 4");
		
		JLabel lblFeed = new JLabel("Feed");
		lblFeed.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblFeed, "4, 4");
		
		JButton btnCompose = new JButton("Compose");
		add(btnCompose, "2, 6");
		
		JButton btnFollowers = new JButton("Followers");
		btnFollowers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnFollowers, "2, 8");

	}

}
