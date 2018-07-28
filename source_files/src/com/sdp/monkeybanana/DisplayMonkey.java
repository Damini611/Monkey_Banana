package com.sdp.monkeybanana;

import java.awt.event.KeyEvent;

public class DisplayMonkey extends EndBananaTimer {
	
	public State keyPressed(MonkeyBananaGameController g,int keyCode){
		switch(keyCode){
			case KeyEvent.VK_LEFT:
				if(g.mnky.monkeyX>0){
					g.mnky.monkeyX--;
				    return new MonkeyMoves();
				}
				break;
				
			case KeyEvent.VK_RIGHT:
				if(g.mnky.monkeyX<MonkeyBananaGameController.ROW_COL_COUNT-1){
					g.mnky.monkeyX++;
				    return new MonkeyMoves();
				}
				break;
				
			case KeyEvent.VK_UP:
				if(g.mnky.monkeyY>1){
					g.mnky.monkeyY--;;
				    return new MonkeyMoves();
				}
				break;
				
			case KeyEvent.VK_DOWN:
				if(g.mnky.monkeyY<=MonkeyBananaGameController.ROW_COL_COUNT-1){
					g.mnky.monkeyY++;
				    return new MonkeyMoves();
				}
				break;
				
		}
		return this;
		
	}
	
	public State stop(MonkeyBananaGameController g){
		return super.stop(g);
	}
}
