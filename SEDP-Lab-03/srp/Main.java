package srp;

public class Main
{
    public static void main(String[] args)
    {
        GpaValidator validator=new GpaValidator();
        TranscriptPrinter printer=new TranscriptPrinter();
        SmsAlertService sms=new SmsAlertService();

        Student[] students={new Student("Student A",3.75),new Student("Student B",1.65)};

        for(Student student:students)
        {
            if(validator.isValid(student.getGpa()))
            {
                printer.print(student);
                sms.sendAlert(student);
            }
            else
            {
                System.out.println("Invalid GPA: "+student.getName());
            }
            System.out.println();
        }
    }
}
