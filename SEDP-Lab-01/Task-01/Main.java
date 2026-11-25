public class Main
{
    public static void display(Student student)
    {
        System.out.println("Student ID: "+student.getStudentId());
        System.out.println("Name: "+student.getName());
        System.out.println("Age: "+student.getAge());
        System.out.println("Grade: "+student.getGrade());
        System.out.println();
    }

    public static void main(String[] args)
    {
        Student s1=new Student("Rahim",20,'A');
        Student s2=new Student("Karim",21,'B');
        Student s3=new Student("Nila",19,'A');

        display(s1);
        display(s2);
        display(s3);

        s2.setName("Karim Ahmed");
        s2.setAge(22);
        s2.setGrade('A');

        System.out.println("Updated student information:");
        display(s2);
    }
}
