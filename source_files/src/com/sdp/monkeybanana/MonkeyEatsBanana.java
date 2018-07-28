package com.sdp.monkeybanana;

public class MonkeyEatsBanana extends EndBananaTimer {
	
	public State stop(MonkeyBananaGameController g){
		return super.stop(g);
	}
	
	public void left(){
		//To-Do
	}
	
	public void right(){
		//To-Do
	}
	
	public void middle(){
		//To-Do
	}

	
	public State releaseKey(MonkeyBananaGameController g){
		return new StartBananaTimer();
		
	}
}
