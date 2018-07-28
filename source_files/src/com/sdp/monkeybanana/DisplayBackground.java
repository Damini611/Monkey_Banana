package com.sdp.monkeybanana;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class DisplayBackground extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MonkeyBananaGameController controller;
	
	public DisplayBackground(MonkeyBananaGameController g) {
		// TODO Auto-generated constructor stub
		controller = g;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		g.setColor(Color.decode("#006400"));
		g.fillRect(0,0,510,510);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Serif", Font.BOLD, 18));
		
		if(controller.START_GAME){
			g.setColor(Color.BLACK);
			g.fillRect(0,0,510,510);
			g.setColor(Color.WHITE);
			g.setFont(new Font("Serif", Font.BOLD, 18));
			g.drawString("            PRESS ANY KEY", 510/2-130, 510/2);
			return;
		}
		
		if(controller.END_GAME){
			if(controller.gameOver.equals("WON")){
				g.drawString("                  ACED IT !", 510/2-130, 510/2);
			}else{
				g.drawString("SORRY ! BETTER LUCK NEXT TIME !", 510/2-130, 510/2);
			}
			g.drawString("                    SCORE : "+controller.score, 510/2-130, 510/2+40);
			return;
		}
		
		g.drawString("BANANA TIMER : "+(MonkeyBananaGameController.BANANA_TIMER_VALUE-controller.bananaTimer.timerCount+1), 10, 20);
		g.drawString("GAME SCORE : "+controller.score, 510-180, 20);
		
		
		g.drawImage(controller.mnky.getMonkeyImage(),controller.mnky.monkeyX*50,controller.mnky.monkeyY*50,50,50,null,null);
		
		g.drawImage(controller.banana.getBananaImage(),controller.banana.bananaX*50,controller.banana.bananaY*50,50,50,null,null);
	}
	
}
