package task02;

public class Member
{
    private static int counter=0;
    private final int memberId;
    private String name;
    private int maxBooksAllowed=3;

    public Member(String name)
    {
        this.memberId=++counter;
        if(name==null || name.trim().isEmpty())
        {
            System.out.println("Error: Name cannot be blank. Using Guest.");
            this.name="Guest";
        }
        else
        {
            this.name=name;
        }
    }

    public int getMemberId()
    {
        return memberId;
    }

    public String getName()
    {
        return name;
    }

    public int getMaxBooksAllowed()
    {
        return maxBooksAllowed;
    }

    public void describe()
    {
        System.out.println("Member ID: "+getMemberId());
        System.out.println("Name: "+getName());
        System.out.println("Book limit: "+getMaxBooksAllowed());
    }
}
