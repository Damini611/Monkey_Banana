package com.sdp.monkeybanana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class MonkeyMoveTimer implements ActionListener{
	Timer timer;
	int timerCount = 1;
	MonkeyBananaGameController g;
	
	public MonkeyMoveTimer(MonkeyBananaGameController g){
		this.g = g;
		timer = new Timer(MonkeyBananaGameController.MONKEY_TIMER_TICKER_VALUE, this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(timerCount == MonkeyBananaGameController.MONKEY_TIMER_VALUE){
			this.stop();
			this.g.stopBananaTimer();
		}else{
			timerCount++;
		}
	}
	
	public void start(){
		timer.start();
	}
	
	public void stop(){
		timerCount = 1;
		timer.stop();
	}

}

