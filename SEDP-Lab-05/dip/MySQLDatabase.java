package dip;

public class MySQLDatabase implements DataSource
{
    public String fetchData()
    {
        return "Sample data from MySQL.";
    }
}
