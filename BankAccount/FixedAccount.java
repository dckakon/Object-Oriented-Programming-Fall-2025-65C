public class  FixedAccount extends Account{
    private int tenureYear;

    FixedAccount(){
        super();
        this.tenureYear=0;
    }

    public void setTenureYear(int tenureYear){
        this.tenureYear=tenureYear;
    }
    public int getTenureYear(){
        return tenureYear;
    }
}