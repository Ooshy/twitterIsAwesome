import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import java.awt.Color;


public class LogIn extends JPanel {
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Create the panel.
	 */
	public LogIn() {
		setBackground(new Color(175, 238, 238));
		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblTitle = new JLabel("TwitFish");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTitle, "4, 2");
		
		final JLabel lblUsername = new JLabel("Username:");
		add(lblUsername, "2, 4, right, default");
		
		txtUsername = new JTextField();
		add(txtUsername, "4, 4, fill, default");
		txtUsername.setColumns(10);
		
		final JLabel lblPassword = new JLabel("Password:");
		add(lblPassword, "2, 6, right, default");
		
		final JButton btnLogIn = new JButton("Log In");
		btnLogIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!txtUsername.getText().isEmpty() && !txtPassword.getText().isEmpty())
				{
					btnLogIn.setText("FUCK");
				}
			}
		});
		
		txtPassword = new JPasswordField();
		add(txtPassword, "4, 6, fill, default");
		add(btnLogIn, "4, 8");

	}

}
