import java.util.Scanner;
public class AtmMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String atmNum,atmPin;
        int choice = 0;
        System.out.println("Enter a Atm number:");
        atmNum = sc.nextLine();
        System.out.println("Enter a Atm Pin:");
        atmPin = sc.nextLine();
        int balance = 0;
        if(atmNum.equals("1234")&&atmPin.equals("1234")){
        System.out.println("Welcome to Ramalakshmi ATM!");
        do{
            System.out.println("Please Choose an option:");
            System.out.println("1.Balance");
            System.out.println("2.Withdrawn");
            System.out.println("3.Deposit");
            System.out.println("4.Exit");
            System.out.println("Enter a choice:");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                   System.out.println("Your balance amount:"+balance);
                   break;
                case 2:
                    System.out.println("Enter a withdrawn amount");
                    int withdrawAmount = sc.nextInt();
                    if(withdrawAmount>0 && withdrawAmount<=balance){
                        balance -= withdrawAmount;
                        System.out.println(withdrawAmount+"has been withdrawn.your current balance "+balance);
                    }else if(withdrawAmount>balance)
                    {
                        System.out.println("Insufficient Balance");
                    }else{
                        System.out.println("Invalid amount please enter a positive number");
                    }
                    break;
                case 3:
                     System.out.println("Enter a deposit amount:");
                     int depositAmount = sc.nextInt();
                     if(depositAmount>0){
                        balance+=depositAmount;
                        System.out.println(depositAmount+"has been deposited.Your current balance amount:"+balance);
                     }else{
                        System.out.println("Please a enter a valid amount");
                     }
                     break;
                case 4:
                     System.out.println("Thank you for using Ramalakshmi ATM !"); 
                     break;
                default:
                     System.out.println("Invalid choice");         

                   
            }

        }while(choice!=4);
    }else{
        System.out.println("Please enter a valid atmNumber and atmPin");
    }

    }
}
