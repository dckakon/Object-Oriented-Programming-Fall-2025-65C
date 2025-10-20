public class SavingsAccount extends Account {
    private double interestRate;
    
    
    SavingsAccount()
    {  
    }

    public void setInterestRate(double interestRate)
    {
        this.interestRate=interestRate;
    }

    public double getInterestRate(){
        return this.interestRate;
    }
}