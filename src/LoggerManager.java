import java.util.ArrayList;
import java.util.List;

public class LoggerManager
{
    private static volatile LoggerManager instance;
    private List<String>logRecords=new ArrayList<>();

    private LoggerManager()
    {
        System.out.println("Logger initialized.");
    }

    public static LoggerManager getInstance()
    {
        if(instance==null)
        {
            synchronized(LoggerManager.class)
            {
                if(instance==null)
                {
                    instance=new LoggerManager();
                }
            }
        }
        return instance;
    }

    public synchronized void logMessage(String message)
    {
        logRecords.add(message);
        System.out.println("Logged: "+message+" (total logs: "+logRecords.size()+")");
    }

    public synchronized void displayLogs()
    {
        for(String message:logRecords)
        {
            System.out.println(message);
        }
        logRecords.clear();
    }
}
