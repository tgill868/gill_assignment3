package gill_problem2;


public class SavingsAccountTest {

public static void main(String args[]) {
	SavingsAccount savings1= new SavingsAccount("saver1",2000);
	
	savings1.annualInterestRate=4;
	savings1.calculateMonthlyInterest("saver1",12);
	
	savings1.annualInterestRate=5;
	savings1.calculateMonthlyInterest("saver1",1);
	
	SavingsAccount savings2= new SavingsAccount("saver2",3000);
	
	savings2.annualInterestRate=4;
	savings2.calculateMonthlyInterest("saver2",12);
	
	savings2.annualInterestRate=5;
	savings2.calculateMonthlyInterest("saver2",1);
	
	
}
	
}
