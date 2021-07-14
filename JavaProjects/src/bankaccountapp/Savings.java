package bankaccountapp;

public class Savings extends Account {
	
	// List properties specific to the Savings account 
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	// Constructor to initialise settings for the Savings 
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber; 
		setSafetyDepositBox();
		}
	
	


@Override
public void setRate() {
	rate = getBaseRate() - .25;
	
}


	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 4));
	}
	
	

	// list any methods specific to savings account 
	public void showInfo() {
		super.showInfo();
		System.out.println(
				" Your Savings Account Features" +
                "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n Safety Deposit Box Key: " + safetyDepositBoxKey
						);
		
	}
}


