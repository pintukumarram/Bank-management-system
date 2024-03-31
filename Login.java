import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
  JButton login, signup, clear; // Globally defined inside constructer
  JTextField cardTextField;
  JPasswordField PinTextField;

  Login() {

    // Title
    setTitle("ATM Machine");
    setLayout(null);

    // Images-logo
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
    Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel label = new JLabel(i3);
    label.setBounds(70, 10, 100, 100);
    add(label);

    // Adding Headline
    JLabel text = new JLabel("Welcome to ATM");
    text.setFont(new Font("Osward", Font.BOLD, 38));
    text.setBounds(200, 40, 400, 40);
    add(text);
    // Card Number
    JLabel CardNo = new JLabel("Card No:");
    CardNo.setFont(new Font("Osward", Font.BOLD, 28));
    CardNo.setBounds(120, 150, 400, 30);
    add(CardNo);

    cardTextField = new JTextField();
    cardTextField.setBounds(300, 150, 230, 30);
    cardTextField.setFont(new Font("Arial",Font.BOLD,14));
    add(cardTextField);

    // Pin
    JLabel PIN = new JLabel("PIN");
    PIN.setFont(new Font("Osward", Font.BOLD, 28));
    PIN.setBounds(120, 220, 250, 30);
    add(PIN);

    PinTextField = new JPasswordField();
    PinTextField.setBounds(300, 220, 230, 30);
    cardTextField.setFont(new Font("Arial",Font.BOLD,14));
    add(PinTextField);

    // Buttons
    login = new JButton("SIGN IN");
    login.setBounds(300, 300, 100, 30);
    login.setBackground(Color.BLACK);
    login.setForeground(Color.WHITE);
    login.addActionListener(this);
    add(login);

    clear = new JButton("Clear");
    clear.setBounds(430, 300, 100, 30);
    clear.setBackground(Color.BLACK);
    clear.setForeground(Color.WHITE);
    clear.addActionListener(this);
    add(clear);

    signup = new JButton("SIGN UP");
    signup.setBounds(300, 350, 230, 30);
    signup.setBackground(Color.BLACK);
    signup.setForeground(Color.WHITE);
    signup.addActionListener(this);
    add(signup);

    getContentPane().setBackground(Color.white);
    setSize(800, 480);
    setVisible(true);
    setLocation(350, 200);
  }

  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == clear) {
      cardTextField.setText("");
      PinTextField.setText("");
    } else if (ae.getSource() == login) {

    } else if (ae.getSource() == signup) {

      setVisible(false);
      new SignUpOne().setVisible(true);
    }

  }

  public static void main(String[] args) {
    new Login();
  }
}