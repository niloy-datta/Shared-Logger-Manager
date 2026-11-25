public class StuffedCrustDecorator extends ToppingDecorator
{
    public StuffedCrustDecorator(Pizza wrappedPizza)
    {
        super(wrappedPizza);
    }

    public String getDescription()
    {
        return wrappedPizza.getDescription()+" + Stuffed Crust";
    }

    public double getCost()
    {
        return wrappedPizza.getCost()*1.15;
    }
}
