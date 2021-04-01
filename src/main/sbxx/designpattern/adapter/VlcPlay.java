package main.sbxx.designpattern.adapter;

/**
 * @author Dair
 * @since
 */
public class VlcPlay  implements AdvancedMediaPlayer{
	@Override
	public void playMp3() {
	
	}
	
	@Override
	public void playVlc() {
		System.out.println("play vlc....");
	}
}
