package dip;

public class Main
{
    public static void main(String[] args)
    {
        ReportGenerator mysqlReport=new ReportGenerator(new MySQLDatabase());
        mysqlReport.generateReport();

        ReportGenerator mongoReport=new ReportGenerator(new MongoDatabase());
        mongoReport.generateReport();
    }
}
