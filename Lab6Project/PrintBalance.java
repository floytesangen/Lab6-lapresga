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
	Locale locale;
	double balance;
	ResourceBundle message;
	
	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public PrintBalance(Locale locale, double balance)
	{
		this.locale = locale;
		this.balance = balance;
		this.message = ResourceBundle.getBundle("MessagesBundle", this.locale);
		
	}
	
	public String greeting()
	{
		return message.getString("greeting");
	}
	public String getName()
	{
		return message.getString("getname");
	}
	public String meeting()
	{
		return message.getString("meeting");
	}
	public String date()
	{
		return message.getString("date");
	}
	public String balance()
	{
		return message.getString("balance");
	}
	public String farewell()
	{
		return message.getString("farewell");
	}
	
	public String calcMoney()
	{
		return NumberFormat.getCurrencyInstance(this.locale).format(this.balance);
	}
	
	public String getDate()
	{
		return DateFormat.getDateInstance(DateFormat.FULL, this.locale).format(new Date());
	}
	
	public void printBalance()
	{
		Scanner scanInput = new Scanner(System.in);
		
		//Greeting
		//System.out.println("Hello World");
		System.out.println(this.greeting());
		
		//Get User's Name
//		System.out.println("Please enter your name");
//		System.out.println("I am pleased to meet you " + name);
		System.out.println(this.getName());
		String name = scanInput.nextLine();
		System.out.println(this.meeting() + name);
		
		
		//print today's date, balance and bid goodbye
//		System.out.println("As of : "+ today.toString());
//		System.out.println("You owe the school $9876543.21");
//		System.out.println("Good Bye");
		System.out.println(this.date() + this.getDate());
		System.out.println(this.balance() + this.calcMoney());
		System.out.println(this.farewell());

	}
}



