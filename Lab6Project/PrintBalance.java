import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 * TODO A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2010.
 */
public class PrintBalance{

	
	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public static void main(String[] args)
	{
		Locale locale = new Locale("gr", "GR");
		ResourceBundle message = ResourceBundle.getBundle("MessagesBundle", locale);
		
		Scanner scanInput = new Scanner(System.in);
		Date today = new Date();
		
		DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, locale).format(today);
		
		//Greeting
		//System.out.println("Hello World");
		System.out.println(message.getString("greeting"));
		
		//Get User's Name
//		System.out.println("Please enter your name");
//		System.out.println("I am pleased to meet you " + name);
		System.out.println(message.getString("getname"));
		String name = scanInput.nextLine();
		System.out.println(message.getString("meeting") + name);
		
		
		//print today's date, balance and bid goodbye
//		System.out.println("As of : "+ today.toString());
//		System.out.println("You owe the school $9876543.21");
//		System.out.println("Good Bye");
		String money = NumberFormat.getCurrencyInstance(locale).format(9876543.21);
		System.out.println(message.getString("date") + today);
		System.out.println(message.getString("balance") + money);
		System.out.println(message.getString("farewell"));
	}
}



