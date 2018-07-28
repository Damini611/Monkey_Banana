package com.sdp.monkeybanana;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Monkey {
	private Random randomNumberGenerator;
	
	public int monkeyX=0;
	public int monkeyY=0;
	
	public BufferedImage monkey = null;
	
	public Monkey(){
		randomNumberGenerator = new Random();
		try {
			monkey = ImageIO.read(this.getClass().getResource("/resources/images/monkey.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public BufferedImage getMonkeyImage(){
		return monkey;
	}
	
	public void setRandomBananaPosition(){
		monkeyX = randomNumberGenerator.nextInt(
		    		MonkeyBananaGameController.ROW_COL_COUNT);
		monkeyY = randomNumberGenerator.nextInt(
					MonkeyBananaGameController.ROW_COL_COUNT-1)+1;
	}
}
