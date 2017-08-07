package com.redarted.mormonistyka.screen;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class MyView {
	
	protected OrthographicCamera camera;
	
	private SpriteBatch batch;
	
	private ShapeRenderer sr;
	
	private Viewport viewport;
	
	public ViewInputHandler viewInputHandler;
	
	public MyView(int x, int y, int width, int height, World world) {
		viewInputHandler = new ViewInputHandler(world);
		camera = new OrthographicCamera();
		camera.setToOrtho(false, width, height);
		viewport = new ScreenViewport();
		viewport.setWorldSize(width, height);
		viewport.setCamera(camera);
		viewport.setScreenSize(width, height);
		batch = new SpriteBatch();
		batch.setProjectionMatrix(camera.combined);
		sr = new ShapeRenderer();
		sr.setProjectionMatrix(camera.combined);
	}
	
	public SpriteBatch getBatch() {
		return batch;
	}
	
	public ShapeRenderer getShapeRenderer() {
		return sr;
	}
	
	public OrthographicCamera getCamera() {
		return camera;
	}
	
	public ViewInputHandler getViewInputHandler() {
		return viewInputHandler;
	}
}
