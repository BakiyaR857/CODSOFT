//task3
//ATM machine
import java.util.Scanner;
class BankAccount{
double balance;
BankAccount(double balance){
this.balance=balance;
}
double deposit(double amount){
balance+=amount;
return balance;
}
double withdraw(double amount){
if(amount<balance){
balance-=amount;
return balance;
}
else{
System.out.println("Insufficient balance \namount cannot be withdrawn");
return balance;
}
}
double checkBalance(){
return balance;
}
}
class ATM{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
double initialBalance=500;
BankAccount a1=new BankAccount(initialBalance);
System.out.println("1.DEPOSIT\n2.WITHDRAW\n3.CHECKBALANCE\n4.EXIT");
while(true){
System.out.println("enter your choice(1-4)");
int choice=sc.nextInt();
switch(choice){
case 1:
System.out.println("enter amount to deposit:");
double depositAmount=sc.nextDouble();
System.out.println("balance after deposit:"+a1.deposit(depositAmount));
break;
case 2:
System.out.println("enter the amount to withdraw(should be less than"+a1.checkBalance()+")");
double withdrawAmount=sc.nextDouble();
System.out.println("balance after withraw:"+a1.withdraw(withdrawAmount));
break;
case 3:
System.out.println("Balance:"+a1.checkBalance());
break;
case 4:
System.out.println("Transaction ended");
System.exit(0);
default:
System.out.println("enter the valid choice to continue the transaction");
}
}
}
}



