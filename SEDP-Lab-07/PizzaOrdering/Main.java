public class Main
{
    public static void main(String[] args)
    {
        Pizza pizza1=new PlainPizza();
        pizza1=new CheeseTopping(pizza1);
        pizza1=new MushroomTopping(pizza1);
        pizza1=new StuffedCrustDecorator(pizza1);

        System.out.println("Pizza 1: "+pizza1.getDescription());
        System.out.printf(java.util.Locale.ROOT,"Cost: %.2f%n",pizza1.getCost());

        Pizza pizza2=new PlainPizza();
        pizza2=new StuffedCrustDecorator(pizza2);
        pizza2=new CheeseTopping(pizza2);
        pizza2=new MushroomTopping(pizza2);

        System.out.println("Pizza 2: "+pizza2.getDescription());
        System.out.printf(java.util.Locale.ROOT,"Cost: %.2f%n",pizza2.getCost());

        System.out.println("Costs differ because 15% is applied at different stages.");
    }
}
