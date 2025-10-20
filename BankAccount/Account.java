public class Account {
    
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    Account(){ 
        this.accountHolderName="";
        this.accountNumber="";
        this.balance=0;
    }

   public void setAccountNumber(String accountNumber)
   {
        this.accountNumber=accountNumber;
   }
   public void setAccountHolderName(String accountHolderName)
   {
        this.accountHolderName = accountHolderName;
   }
   public void setBalance(double balance){
        this.balance = balance;
   }
public String getAccountNumber( ) {
    return accountNumber;
}
public String getAccountHolderName( )
{
    return accountHolderName;
}
public double getBalance( )
{
    return balance;
}

public void depositMoney(double amount)
{
    balance+= amount;
}

public void withdrawMoney(double amount)
{
    if(balance>0 && balance>=amount)
    {
        balance-= amount;
    }
}


}