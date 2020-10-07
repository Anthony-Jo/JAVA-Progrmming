//import javax.swing.JOptionPane;											/*	for JOptionPane.showInputDialog()	*/

public class OkJavaGoInHome 
{
	public static void main(String[] args) 
	{
		double age_value;
		
		//String name = JOptionPane.showInputDialog("Enter your Name: ");	/*	String input function	*/
		//String age = JOptionPane.showInputDialog("Enter your age: ");
		
		String name = args[0];												/*	Input 1st Argument	*/
		String age = args[1];												/*	Input 2nd Argument	*/
		
		age_value = Double.parseDouble(age);								/* 	Convert String to double function	*/
		
		System.out.println("Your Name is " + name);
		System.out.println("Your Age is " + age_value);
	}
}
