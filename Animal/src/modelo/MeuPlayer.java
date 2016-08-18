package modelo;

import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MeuPlayer extends Thread {
	
	private String arquivo;
	
	public MeuPlayer(String arquivo){
		this.arquivo = arquivo;
	}
	
	public void run(){
			
		AudioInputStream audioIn;
		try {
			audioIn = AudioSystem.getAudioInputStream(
				MeuPlayer.class.getResource(arquivo)
			);
			
			Clip mediaPlayer = AudioSystem.getClip();
			mediaPlayer.open(audioIn);
			mediaPlayer.start();
			
			sleep(1000);
			
		} catch (UnsupportedAudioFileException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
