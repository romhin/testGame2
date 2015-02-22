
package com.mojang.metagun;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Art {
	public static TextureRegion[][] guys;
	public static TextureRegion[][] player1;
	public static TextureRegion[][] player2;
	public static TextureRegion[][] walls;
	public static TextureRegion[][] gremlins;
	public static TextureRegion bg;
	public static Pixmap level;
	public static TextureRegion titleScreen;
	public static TextureRegion shot;
	public static TextureRegion[][] buttons;

	public static TextureRegion winScreen1;
	public static TextureRegion winScreen2;
	
	public static void load () {
		bg = load("res2/background.png", 320, 240);
		//bg = load("background.png",320,240);
		level = new Pixmap(Gdx.files.internal("res2/levels.png"));
		titleScreen = load("res2/titlescreen.png", 320, 740);
		guys = split("res2/guys.png", 6, 6);
		player1 = split("res2/player.png", 16, 32);
		player2 = split("res2/player.png", 16, 32, true);
		walls = split("res2/walls.png", 10, 10);
		gremlins = split("res2/gremlins.png", 30, 30);
		buttons = split("res2/buttons.png", 32, 32);
		shot = new TextureRegion(guys[0][0].getTexture(), 3, 27, 2, 2);
		winScreen1 = load("res2/winscreen1.png", 320, 240);
		winScreen2 = load("res2/winscreen2.png", 320, 240);
	}

	private static TextureRegion[][] split (String name, int width, int height) {
		return split(name, width, height, false);
	}

	private static TextureRegion[][] split (String name, int width, int height, boolean flipX) {
		Texture texture = new Texture(Gdx.files.internal(name));
		int xSlices = texture.getWidth() / width;
		int ySlices = texture.getHeight() / height;
		TextureRegion[][] res = new TextureRegion[xSlices][ySlices];
		for (int x = 0; x < xSlices; x++) {
			for (int y = 0; y < ySlices; y++) {
				res[x][y] = new TextureRegion(texture, x * width, y * height, width, height);
				res[x][y].flip(flipX, true);
			}
		}
		return res;
	}

	public static TextureRegion load (String name, int width, int height) {
		Texture texture = new Texture(Gdx.files.internal(name));
		TextureRegion region = new TextureRegion(texture, 0, 0, width, height);
		region.flip(false, true);
		return region;
	}
}
