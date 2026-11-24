package dip;

public class MongoDatabase implements DataSource
{
    public String fetchData()
    {
        return "Sample data from MongoDB.";
    }
}
