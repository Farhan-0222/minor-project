import java.util.Scanner;


public class ATM{
   public static void main (String args[]){
     
      double balance=10000;
      int pin=1234;
      int count=1;

      System.out.print("=== ATM SIMULATION ===");
      Scanner sc=new Scanner(System.in);
      int enteredpin;
      do{
      System.out.println("please enter your pin: ");
        enteredpin=sc.nextInt();
        if(enteredpin==pin){
         break;
        }
      System.out.println("incorrect pin");

      System.out.print(count+" attempts out of 3 \n");
      if(count==3){
         System.out.print("transaction failed");
         return;
      }
   count++;
}
        while(enteredpin!=pin || count==3);
     
      
       
      

      System.out.println("login succesfully\n");
       int choice;
     
do{
System.out.println("== ATM MENU ==");
System.out.println("1: check balance");
System.out.println("2: deposit money");
System.out.println("3: withdraw cash");
System.out.println("4: exit");
System.out.println("enter your choice: ");
choice= sc.nextInt();





switch(choice){
   case 1: System.out.println( "current balance : " + balance +"\n");
   break;
   case 2: System.out.print("enter deposit amount: ");
   Double deposit=sc.nextDouble();
   balance = balance + deposit;
   System.out.println("amount succesfully deposited\n");
   System.out.println("current balance is : "+ balance + "\n");
   break;
   case 3:
      System.out.println("enter withdraw amount: ");
      double w= sc.nextDouble();
      balance= balance-w;
      System.out.println(" amount succesfully withdrawl \n current balnce is : "+ balance +"\n" );
      break;
      case 4:
         System.out.print("(thanks for using ATM )");
          
          break;}}
          while(choice!=4);

}}