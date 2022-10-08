package javacamphafta3odev3.core.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {

		System.out.println("Maille loglandı : " + data);
	}
}
