/** Output 
Sign up first


Enter name: rishav MItra
Enter user name for login: rishav23
Enter password: vahsir23
Enter SSN: 3221
Enter address: Gangtok,Sikkim
Enter email address: rishavm@trainee.nrifintech.com
Enter age: 23
Enter phone number: 9382699226
Choose your account
1.Savings
(Any Key)Current

1
Select option: 
1.Deposit
2.Withdrawal
3.Check balance
4.Change password
5.Edit profile
6.Display Profile details

6
customer [custName=rishav MItra, ssNumber=3221, emAddr=rishavm@trainee.nrifintech.com, addr=Gangtok,Sikkim, age=23, phNum=9382699226]
Do you want to continue?
yes
Select option: 
1.Deposit
2.Withdrawal
3.Check balance
4.Change password
5.Edit profile
6.Display Profile details

1
Enter the amount to be deposited: 
1000
Do you want to continue?
yes
Select option: 
1.Deposit
2.Withdrawal
3.Check balance
4.Change password
5.Edit profile
6.Display Profile details

3
Balance: 1000.0
Do you want to continue?
yes
Select option: 
1.Deposit
2.Withdrawal
3.Check balance
4.Change password
5.Edit profile
6.Display Profile details

2
Enter the amount to be withdrawn: 
400
Do you want to continue?
yes
Select option: 
1.Deposit
2.Withdrawal
3.Check balance
4.Change password
5.Edit profile
6.Display Profile details

3
Balance: 600.0
Do you want to continue?
yes
Select option: 
1.Deposit
2.Withdrawal
3.Check balance
4.Change password
5.Edit profile
6.Display Profile details

2
Enter the amount to be withdrawn: 
100
Insufficient Fund or reached minimum limit
Do you want to continue?
yes
Select option: 
1.Deposit
2.Withdrawal
3.Check balance
4.Change password
5.Edit profile
6.Display Profile details

4
Enter old password:vahsir23
Enter new passwordrishav23
Do you want to continue?
yes
Select option: 
1.Deposit
2.Withdrawal
3.Check balance
4.Change password
5.Edit profile
6.Display Profile details

5
Enter the field you would like to edit: name
Enter new name: Rishav Mitra
Do you want to continue?
yes
Select option: 
1.Deposit
2.Withdrawal
3.Check balance
4.Change password
5.Edit profile
6.Display Profile details

6
customer [custName=Rishav Mitra, ssNumber=3221, emAddr=rishavm@trainee.nrifintech.com, addr=Gangtok,Sikkim, age=23, phNum=9382699226]
Do you want to continue?
no
Enter user name for login: rishav23
Enter password: rishav
User does not exist...Try again
Enter user name for login: rishav23
Enter password: rishav23
savings [accountId=1001, description=Savings account, minimumBalance=500.0]
Select option: 
1.Deposit
2.Withdrawal
3.Check balance
4.Change password
5.Edit profile
6.Display Profile details

6
customer [custName=Rishav Mitra, ssNumber=3221, emAddr=rishavm@trainee.nrifintech.com, addr=Gangtok,Sikkim, age=23, phNum=9382699226]
Do you want to continue?
no
Enter user name for login:
**/
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		customer obj = new customer();
		ArrayList<customer> custArr= new ArrayList();
		
		obj.signUp();
		custArr.add(obj);
		
		Scanner sc = new Scanner(System.in);
		String flag = "Yes";
		while(flag.toLowerCase().equals("yes")) {
			System.out.println("Select option: ");
			System.out.println("1.Deposit\n"+"2.Withdrawal\n"+"3.Check balance\n"+"4.Change password\n"+"5.Edit profile\n");
			int cs = sc.nextInt();
			switch (cs){
			case 1:
				obj.deposit();
				break;
			case 2:
				obj.withdrawal();
				break;
			case 3:
				obj.checkBal();
				break;
			case 4:
				obj.passkey();
				break;
			case 5:
				obj.editProfile();
				break;
			default:
				System.out.println("Invalid Input");
			}
			System.out.println("Do you want to continue?");
			flag = sc.next();
			if(flag.toLowerCase().equals("no"))
			{
				int check = 0;
				while(check == 0) {
				check = obj.login();
				if(check==0)
					System.out.println("User does not exist...Try again");
				else {
						obj.acct.display();
						flag = "Yes";
						break;
					}
				}
			}
		}
	}
}
