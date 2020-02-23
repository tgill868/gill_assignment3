package gill_problem2;


public class SavingsAccount {
	
	String name;
	public static float interest;
	public static float annualInterestRate=0;
	private float savingsBalance=0;
	private float newSavingsBalance=0;

	public float getSavingsBalance() {
		return this.savingsBalance;
	}
	
	SavingsAccount(String name, float savingsBalance) {
		this.name=name;
		this.savingsBalance=savingsBalance;
	}
	
	public void calculateMonthlyInterest(String name,int months) {
		for(int i=0;i < months; i++) {
		float interest= this.savingsBalance * ((annualInterestRate)/1200);
		this.savingsBalance= this.savingsBalance+interest;
		
		}
		System.out.printf("New Balance for %s = %.2f @ %.2f after %d months\n",name,savingsBalance,annualInterestRate,months);
	}
	
	public static void modifyInterestRate(int newRate) {
		annualInterestRate=newRate;
	}
	
}
