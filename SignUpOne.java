
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import com.mysql.cj.jdbc.Driver;

public class SignUpOne extends JFrame implements ActionListener{

  long random;
  JTextField namTextField, fathernameTextfiField, emailTextField, addressTextField, cityTextField, stateTextField,
      pinTextField, dobTextField, genderTextField;
  JButton next;
  JRadioButton male, female, other, married, unmarried, other2;
  JDateChooser datechooser;

  SignUpOne() {
    setLayout(null);
    Random ran = new Random();

    random = (Math.abs(ran.nextLong() % 9000) + 1000L);

    JLabel formno = new JLabel("APPLICATION FORM NO:" + random);
    formno.setFont(new Font("Ralevay", Font.BOLD, 38));
    formno.setBounds(140, 20, 600, 40);
    add(formno);

    JLabel personaldetails = new JLabel("Page 1: Personal Details");
    personaldetails.setFont(new Font("Ralevay", Font.BOLD, 22));
    personaldetails.setBounds(290, 80, 400, 30);
    add(personaldetails);

    JLabel name = new JLabel("Name:");
    name.setFont(new Font("Ralevay", Font.BOLD, 20));
    name.setBounds(100, 140, 100, 30);
    add(name);

    namTextField = new JTextField();
    namTextField.setFont(new Font("Ralevay", Font.BOLD, 14));
    namTextField.setBounds(300, 140, 400, 25);
    add(namTextField);

    JLabel fathername = new JLabel("Father's Name:");
    fathername.setFont(new Font("Ralevay", Font.BOLD, 20));
    fathername.setBounds(100, 190, 200, 30);
    add(fathername);

    fathernameTextfiField = new JTextField();
    fathernameTextfiField.setFont(new Font("Ralevay", Font.BOLD, 14));
    fathernameTextfiField.setBounds(300, 200, 400, 25);
    add(fathernameTextfiField);

    JLabel dob = new JLabel("Date of Birth:");
    dob.setFont(new Font("Ralevay", Font.BOLD, 20));
    dob.setBounds(100, 240, 200, 30);
    add(dob);
    datechooser = new JDateChooser();
    datechooser.setBounds(300, 250, 400, 30);
    add(datechooser);

    JLabel gender = new JLabel("Gender:");
    gender.setFont(new Font("Ralevay", Font.BOLD, 20));
    gender.setBounds(100, 290, 200, 30);
    add(gender);

    male = new JRadioButton("Male");
    male.setBounds(300, 290, 60, 30);
    male.setBackground(Color.WHITE);
    add(male);

    female = new JRadioButton("Female");
    female.setBounds(450, 290, 80, 30);
    female.setBackground(Color.WHITE);
    add(female);

    other = new JRadioButton("Others");
    other.setBounds(600, 290, 60, 30);
    other.setBackground(Color.WHITE);
    add(other);
    ButtonGroup gendeergrGroup = new ButtonGroup();
    gendeergrGroup.add(male);
    gendeergrGroup.add(female);
    gendeergrGroup.add(other);

    JLabel email = new JLabel("E-mail address:");
    email.setFont(new Font("Ralevay", Font.BOLD, 20));
    email.setBounds(100, 340, 200, 30);
    add(email);

    emailTextField = new JTextField();
    emailTextField.setFont(new Font("Ralevay", Font.BOLD, 14));
    emailTextField.setBounds(300, 350, 400, 25);
    add(emailTextField);

    JLabel maritalStatus = new JLabel("Marital status:");
    maritalStatus.setFont(new Font("Ralevay", Font.BOLD, 20));
    maritalStatus.setBounds(100, 390, 200, 30);
    add(maritalStatus);

    married = new JRadioButton("Married");
    married.setBounds(300, 390, 100, 30);
    married.setBackground(Color.WHITE);
    add(married);

    unmarried = new JRadioButton("Unmarried");
    unmarried.setBounds(450, 390, 120, 30);
    unmarried.setBackground(Color.WHITE);
    add(unmarried);

    other2 = new JRadioButton("Others");
    other2.setBounds(630, 390, 120, 30);
    other2.setBackground(Color.WHITE);
    add(other2);

    ButtonGroup maritalGroup = new ButtonGroup();
    maritalGroup.add(married);
    maritalGroup.add(unmarried);
    maritalGroup.add(other2);

    JLabel address = new JLabel("Address:");
    address.setFont(new Font("Ralevay", Font.BOLD, 20));
    address.setBounds(100, 440, 200, 30);
    add(address);

    addressTextField = new JTextField();
    addressTextField.setFont(new Font("Ralevay", Font.BOLD, 14));
    addressTextField.setBounds(300, 450, 400, 25);
    add(addressTextField);

    JLabel city = new JLabel("City:");
    city.setFont(new Font("Ralevay", Font.BOLD, 20));
    city.setBounds(100, 490, 200, 30);
    add(city);

    cityTextField = new JTextField();
    cityTextField.setFont(new Font("Ralevay", Font.BOLD, 14));
    cityTextField.setBounds(300, 500, 400, 25);
    add(cityTextField);

    JLabel state = new JLabel("State:");
    state.setFont(new Font("Ralevay", Font.BOLD, 20));
    state.setBounds(100, 540, 200, 30);
    add(state);

    stateTextField = new JTextField();
    stateTextField.setFont(new Font("Ralevay", Font.BOLD, 14));
    stateTextField.setBounds(300, 550, 400, 25);
    add(stateTextField);

    JLabel pincode = new JLabel("Pin Code:");
    pincode.setFont(new Font("Ralevay", Font.BOLD, 20));
    pincode.setBounds(100, 590, 200, 30);
    add(pincode);

    pinTextField = new JTextField();
    pinTextField.setFont(new Font("Ralevay", Font.BOLD, 14));
    pinTextField.setBounds(300, 600, 400, 25);
    add(pinTextField);

    next = new JButton("Next");
    next.setBackground(Color.GREEN);
    next.setForeground(Color.WHITE);
    next.setFont(new Font("Ralevay", Font.BOLD, 14));
    next.setBounds(620, 660, 80, 30);
    next.addActionListener(this);
    add(next);

    getContentPane().setBackground(Color.WHITE);
    setSize(850, 800);
    setLocation(35, 10);
    setVisible(true);

  }

  public void actionPerformed(ActionEvent ae){
String formno=" " +random;
String name=namTextField.getText();
String fathername=fathernameTextfiField.getText();
String dob = ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
String  gender =null;
if(male.isSelected()){
  gender="Male";
}else if(female.isSelected()){
  gender="Female";
}else if(other.isSelected()){
  gender="Other";
}

String email=emailTextField.getText();
String marital=null;
if(married.isSelected()){
  marital="Married";
}else if(unmarried.isSelected()){
  marital="Unmarried";
}else if(other2.isSelected()){
  marital="Others";
}

String address = addressTextField.getText();
String city= cityTextField.getText();
String state= stateTextField.getText();
String pin=pinTextField.getText();

try{
if(name.equals("")){
  JOptionPane.showMessageDialog(null,"Name is required");
}else{
  Conn c=new Conn();
  String query="insert into signup values( ' "+formno+" ',' "+name+" ',' "+fathername+" ',' "+dob+" ',' "+gender+" ',' "+email+" ',' "+marital+" ',' "+address+" ',' "+city+" ',' "+state+" ',' "+pin+" ')";
  c.s.executeUpdate(query);
  setVisible(false);
  new  SignUpTwo(formno).setVisible(true);

}
}catch (Exception e){
  System.out.println(e);
}
  }

  
  public static void main(String[] args) {
    new SignUpOne();
  }
}


