package week3.day2;

public class BankClass {

	public static void main(String[] args) {
		Sbi sbiObj=new Sbi();	//Sbi is the implementation class
		sbiObj.openAccount();
		sbiObj.provideCreditCard();
		sbiObj.provideDebitCard();
		Rbi rbiObj=new Sbi(); //RBI is Interface
		rbiObj.provideDebitCard();
		rbiObj.openAccount();

	}

}
