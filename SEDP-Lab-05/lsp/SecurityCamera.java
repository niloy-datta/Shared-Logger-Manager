package lsp;

public class SecurityCamera extends MediaDevice implements VideoRecordable
{
    public SecurityCamera()
    {
        super("Security Camera");
    }

    public void recordVideo()
    {
        System.out.println(getName()+" is recording video.");
    }
}
