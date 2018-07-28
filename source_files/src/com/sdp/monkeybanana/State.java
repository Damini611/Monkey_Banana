package com.sdp.monkeybanana;

public abstract class State {
	
	public State keyPressed(MonkeyBananaGameController mbgc, int keyCode){
		return this;
		
	}
	
	public State start(MonkeyBananaGameController mbgc){
		return this;
		
	}
	
	public State stop(MonkeyBananaGameController mbgc){
		return this;
		
	}
	
	
	public State releaseKey(MonkeyBananaGameController mbgc){
		return this;
		
	}
	
}
