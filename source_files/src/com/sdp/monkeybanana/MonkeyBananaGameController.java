package com.sdp.monkeybanana;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class MonkeyBananaGameController implements KeyListener {
	
	public boolean START_GAME;
	public static final int TOTAL_NUMBER_OF_BANANAS_TO_BE_EATEN = 10;
	public boolean END_GAME;
	public static final int ROW_COL_COUNT = 10;
	
	public String gameOver;
	public static final int BANANA_TIMER_TICKER_VALUE = 1000;
	public static final int BANANA_TIMER_VALUE = 7;

	public DisplayBackground backgroundPanel;
	public static final int MONKEY_TIMER_TICKER_VALUE = 100;
	public static final int MONKEY_TIMER_VALUE = 1;
	
	public State state;

	public int score;
	public int banana_displayed_count;
	
	private JFrame gameFrame;
	public BananaAppearTimer bananaTimer;

	public MonkeyMoveDelay mvd = new MonkeyMoveDelay(this);
	
	public static Monkey mnky;
	public static Banana banana;
	
	public MonkeyBananaGameController(){
		
		mnky = new Monkey();
		banana = new Banana();
		
		START_GAME = true;
		gameOver = "LOOSE";
		END_GAME = false;
		
		gameFrame = new JFrame("Wonder Land");
		gameFrame.addKeyListener(this);
		gameFrame.setSize(510,560);
		Dimension sc = Toolkit.getDefaultToolkit().getScreenSize();
		gameFrame.setLocation(sc.width/2 - gameFrame.getWidth()/2, sc.height/2
	    		- gameFrame.getHeight()/2);
	    backgroundPanel = new DisplayBackground(this);
	    gameFrame.add(backgroundPanel);
	    gameFrame.setVisible(true); 
	    gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    state = new StartBananaTimer();
	    bananaTimer = new BananaAppearTimer(this);
	    
	    mnky.setRandomBananaPosition();
	}
	
	public void startGame(){
		state = state.start(this);
	}
	
	public void stopGame(){
		state = state.stop(this);
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		state = state.releaseKey(this);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(START_GAME){
			score = 0;
			
			START_GAME = false;
			
			banana_displayed_count = 0;
			
			this.startGame();
			return;
		}
		
		state = state.keyPressed(this, e.getKeyCode());
		
		
	}
	
	public void stopBananaAppearTimer(){
		this.stopGame();
		this.startGame();
	}
	
	public void repaint(){
		backgroundPanel.repaint();
	}
	
	public static void main(String[] args){
		new MonkeyBananaGameController();
	}

}
