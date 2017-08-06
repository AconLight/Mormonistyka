package com.redarted.mormonistyka;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.redarted.mormonistyka.game.GameScreen;
import com.redarted.mormonistyka.game.GameWorld;
import com.redarted.mormonistyka.game.InputHandler;
import com.redarted.mormonistyka.screen.Consts;

public class MormonistykaGame extends ApplicationAdapter {
	private GameScreen gameScreen;
	
	@Override
	public void create () {
		gameScreen = new GameScreen(Consts.screenWidth, Consts.screenHeight);
		Gdx.input.setInputProcessor(new InputHandler((GameWorld)gameScreen.getWorld()));
		Gdx.gl.glClearColor(240f/256, 240f/256, 240f/256, 1);
		
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gameScreen.update(0.01f);//Gdx.graphics.getDeltaTime());
		gameScreen.update(0.01f);
		gameScreen.update(0.01f);
		gameScreen.render();
	}
	
	@Override
	public void dispose () {
		
	}
}
