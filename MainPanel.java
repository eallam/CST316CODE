
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// invoice section
public class MainPanel extends JPanel{

	JTextField companyNameTF;
	JTextField companyAddressTF;
	JTextField companyPhoneTF;
	JTextField customerNameTF;
	JTextField customerAddressTF;
	JTextField customerPhoneTF;
	JTextField serviceProvidedTF;
	JTextField hourlyRateTF;
	JTextField totalCostTF;
	JTextField invoiceNumberTF;
	JTextField invoiceNumberSearchTF;
	JButton addInvoiceB;
	JButton loadInvoiceB;
	JTextArea invoicesTA;
	
	public MainPanel(){
		
		setLayout(new GridLayout(10,1));
		
		JPanel filler = new JPanel();
		filler.setSize(10,10);

		JPanel companyDetailsInfoJP = new JPanel();
		companyDetailsInfoJP.setLayout(new GridLayout(3,2));
		companyNameTF = new JTextField();
		companyAddressTF = new JTextField();
		companyPhoneTF = new JTextField();
		companyDetailsInfoJP.add(new JLabel("Name"));
		companyDetailsInfoJP.add(companyNameTF);
		companyDetailsInfoJP.add(new JLabel("Address"));
		companyDetailsInfoJP.add(companyAddressTF);
		companyDetailsInfoJP.add(new JLabel("Phone"));
		companyDetailsInfoJP.add(companyPhoneTF);
		
		
		
		
		
		JPanel customerDetailsInfoJP = new JPanel();
		customerDetailsInfoJP.setLayout(new GridLayout(3,2));
		customerNameTF = new JTextField();
		customerAddressTF = new JTextField();
		customerPhoneTF = new JTextField();
		customerDetailsInfoJP.add(new JLabel("Name"));
		customerDetailsInfoJP.add(customerNameTF);
		customerDetailsInfoJP.add(new JLabel("Address"));
		customerDetailsInfoJP.add(customerAddressTF);
		customerDetailsInfoJP.add(new JLabel("Phone"));
		customerDetailsInfoJP.add(customerPhoneTF);
	
		
		
		JPanel serviceInformationJP = new JPanel();
		serviceInformationJP.setLayout(new GridLayout(4,2));
		serviceProvidedTF = new JTextField();
		hourlyRateTF = new JTextField();
		totalCostTF = new JTextField();
		invoiceNumberTF = new JTextField();
		serviceInformationJP.add(new JLabel("Service Provided"));
		serviceInformationJP.add(serviceProvidedTF);
		serviceInformationJP.add(new JLabel("Hourly Rate"));
		serviceInformationJP.add(hourlyRateTF);
		serviceInformationJP.add(new JLabel("Total Cost"));	
		serviceInformationJP.add(totalCostTF);
		serviceInformationJP.add(new JLabel("Invoice Number"));
		serviceInformationJP.add(invoiceNumberTF);
		
		
		
		addInvoiceB = new JButton("Add Invoice");

		
		invoicesTA = new JTextArea();
		
		
		JPanel invoicesSearchJP = new JPanel();
		invoicesSearchJP.setLayout(new GridLayout(1,3));
		invoicesSearchJP.add(new JLabel("Invoice Number"));
		invoiceNumberSearchTF = new JTextField();
		invoicesSearchJP.add(invoiceNumberSearchTF);
		loadInvoiceB = new JButton("Load");
		invoicesSearchJP.add(loadInvoiceB);
		
		add(new JLabel("Invoices"));
		//add(filler);
		add(new JLabel("Company Details"));
		add(companyDetailsInfoJP);
		add(new JLabel("Customer Details"));
		add(customerDetailsInfoJP);		
		add(new JLabel("Service Information"));
		add(serviceInformationJP);
		
		add(addInvoiceB);
		
		add(invoicesTA);
		
		add(invoicesSearchJP);
		
		
	}
	
}
