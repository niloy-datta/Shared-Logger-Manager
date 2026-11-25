public class StudentPricing implements PricingStrategy
{
    public double calculatePrice(double basePrice)
    {
        return basePrice*0.80;
    }
}
