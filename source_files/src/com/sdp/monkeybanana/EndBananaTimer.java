package com.sdp.monkeybanana;

public class EndBananaTimer extends State {
	
	public State stop(MonkeyBananaGameController g){
		if(g.banana_displayed_count == MonkeyBananaGameController.TOTAL_NUMBER_OF_BANANAS_TO_BE_EATEN && !g.END_GAME){
			g.END_GAME = true;
			setgameOver(g);
			g.backgroundPanel.repaint();
		}
		g.bananaTimer.stopTimer();
		return new StartBananaTimer();
	}
	
	public void setgameOver(MonkeyBananaGameController g){
		if(g.score == MonkeyBananaGameController.TOTAL_NUMBER_OF_BANANAS_TO_BE_EATEN){
			g.gameOver = "WON";
		}else{
			g.gameOver = "LOOSE";
		}
	}
}
