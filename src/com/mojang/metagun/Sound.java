
package com.mojang.metagun;

import com.badlogic.gdx.Gdx;

public class Sound {

	public static com.badlogic.gdx.audio.Sound boom;
	public static com.badlogic.gdx.audio.Sound hit;
	public static com.badlogic.gdx.audio.Sound splat;
	public static com.badlogic.gdx.audio.Sound launch;
	public static com.badlogic.gdx.audio.Sound pew;
	public static com.badlogic.gdx.audio.Sound oof;
	public static com.badlogic.gdx.audio.Sound gethat;
	public static com.badlogic.gdx.audio.Sound death;
	public static com.badlogic.gdx.audio.Sound startgame;
	public static com.badlogic.gdx.audio.Sound jump;

	public static void load () {
		boom = load("res2/boom.wav");
		hit = load("res2/hit.wav");
		splat = load("res2/splat.wav");
		launch = load("res2/launch.wav");
		pew = load("res2/pew.wav");
		oof = load("res2/oof.wav");
		gethat = load("res2/gethat.wav");
		death = load("res2/death.wav");
		startgame = load("res2/startgame.wav");
		jump = load("res2/jump.wav");
	}

	private static com.badlogic.gdx.audio.Sound load (String name) {
		return Gdx.audio.newSound(Gdx.files.internal(name));
	}
}
