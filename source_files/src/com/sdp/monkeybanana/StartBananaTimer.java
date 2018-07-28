package com.sdp.monkeybanana;

import java.util.Random;

public class StartBananaTimer extends State {
	
	public State start(MonkeyBananaGameController g){
		
		g.banana.setRandomBananaPosition();
		
		g.banana_displayed_count++;
		g.bananaTimer.start();
		
		DisplayMonkey display = new DisplayMonkey();
		g.repaint();
		
		return display;
	}
}
