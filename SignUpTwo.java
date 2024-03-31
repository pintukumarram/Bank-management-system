
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import com.mysql.cj.jdbc.Driver;

public class SignUpTwo extends JFrame implements ActionListener {

  JTextField pan, aadhar;
  JButton next;
  JRadioButton syes, sno, eyes, eno;
  JComboBox religions,religion, category, education, educational, Occupation, incom;
  String formno;

  SignUpTwo(String formno) {
    this.formno=formno;

    setLayout(null);

    setTitle("New Account Application Form: Page-2");

    JLabel additionaldetails = new JLabel("Page 2: Additional Details");
    additionaldetails.setFont(new Font("Ralevay", Font.BOLD, 22));
    additionaldetails.setBounds(290, 80, 400, 30);
    add(additionaldetails);

    JLabel Religion = new JLabel(" Religion:");
    Religion.setFont(new Font("Ralevay", Font.BOLD, 20));
    Religion.setBounds(100, 140, 100, 30);
    add(Religion);

    String valReligion[] = { "HINDU", "MUSLIM", "SIKH", "CHRISTAIN", "OTHER" };
     religions = new JComboBox(valReligion);
    religions.setBounds(300, 140, 400, 25);
    religions.setBackground(Color.WHITE);
    add(religions);

    JLabel Category = new JLabel("Category:");
    Category.setFont(new Font("Ralevay", Font.BOLD, 20));
    Category.setBounds(100, 190, 200, 30);
    add(Category);

    String valcategory[] = { "General", "OBC", "ST", "SC", "OTHER" };
    category = new JComboBox(valcategory);
    category.setBackground(Color.WHITE);
    category.setBounds(300, 200, 400, 25);
    add(category);

    JLabel income = new JLabel("Income");
    income.setFont(new Font("Ralevay", Font.BOLD, 20));
    income.setBounds(100, 240, 200, 30);
    add(income);

    String valincom[] = { "NULL", "<1,50,000", "<2,50,000", "<5,00,000", "upto 10,00,000" };
    incom = new JComboBox(valincom);
    incom.setBackground(Color.WHITE);
    incom.setBounds(300, 240, 400, 25);
    add(incom);

    JLabel education = new JLabel("Educational:");
    education.setFont(new Font("Ralevay", Font.BOLD, 20));
    education.setBounds(100, 290, 200, 30);
    add(education);

    JLabel Qualification = new JLabel("Qualification:");
    Qualification.setFont(new Font("Ralevay", Font.BOLD, 20));
    Qualification.setBounds(100, 315, 200, 30);
    add(Qualification);

    String educationval[] = { "Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "other" };
     educational = new JComboBox(educationval);
    educational.setBackground(Color.WHITE);
    educational.setBounds(300, 315, 400, 25);
    add(educational);

    JLabel occupation = new JLabel("Occupation:");
    occupation.setFont(new Font("Ralevay", Font.BOLD, 20));
    occupation.setBounds(100, 390, 200, 30);
    add(occupation);

    String occupation_val[] = { "Salaried", "Self-employed", "Businessmen", "Student", "other" };
    Occupation = new JComboBox(occupation_val);
    Occupation.setBackground(Color.WHITE);
    Occupation.setBounds(300, 390, 400, 25);
    add(Occupation);

    JLabel panno = new JLabel("PAN Number:");
    panno.setFont(new Font("Ralevay", Font.BOLD, 20));
    panno.setBounds(100, 440, 200, 30);
    add(panno);

    pan = new JTextField();
    pan.setFont(new Font("Ralevay", Font.BOLD, 14));
    pan.setBounds(300, 450, 400, 25);
    add(pan);

    JLabel aadharno = new JLabel("AADHAR Number:");
    aadharno.setFont(new Font("Ralevay", Font.BOLD, 20));
    aadharno.setBounds(100, 490, 200, 30);
    add(aadharno);

    aadhar = new JTextField();
    aadhar.setFont(new Font("Ralevay", Font.BOLD, 14));
    aadhar.setBounds(300, 500, 400, 25);
    add(aadhar);

    JLabel seniorcitizen = new JLabel("Senior Citizen:");
    seniorcitizen.setFont(new Font("Ralevay", Font.BOLD, 20));
    seniorcitizen.setBounds(100, 540, 200, 30);
    add(seniorcitizen);

    syes = new JRadioButton("YES");
    syes.setBounds(300, 540, 100, 30);
    syes.setBackground(Color.WHITE);
    add(syes);

    sno = new JRadioButton("NO");
    sno.setBounds(450, 540, 120, 30);
    sno.setBackground(Color.WHITE);
    add(sno);

    ButtonGroup citigenGroup = new ButtonGroup();
    citigenGroup.add(syes);
    citigenGroup.add(sno);

    // stateTextField = new JTextField();
    // stateTextField.setFont(new Font("Ralevay", Font.BOLD, 14));
    // stateTextField.setBounds(300, 550, 400, 25);
    // add(stateTextField);

    JLabel existaccount = new JLabel("Existing Account:");
    existaccount.setFont(new Font("Ralevay", Font.BOLD, 20));
    existaccount.setBounds(100, 590, 200, 30);
    add(existaccount);

    eyes = new JRadioButton("YES");
    eyes.setBounds(300, 590, 100, 30);
    eyes.setBackground(Color.WHITE);
    add(eyes);

    eno = new JRadioButton("NO");
    eno.setBounds(450, 590, 120, 30);
    eno.setBackground(Color.WHITE);
    add(eno);

    ButtonGroup eacGroup = new ButtonGroup();
    eacGroup.add(syes);
    eacGroup.add(eno);

    // pinTextField = new JTextField();
    // pinTextField.setFont(new Font("Ralevay", Font.BOLD, 14));
    // pinTextField.setBounds(300, 600, 400, 25);
    // add(pinTextField);

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

  public void actionPerformed(ActionEvent ae) {
    // String formno=" " +random;
    String Religion = (String) religions.getSelectedItem();
    String Category = (String) category.getSelectedItem();
    String income = (String) incom.getSelectedItem();
    String seducation = (String) educational.getSelectedItem();
    String soccupation = (String) Occupation.getSelectedItem();

    String scitizen = null;
    if (syes.isSelected()) {
      scitizen = "Yes";
    } else if (sno.isSelected()) {
      scitizen = "NO";
    }
  

  String exixtingaccount=null;
  if(eyes.isSelected())
  {
    exixtingaccount = "Yes";
  }else if(eno.isSelected())
  {
    exixtingaccount = "NO";
  }

  String span = pan.getText();
  String saadhar = aadhar.getText();
  
  try
  {
    
      Conn c = new Conn();
      String query = "insert into signuptwo values( ' " + formno + " ',' " + Religion + " ',' " + Category + " ',' " + income
          + " ',' " + seducation + " ',' " + soccupation + " ',' " + span + " ',' " + saadhar + " ',' " + scitizen + " ',' "
          + exixtingaccount + " ')";
      c.s.executeUpdate(query);

      ////SignUp3 Object
      setVisible(false);
      new SignUpThree(formno).setVisible(true);
   
  }catch(
  Exception e)
  {
    System.out.println(e);
  }
}
  


  public static void main(String[] args) {
    new SignUpTwo("");
  }
}
