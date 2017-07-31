import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RegistrationForm{
     static Container c;
	 static JLabel name_label;
	 static JTextField name_tf;
	 static JLabel mobile_label;
	 static JTextField mobile_tf;
	 static JLabel dob_label;
	 static JComboBox day;
	 static JComboBox month;
	 static JComboBox year;
	 static JLabel gender_label;
	 static JRadioButton gen_male;
	 static JRadioButton gen_female;
	 static JLabel address_label;
	 static JTextArea address_field;
	 static JCheckBox chk;
	 static JTextArea field;
	 static JButton submit;
	 
	
	
	 
	 
public static void main(String[] args){
	 
	 JFrame frame= new JFrame("Registration Form");
	 frame.setBounds(100,50,900,600);
	 frame.setVisible(true);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 
	 c=frame.getContentPane();
	 c.setLayout(null);
	 c.setBackground(Color.PINK);
	 
	 Font f=new Font("Algerian",Font.PLAIN,20);
	 
	 name_label= new JLabel("Name");
	 name_label.setBounds(50,50,120,30);
	 name_label.setFont(f);
	 
	 name_tf=new JTextField();
	 name_tf.setBounds(200,50,150,30);
	 
	 mobile_label= new JLabel("Mobile No.");
	 mobile_label.setBounds(50,100,120,30);
	 mobile_label.setFont(f);
	 
	 mobile_tf=new JTextField();
	 mobile_tf.setBounds(200,100,150,30);
	 
	 
	 dob_label= new JLabel("DOB");
	 dob_label.setBounds(50,150,120,30);
	 dob_label.setFont(f);
	 
	 
	 
	 String[] day_arr=new String[31];
		 for(int i=1;i<=31;i++){
			 day_arr[i-1]=Integer.toString(i);
		 }
     day=new JComboBox(day_arr);
	 day.setBounds(200,150,50,30);
	 
	 String[] month_arr={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
     month=new JComboBox(month_arr);
	 month.setBounds(280,150,80,30);
	 
	 
	 String[] year_arr=new String[2020];
		 for(int i=1951;i<=2020;i++){
			 year_arr[i-1951]=Integer.toString(i);
		 }
     year=new JComboBox(year_arr);
	 year.setBounds(380,150,70,30);
	 
	 
	 gender_label= new JLabel("Gender");
	 gender_label.setBounds(50,200,120,30);
	 gender_label.setFont(f);
	 
	 gen_male = new JRadioButton("Male");
	 gen_male.setBounds(210,200,70,30);
	 
	 gen_female = new JRadioButton("Female");
	 gen_female.setBounds(300,200,70,30);
	 
	 address_label= new JLabel("Address");
	 address_label.setBounds(50,250,120,30);
	 address_label.setFont(f);
	 
	 address_field=new JTextArea();
	 address_field.setBounds(200,250,250,120);
	 
	 chk=new JCheckBox("I accept all  terms and conditions ");
	 chk.setBounds(100,400,250,30);
	 
	 submit=new JButton("Submit");
	 submit.setBounds(200,450,80,40);
	 
	 field=new JTextArea();
	 field.setBounds(500,30,300,400);
	 
	 submit.addActionListener(new ActionListener(){
        public  void actionPerformed(ActionEvent event){
			submit_action(event);
		}    		
		
	 });
	 
	 
	 c.add(name_label);
	 c.add(name_tf);
	 c.add(mobile_label);
	 c.add(mobile_tf);
	 c.add(dob_label);
	 c.add(day);
	 c.add(month);
	 c.add(year);
	 c.add(gender_label);
	 c.add(gen_male);
	 c.add(gen_female);
	 c.add(address_label);
	 c.add(address_field);
	 c.add(field);
	 c.add(chk);
	 c.add(submit);
	 
}
 public static void submit_action(ActionEvent event){
	 
	 if(chk.isSelected()==true){
		 
		 String name=name_tf.getText();
		 String mobile=mobile_tf.getText();
		 String day_name=(String)day.getSelectedItem();
		 String month_name=(String)month.getSelectedItem();
		 String year_name=(String)year.getSelectedItem();
		 String gen="Male";
		 if(gen_female.isSelected()==true){
			 gen="Female";
		 }
		 String add=address_field.getText();
		 field.setText("Name : "+name+ "\n\nMobile No. : " +mobile+ "\n\nDOB : " +day_name+" "+month_name+" "+year_name+ "\n\n Gender : " +gen+ "\n\nAddress : "+add );
	 }
	 else{
		 
		 field.setText("Please accept the terms and conditions");
	 }
 }

}