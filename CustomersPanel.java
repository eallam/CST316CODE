
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//Customer list

public class CustomersPanel extends JPanel{

	ArrayList<String> customersList;
	
	JButton listCustomers;
	JButton addCustomer;
	JButton deleteCustomer;
	JTextField addCustomerTF;
	JTextField deleteCustomerTF;
	JTextArea jta;
	
	public CustomersPanel(){
		
	
		
		setLayout(new GridLayout(2,1));
		
		JPanel top = new JPanel();
		JPanel bottom = new JPanel();
		
		jta = new JTextArea();
		

		
	
		
		addCustomerTF = new JTextField();
		
		
		deleteCustomer = new JButton();
		
		
		
		deleteCustomer.setText("DeleteCustomer");
		
		deleteCustomerTF = new JTextField();
		
		listCustomers = new JButton("List Customers");

		
		top.setLayout(new GridLayout(3,2));
		
			
		top.add(addCustomerTF);		
		top.add(deleteCustomer);
		top.add(deleteCustomerTF);		
		top.add(listCustomers);
		
		add(top);
		
		bottom.setLayout(new GridLayout(1,1));
		bottom.add(jta);
		
		add(bottom);
		
	
	}
	
}
