package task02;

public class StudentMember extends Member
{
    private int semester;

    public StudentMember(String name,int semester)
    {
        super(name);
        if(semester<1 || semester>8)
        {
            throw new IllegalArgumentException("Semester must be between 1 and 8.");
        }
        this.semester=semester;
    }

    @Override
    public int getMaxBooksAllowed()
    {
        if(semester<=4)
        {
            return 2;
        }
        return 4;
    }
}
