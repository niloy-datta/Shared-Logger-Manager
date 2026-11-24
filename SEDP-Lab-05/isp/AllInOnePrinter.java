package isp;

public class AllInOnePrinter implements Printable,Scannable,Faxable
{
    public void print()
    {
        System.out.println("All-in-One Printer is printing.");
    }

    public void scan()
    {
        System.out.println("All-in-One Printer is scanning.");
    }

    public void fax()
    {
        System.out.println("All-in-One Printer is faxing.");
    }
}
