package com.redarted.mormonistyka.screen;

import java.util.ArrayList;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class MyScreen implements Screen{
	
	protected ArrayList<MyView> myViews;
	
	protected ScreenInputHandler screenInputHandler;
	
	private int priority;
	
	public static final int priorityRange = 5;
	
	protected ScreenRenderer screenRenderer;
	
	protected World world;
	
	public MyScreen(int width, int height, int priority) {
		this.priority = priority;
		myViews = new ArrayList<MyView>();
		world = new World();
		screenRenderer = new ScreenRenderer(world, myViews);
		screenInputHandler = new ScreenInputHandler(myViews);
	}
	
	public ScreenInputHandler getScreenInputHandler() {
		return screenInputHandler;
	}
	
	public World getWorld() {
		return world;
	}
	
	public void update(float delta) {
		world.update(delta);
	}

	public OrthographicCamera getCamera() {
		return myViews.get(0).getCamera();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		update(delta);
		screenRenderer.render();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}


	
}
