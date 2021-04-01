package main.sbxx.designpattern.adapter;

/**
 * @author Dair
 * @since
 */
public class MediaAdapter implements MediaPlayer {
	
	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			this.advancedMediaPlayer = new VlcPlay();
		} else if (audioType.equalsIgnoreCase("mp3")) {
			this.advancedMediaPlayer = new Mp3Play();
		}
	}
	
	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer.playVlc();
		} else if (audioType.equalsIgnoreCase("mp3")) {
			advancedMediaPlayer.playMp3();
		}
	}
}
