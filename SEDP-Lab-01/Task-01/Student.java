public class Student
{
    private static int nextId=1;
    private final int studentId;
    private String name;
    private int age;
    private char grade;

    public Student(String name,int age,char grade)
    {
        this.studentId=nextId++;
        this.name=name;
        this.age=age;
        this.grade=grade;
    }

    public int getStudentId()
    {
        return studentId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

    public char getGrade()
    {
        return grade;
    }

    public void setGrade(char grade)
    {
        this.grade=grade;
    }
}
