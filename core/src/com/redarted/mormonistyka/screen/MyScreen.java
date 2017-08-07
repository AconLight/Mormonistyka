package com.redarted.mormonistyka.screen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.redarted.mormonistyka.game.ScreenInputHandler;

public class MyScreen implements Screen{
	
	private Viewport viewport;
	
	private ScreenInputHandler screenInputHandler;
	
	private int priority;
	
	public static final int priorityRange = 5;

	protected OrthographicCamera camera;
	
	protected ScreenRenderer screenRenderer;
	
	protected World world;
	
	public MyScreen(int width, int height, int priority) {
		this.priority = priority;
		camera = new OrthographicCamera();
		camera.setToOrtho(false, width, height);
		viewport = new ScreenViewport();
		viewport.setWorldSize(width, height);
		viewport.setCamera(camera);
		viewport.setScreenSize(width, height);
		world = new World();
		screenRenderer = new ScreenRenderer(world, camera);
	}
	
	public World getWorld() {
		return world;
	}
	
	public void update(float delta) {
		world.update(delta);
	}

	public OrthographicCamera getCamera() {
		return camera;
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
