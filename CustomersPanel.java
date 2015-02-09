
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CustomersPanel extends JPanel{

	ArrayList<String> customersList;
	
	JButton listCustomers;
	JButton addCustomer;
	JButton deleteCustomer;
	JTextField addCustomerTF;
	JTextField deleteCustomerTF;
	JTextArea jta;
	
	public CustomersPanel(){
		
	customersList = new <String>ArrayList();
		
		setLayout(new GridLayout(2,1));
		
		JPanel top = new JPanel();
		JPanel bottom = new JPanel();
		
		jta = new JTextArea();
		

		
		addCustomer = new JButton("Add Customer");
		
		addCustomer.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				customersList.add(addCustomerTF.getText());
				addCustomerTF.setText("");
			}

		});
		
		addCustomerTF = new JTextField();
		
		
		deleteCustomer = new JButton();
		
		deleteCustomer.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String deleteEntry = deleteCustomerTF.getText();
				for(int i=customersList.size()-1;i>=0;i--){
					if(customersList.get(i).equals(deleteEntry)){
						customersList.remove(i);
					}
				}	
			}
		});
		
		deleteCustomer.setText("DeleteCustomer");
		
		deleteCustomerTF = new JTextField();
		
		listCustomers = new JButton("List Customers");
		listCustomers.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				jta.setText("");
				int counter = 1;
				for(String s : customersList){
					
					jta.setText(jta.getText() + counter + ". " + s + "\n");
					counter++;
				}
				
			}});
		
		top.setLayout(new GridLayout(3,2));
		
		top.add(addCustomer);		
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
