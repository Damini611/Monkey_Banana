package com.sdp.monkeybanana;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Banana {
	private Random randomNumberGenerator;
	
	public int bananaX=0;
	public int bananaY=0;
	
	public BufferedImage banana = null;
	
	public Banana(){
		randomNumberGenerator = new Random();
		try {
			banana = ImageIO.read(this.getClass().getResource("/resources/images/banana.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public BufferedImage getBananaImage(){
		return banana;
	}
	
	public void setRandomBananaPosition(){
		bananaX = randomNumberGenerator.nextInt(
				MonkeyBananaGameController.ROW_COL_COUNT);
		bananaY = randomNumberGenerator.nextInt(
				MonkeyBananaGameController.ROW_COL_COUNT-1)+1;
		
		while(bananaX == MonkeyBananaGameController.mnky.monkeyX 
				&& bananaY == MonkeyBananaGameController.mnky.monkeyY ){
			
			bananaX = randomNumberGenerator.nextInt(
					MonkeyBananaGameController.ROW_COL_COUNT);
			bananaY = randomNumberGenerator.nextInt(
					MonkeyBananaGameController.ROW_COL_COUNT-1)+1;
			
		}
	}
}
