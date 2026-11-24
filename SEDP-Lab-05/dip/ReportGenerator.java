package dip;

public class ReportGenerator
{
    private final DataSource dataSource;

    public ReportGenerator(DataSource dataSource)
    {
        this.dataSource=dataSource;
    }

    public void generateReport()
    {
        System.out.println("Report: "+dataSource.fetchData());
    }
}
