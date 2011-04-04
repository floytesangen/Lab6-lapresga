import static org.junit.Assert.*;

import java.util.Locale;

import org.junit.Test;


public class PrintBalanceTest {
	Locale localeUS = new Locale("en", "US");
	Locale localeFR = new Locale("fr", "FR");
	Locale localeGR = new Locale("gr", "GR");
	PrintBalance pbUS = new PrintBalance(localeUS, 9876543.21);
	PrintBalance pbFR = new PrintBalance(localeFR, 9876543.21);
	PrintBalance pbGR = new PrintBalance(localeGR, 9876543.21);
		
	@Test
	public void testGreeting() {
		assertEquals("Hello World", this.pbUS.greeting());
		assertEquals("Bonjour tout le monde", this.pbFR.greeting());
		assertEquals("Hallo Welt", this.pbGR.greeting());
	}
	@Test
	public void testGetName() {
		assertEquals("Please enter your name", this.pbUS.getName());
		assertEquals("S'il vous plaît entrer votre nom", this.pbFR.getName());
		assertEquals("Bitte geben Sie Ihren Namen", this.pbGR.getName());
	}
	@Test
	public void testMeeting() {
		assertEquals("I am pleased to meet you ", this.pbUS.meeting());
		assertEquals("Je suis heureux de vous rencontrer ", this.pbFR.meeting());
		assertEquals("Ich freue mich, Sie kennen zu lernen ", this.pbGR.meeting());
	}
	@Test
	public void testDate() {
		assertEquals("As of : ", this.pbUS.date());
		assertEquals("quant à : ", this.pbFR.date());
		assertEquals("ab : ", this.pbGR.date());
	}
	@Test
	public void testBalance() {
		assertEquals("You owe the school ", this.pbUS.balance());
		assertEquals("Vous devez l'école ", this.pbFR.balance());
		assertEquals("Du schuldest der Schule ", this.pbGR.balance());
	}
	@Test
	public void testFarewell() {
		assertEquals("Good Bye", this.pbUS.farewell());
		assertEquals("Au revoir", this.pbFR.farewell());
		assertEquals("Lebewohl", this.pbGR.farewell());
	}	
}
