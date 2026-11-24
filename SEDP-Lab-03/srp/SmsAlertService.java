package srp;

public class SmsAlertService
{
    public void sendAlert(Student student)
    {
        if(student.getGpa()<2.0)
        {
            System.out.println("SMS to guardian: "+student.getName()+" has a GPA below 2.0.");
        }
    }
}
