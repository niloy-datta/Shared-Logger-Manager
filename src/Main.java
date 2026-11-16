public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread t1=new Thread(()->
        {
            LoggerManager.getInstance().logMessage("Thread 1 message");
        });

        Thread t2=new Thread(()->
        {
            LoggerManager.getInstance().logMessage("Thread 2 message");
        });

        Thread t3=new Thread(()->
        {
            LoggerManager.getInstance().logMessage("Thread 3 message");
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        LoggerManager.getInstance().displayLogs();
    }
}
