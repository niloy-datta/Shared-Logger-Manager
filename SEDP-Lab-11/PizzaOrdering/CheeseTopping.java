public class CheeseTopping extends ToppingDecorator
{
    public CheeseTopping(Pizza wrappedPizza)
    {
        super(wrappedPizza);
    }

    public String getDescription()
    {
        return wrappedPizza.getDescription()+" + Extra Cheese";
    }

    public double getCost()
    {
        return wrappedPizza.getCost()+40.0;
    }
}
