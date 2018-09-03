package tetris3;

import java.awt.event.KeyEvent;

import tetris3.Tetris;

public class DownThread extends Thread{
	Tetris frame;
	public DownThread(Tetris f){
		frame=f;
	}
	public void run() {
		while (true) {
			try {
				sleep(300);
			} catch (InterruptedException e) { }
			frame.keyProcess(KeyEvent.VK_DOWN);
		}
		
	}
}

