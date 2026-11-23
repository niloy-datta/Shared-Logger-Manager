public class GroupPricing implements PricingStrategy
{
    private int groupSize;

    public GroupPricing(int groupSize)
    {
        this.groupSize=groupSize;
    }

    public double calculatePrice(double basePrice)
    {
        double discount=groupSize*0.05;

        if(discount>0.40)
        {
            discount=0.40;
        }

        return basePrice*(1-discount);
    }
}
