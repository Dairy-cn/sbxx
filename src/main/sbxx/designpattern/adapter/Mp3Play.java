package main.sbxx.designpattern.adapter;

/**
 * @author Dair
 * @since
 */
public class Mp3Play  implements AdvancedMediaPlayer{
	@Override
	public void playMp3() {
		System.out.println("mp3 .....");
	}
	
	@Override
	public void playVlc() {
	
	}
}
