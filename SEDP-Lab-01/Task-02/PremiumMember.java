package task02;

public class PremiumMember extends Member
{
    private double annualFee;

    public PremiumMember(String name,double annualFee)
    {
        super(name);
        this.annualFee=annualFee;
    }

    @Override
    public int getMaxBooksAllowed()
    {
        return super.getMaxBooksAllowed()+(int)annualFee/1000;
    }

    @Override
    public void describe()
    {
        super.describe();
        System.out.println("Annual fee: "+annualFee);
    }
}
