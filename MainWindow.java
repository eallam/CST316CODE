import javax.swing.*;
import java.awt.*;

// Customer list
public class MainWindow {

	
	public static void main(String[] args){
		
		JFrame mw = new JFrame();
		mw.setSize(800,600);
		mw.add(new CustomersPanel());
		mw.setVisible(true);
		
	}
	
}
