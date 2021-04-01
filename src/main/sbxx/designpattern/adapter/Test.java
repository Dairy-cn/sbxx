package main.sbxx.designpattern.adapter;

/**
 * @author Dair
 * @since
 */
public class Test {
	
	public static void main(String[] args) {
		AudioPlay audioPlay=new AudioPlay();
		audioPlay.play("mp3","喜洋洋.mp3");
		audioPlay.play("mp4","alone.mp3");
		audioPlay.play("vlc","mind me.mp3");
		audioPlay.play("avi","成都.mp3");
	}
	
}
