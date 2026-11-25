public class MushroomTopping extends ToppingDecorator
{
    public MushroomTopping(Pizza wrappedPizza)
    {
        super(wrappedPizza);
    }

    public String getDescription()
    {
        return wrappedPizza.getDescription()+" + Mushroom";
    }

    public double getCost()
    {
        return wrappedPizza.getCost()+30.0;
    }
}
