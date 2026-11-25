public class SeniorPricing implements PricingStrategy
{
    public double calculatePrice(double basePrice)
    {
        return basePrice*0.70;
    }
}
