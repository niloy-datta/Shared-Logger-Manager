package lsp;

public abstract class MediaDevice
{
    private final String name;

    protected MediaDevice(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }
}
