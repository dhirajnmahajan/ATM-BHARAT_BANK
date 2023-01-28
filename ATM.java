import java.util.Scanner;
public class ATM{
     public static void main(String[] args) 
    {
        BankAccount obj =  new BankAccount("Mr. XYZ", "ABC123");
     
        obj.showMenu();
    }
}

 class BankAccount
{
   int balance;
   int previousTransaction;
   String customerName, Account_No;

   BankAccount(String cname , String cid)  // parameterize constructor of BankAccount class
   {
      customerName = cname;
      Account_No = cid;
   }

   void deposit(int amount)
  {
    if(amount !=0) {
        balance = balance + amount;
        previousTransaction = amount;
    }
   }
   void withdraw(int amount) {
    if(amount !=0) {
        balance = balance - amount;
        previousTransaction -=amount;
    }
   }
   void getPreviousTransaction() {
     if(previousTransaction > 0) {
        System.out.println("\tDeposit: " + previousTransaction);
     }
     else if(previousTransaction < 0){
        System.out.println("\tWithdraw: " + Math.abs(previousTransaction));
     }
     else {
        System.out.println(" No Transaction Occurred ");
     }
   }
    
     void showMenu()
     {
       int option;
      Scanner sc = new Scanner(System.in);

       System.out.println("\n\t ##########################");
       System.out.println("\n\t !! Welcome To ATM of BHARAT Bank !!");
       System.out.println("\n\t ########################## \n\n");
       System.out.println("\t  Name " + customerName);
       System.out.println("\t Your ID :" + Account_No);
       System.out.println("\n\t Hello, "+customerName +"\n   Use the Services of BHARAT BANK .");
       System.out.println("\n   Account Actions =>");

      System.out.println("\t 1. Check Your Balance");
      System.out.println("\t 2. Deposit ");
      System.out.println("\t 3. Withdraw ");
      System.out.println("\t 4. Previous Transaction ");
      System.out.println("\t 5. Exit the System ");

       do{
         System.out.println("\n\t ------------------  ");
        System.out.println("\t# Enter your Option: ");
   
         option=sc.nextInt();
        switch(option)
        {
          case 1:
            System.out.println("\t Balance: "+ balance);
            System.out.println("\n\t------------------  ");
          break;

          case 2:
            System.out.println("\t Enter Amount to Deposit: ");
             int amount=sc.nextInt();
             deposit(amount);
             System.out.println("\t Amount is Credited on Rs." + amount);
          break;

          case 3:
          System.out.println("\t Enter Amount to Withdraw: ");
            
          int amount2=sc.nextInt();
          withdraw(amount2);
          System.out.println("\t Amount is Debited on Rs." + amount2);
          break;

          case 4:
           System.out.println("\t Previous Transactions ");
           getPreviousTransaction();

           case 5:
            System.out.println(" ------------------------ ");
           break;

           default:
            System.out.println("\t *Invalid Input* \n Please Select From the Above Options ");
            break;
        }
       }
        while(option !=5);
         System.out.println("\t THANK YOU ! For using our Service :) ");
       System.out.println("\t Owner > ..Dhiraj Mahajan.. ");
         sc.close();
     }
}