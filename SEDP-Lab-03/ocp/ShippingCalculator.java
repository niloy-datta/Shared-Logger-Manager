package ocp;

public class ShippingCalculator
{
    public double calculateCost(ShippingStrategy strategy,double weight)
    {
        return strategy.calculateCost(weight);
    }
}
