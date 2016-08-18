package modelo;

import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MeuPlayer {
	
	public static void reproduza(String arquivo){
			
		AudioInputStream audioIn;
		try {
			audioIn = AudioSystem.getAudioInputStream(
						MeuPlayer.class.getResource(arquivo)
						);
			
			Clip mediaPlayer = AudioSystem.getClip();
			mediaPlayer.open(audioIn);
			mediaPlayer.start();
			
		} catch (UnsupportedAudioFileException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
