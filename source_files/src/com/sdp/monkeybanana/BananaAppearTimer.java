package com.sdp.monkeybanana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class BananaAppearTimer implements ActionListener{
	Timer timer;
	int timerCount;
	MonkeyBananaGameController g;
	
	public BananaAppearTimer(MonkeyBananaGameController g){
		this.g = g;
		timerCount = 1;
		timer = new Timer(MonkeyBananaGameController.BANANA_TIMER_TICKER_VALUE, this);
	}
	
	public void start(){
		timer.start();
	}
	
	public void stop(){
		timerCount = 1;
		timer.stop();
		g.stopBananaAppearTimer();
	}
	
	public void stopTimer(){
		timerCount = 1;
		timer.stop();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		g.backgroundPanel.repaint();
		
		if(timerCount == MonkeyBananaGameController.BANANA_TIMER_VALUE){
			timerCount = 1;
			this.stop();
		}else{
			timerCount++;
		}
	}

}
