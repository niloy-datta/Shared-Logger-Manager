package lsp;

public class BasicSpeaker extends MediaDevice implements AudioPlayable
{
    public BasicSpeaker()
    {
        super("Basic Speaker");
    }

    public void playAudio()
    {
        System.out.println(getName()+" is playing audio.");
    }
}
