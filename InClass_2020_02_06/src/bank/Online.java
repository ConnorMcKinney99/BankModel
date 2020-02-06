package bank;

public class Online extends Bank {
	private String URL;
	public String toString() {
		return ("URL = " + getURL() + ", " + super.toString());
	}
	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}
}
