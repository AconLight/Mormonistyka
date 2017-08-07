package com.redarted.mormonistyka;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.redarted.mormonistyka.game.GameScreen;
import com.redarted.mormonistyka.game.GameWorld;
import com.redarted.mormonistyka.screen.Consts;
import com.redarted.mormonistyka.screen.InputHandler;
import com.redarted.mormonistyka.screen.MyScreen;

public class MormonistykaGame extends ApplicationAdapter {
	private ArrayList<MyScreen> screens;
	private TiledMap map;
	@Override
	public void create () {
		screens = new ArrayList<MyScreen>();
		screens.add(new GameScreen(Consts.screenWidth, Consts.screenHeight, 0));
		Gdx.input.setInputProcessor(new InputHandler(screens));
		Gdx.gl.glClearColor(240f/256, 240f/256, 240f/256, 1);
		
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		for (MyScreen s : screens) {
			s.render(Gdx.graphics.getDeltaTime());
		}
	}
	
	@Override
	public void dispose () {
		
	}
}
