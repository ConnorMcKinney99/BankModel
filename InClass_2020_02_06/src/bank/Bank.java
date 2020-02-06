package bank;
/***
 * Model a bank coorp like 5/3rd
 * @author ronno
 *
 */
public class Bank {
	private String companyName;
	public String toString() {
		return ("Company Name = " + getCompanyName());
	}
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
