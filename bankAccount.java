public class bankAccount {
    String ownerName;
    String AccountNumber;
    double balance;

    bankAccount(String ownerName, String AccountNumber,double balance)
    {
        this.ownerName=ownerName;
        this.AccountNumber=AccountNumber;
        this.balance=balance;
    }
    void deposit(double amount)
    {
        System.out.println("your previous balance was :"+ balance);
        if(amount > 0)
        {
            balance=balance + amount; 
            System.out.println("your current balance is :"+ balance);
        }
        else
        {
            System.out.println("your current balance is :"+ balance + ", Trying to deposint invalid Amount "+ amount);
            //System.out.println("Invalid amount "+ amount);
        }
    }

    void withdrawl(double amount)
    {
        if(amount> balance)
        {
            System.out.println("Insufficient funds to withdraw"+ ", Your current balance is "+balance);

        }
        else if (amount <=0)          
        {
           System.out.println("Invalid amount :"); 
        }

        
        else
        {
            balance=balance - amount;
            System.out.println("Withdrawn amount is : "+ amount);
        }
    }
    void show_ballance()
    {
        System.out.println("The account number is : "+AccountNumber);
        System.out.println("The Owner is : "+ ownerName);
        System.out.println("The Ballance is : "+ balance);
    }
    
}
//=================employee Class ============

