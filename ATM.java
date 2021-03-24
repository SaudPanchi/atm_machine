package basics;
import java.util.Scanner;
public class ATM
{
	public static void main(String[] args)
	{	int pin1=1234; int balance = 10000; int amount; int pin; String choose;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ATM");
		System.out.println("Select Your Option");
		System.out.println("1.Withdraw");
		System.out.println("2.Deposit");
		System.out.println("3.Check Balance");
		while(true){
			System.out.println("Enter Your Option");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			{
			System.out.println("Enter Your Pin: ");
			pin = sc.nextInt();
			if(pin == pin1)
			{
				System.out.println("Type Amount to be withdrawn: ");
				amount = sc.nextInt();
				if(amount<=balance)
				{
					System.out.println("Withdraw Successful");
					System.out.println("Current Balance = "+ (balance-amount));
				}
				else 
				{
					System.out.println("Insufficient Fund");
				}
			}
			else
			{
				System.out.println("Incorrect Pin");
			}
			break;
			}
		case 2:
		{
			System.out.println("Enter Your Pin: ");
			pin = sc.nextInt();
			if(pin == pin1)
			{
				System.out.println("Enter Amount to deposit");
				amount = sc.nextInt();
				balance = balance + amount;
				System.out.println("Your new balance is: "+ balance);
			}
			else
			{
				System.out.println("Pin Incorrect");
			}
		}break;
		case 3:
		{
			System.out.println("Enter Your Pin: ");
			pin = sc.nextInt();
			if(pin == pin1)
			{
				System.out.println("Your Balance is: " + balance);
			}
			else
			{
				System.out.println("Invalid Pin");
			}
		}break;
		default:
			System.out.println("Invalid Choice");
			break;
	}
		System.out.println("Do you want to continue (y/n)");
		choose = sc.nextLine();
		}
		}
		
}