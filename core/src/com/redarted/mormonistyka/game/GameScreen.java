package com.redarted.mormonistyka.game;

import com.redarted.mormonistyka.screen.MyScreen;
import com.redarted.mormonistyka.screen.ScreenRenderer;

public class GameScreen extends MyScreen{

	public GameScreen(int width, int height, int priority) {
		super(width, height, priority);
		world = new GameWorld();
		screenRenderer = new ScreenRenderer(world, camera);
	}

}
