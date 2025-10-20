public class Start
{
public static void main(String[] args)
{
    SavingsAccount sa = new SavingsAccount( );
    sa.setAccountNumber("11111111");
    sa.setAccountHolderName("OOP1");
    sa.setBalance(10000);
    sa.setInterestRate(7.5);

    FixedAccount fa = new FixedAccount( );
    fa.setAccountNumber("11111112");
    fa.setAccountHolderName("OOP1");
    fa.setBalance(100000);
    fa.setTenureYear(10);

    Bank b = new Bank( ) ;
    b.setName("DBBL");
    b.setSavingsAccount(sa);
    b.setFixedAccount(fa);

    System.out.println("Bank name: "+b.getName( ) );
    System.out.println("-----Savings Account Details-----");
    System.out.println("Account name = "+b.getSavingsAccount().getAccountHolderName() );
    System.out.println("Account number= "+b.getSavingsAccount().getAccountNumber() );
    System.out.println("Account number= "+b.getSavingsAccount().getBalance() );
    System.out.println("Interest Rate = "+b.getSavingsAccount().getInterestRate()+"\n" );
    System.out.println("-----Fixed Account Details-----");
    System.out.println("Account name = "+b.getFixedAccount().getAccountHolderName() );
    System.out.println("Account number= "+b.getFixedAccount().getAccountNumber() );
    System.out.println("Account number= "+b.getFixedAccount().getBalance() );
    System.out.println("Tenure Year = "+b.getFixedAccount().getTenureYear() );

}
}