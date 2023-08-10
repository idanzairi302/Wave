package playingWithFire;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class musicStuff {
	
	void playMusic(String musicLocation)
	{
		
		try 
		{
			File musicPath = new File(musicLocation);
			
			if(musicPath.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				clip.loop(Clip.LOOP_CONTINUOUSLY);
				
				//JOptionPane.showMessageDialog(null, "Press OK to Pause");
				//long clipTimePosition = clip.getMicrosecondPosition();
				//clip.stop();
				
				//JOptionPane.showMessageDialog(null, "Press OK to Resume");
				//clip.setMicrosecondPosition(clipTimePosition);
				//clip.start();
				
				//JOptionPane.showMessageDialog(null, "Press OK to stop playing");
			}
			else {
				System.out.println("can't find file");
			}
		}
		
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		
	}
	

}
