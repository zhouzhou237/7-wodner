package music.code;

import java.io.FileInputStream;
import sun.audio.*;

public class ButtonClick1 {
    public void playMusic()
{
	try {
		FileInputStream fileau=new FileInputStream("C:\\Users\\zhouz\\Desktop\\7 wonders\\src\\music\\按钮音效\\按钮点击1.wav" );
		AudioStream as=new AudioStream(fileau);
		AudioPlayer.player.start(as);
	}catch (Exception e){
		e.printStackTrace();
	}
}
}
