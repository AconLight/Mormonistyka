package com.redarted.mormonistyka.game;

import com.redarted.mormonistyka.screen.MyScreen;
import com.redarted.mormonistyka.screen.MyView;
import com.redarted.mormonistyka.screen.ScreenInputHandler;
import com.redarted.mormonistyka.screen.ScreenRenderer;

public class GameScreen extends MyScreen{

	public GameScreen(int width, int height, int priority) {
		super(width, height, priority);
		world = new GameWorld();
		myViews.add(new MyView(0, 0, width, height, world));
		myViews.get(0).viewInputHandler = new GameInputHandler(world);
		screenRenderer = new ScreenRenderer(world, myViews);
	}

}
