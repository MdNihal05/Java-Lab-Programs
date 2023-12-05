import java.util.*;
class Account{
	double acc_balance=0.0;
	private String acc_no,acc_name,acc_address;
	Account(String name,String no,String address,double balance){
		if(balance<=0){
			System.out.println("cannot crate account amount should be greater than ");
		}else{
			acc_balance=balance;
			acc_no=no;
			acc_name=name;
			acc_address=address;
		}
	}
	void Credit(double balance){
		acc_balance+=balance;
	}
	void Debit(double balance){
		if(acc_balance>balance){
			acc_balance-=balance;
			System.out.println("Transaction Successful");
		}else if(acc_balance==balance){
			System.out.println("your account should have amount greater than 0.0");
		}else{
			System.out.println("Debit amount exceeded account balance");
		}
	}
	void GetBalance(){
		System.out.println("Balance Remaining : "+acc_balance);
	}
}
class Bank{
	public static void main(String ...args){
		Scanner sc=new Scanner(System.in);
		System.out.println("create account\nenter name :\nacc_no:\naddress :\nbalance :\n");
		String name=sc.nextLine();
		String acc_no=sc.nextLine();
		String address=sc.nextLine();
		double balance=sc.nextDouble();
		Account account=new Account(name,acc_no,address,balance);
		int option=1;
		while(option!=0){
			System.out.println("enter the option \n1.Credit amount \n2.Debit Amount \n3.GetBalance \n0.exit");
			option=sc.nextInt();
			switch(option){
				case 1:
					System.out.println("enter the amount you want to credit :");
					double credit=sc.nextDouble();
					account.Credit(credit);
					break;
				case 2:
					System.out.println("enter the amount you want to debit :");
					double debit=sc.nextDouble();
					account.Debit(debit);
					break;
				case 3:
					account.GetBalance();
					break;
				default:
					break;
			}
		}
	}
}
