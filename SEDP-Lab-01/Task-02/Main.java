package task02;

public class Main
{
    public static void main(String[] args)
    {
        Member member=new Member("Rahim");
        Member premium=new PremiumMember("Karim",2500);
        Member student=new StudentMember("Nila",6);

        Member[] members={member,premium,student};
        for(Member m:members)
        {
            m.describe();
            System.out.println("Max books allowed: "+m.getMaxBooksAllowed());
            System.out.println();
        }

        Member guest=new Member("   ");
        guest.describe();
        System.out.println("Max books allowed: "+guest.getMaxBooksAllowed());
    }
}
