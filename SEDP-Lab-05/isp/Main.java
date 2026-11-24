package isp;

public class Main
{
    public static void main(String[] args)
    {
        Printable simple=new SimplePrinter();
        simple.print();

        AllInOnePrinter allInOne=new AllInOnePrinter();
        allInOne.print();
        allInOne.scan();
        allInOne.fax();
    }
}
