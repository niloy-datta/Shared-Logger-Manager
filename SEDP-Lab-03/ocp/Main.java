package ocp;

import java.io.File;
import java.net.URISyntaxException;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) throws ReflectiveOperationException,URISyntaxException
    {
        double weight=5.0;
        ShippingCalculator calculator=new ShippingCalculator();
        File directory=new File(Main.class.getResource("").toURI());
        String[] files=directory.list();
        if(files==null)
        {
            throw new IllegalStateException("Cannot find shipping classes.");
        }
        Arrays.sort(files);
        for(String file:files)
        {
            if(file.endsWith("Shipping.class"))
            {
                String name=file.substring(0,file.length()-6);
                Class<?> type=Class.forName("ocp."+name);
                ShippingStrategy strategy=type.asSubclass(ShippingStrategy.class).getDeclaredConstructor().newInstance();
                System.out.println(name+": "+calculator.calculateCost(strategy,weight)+" taka");
            }
        }
    }
}
