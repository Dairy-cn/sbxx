package main.sbxx.designpattern.adapter;

/**
 * @author Dair
 * @since
 */
public class AudioPlay implements MediaPlayer {
	
	MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp4")) {
			System.out.println("mp4 play ....");
		} else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp3")) {
			MediaAdapter mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println(audioType+"file not supported");
		}
	}
}
