package com.sdp.monkeybanana;

public class MonkeyMoves extends State {
	
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
		if(g.mnky.monkeyX == g.banana.bananaX){
			if(g.mnky.monkeyY == g.banana.bananaY){
			
				g.mvd.start();
			
				g.score = g.score + 1;
			
				return new MonkeyEatsBanana();
			}else{
				g.repaint();
				return  new DisplayMonkey();
			}
		}else{
			g.repaint();
			return  new DisplayMonkey();
		}
		
	}
}
