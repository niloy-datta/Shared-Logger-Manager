package lsp;

import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        AudioPlayable speaker=new BasicSpeaker();
        speaker.playAudio();

        List<VideoRecordable> devices=Arrays.asList(new SecurityCamera(),new SecurityCamera());

        for(VideoRecordable device:devices)
        {
            device.recordVideo();
        }
    }
}
