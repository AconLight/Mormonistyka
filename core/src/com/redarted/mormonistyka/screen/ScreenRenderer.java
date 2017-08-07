package com.redarted.mormonistyka.screen;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.redarted.mormonistyka.objects.GameObject;

public class ScreenRenderer {
	private ArrayList<MyView> myViews;
	private World world;
	public World getWorld() {
		return world;
	}

	
	public ScreenRenderer(World world, ArrayList<MyView> myViews) {
		this.myViews = myViews;
		this.world = world;
	}
	
	public void render() {
		
		for(MyView m : myViews) {
			m.getBatch().begin();
			m.getShapeRenderer().begin(ShapeType.Filled);
			for (int i = 0; i < GameObject.priorities; i++) {
				for (int j = 0; j < world.getGameObjects().size(); j++) {
					world.getGameObjects().get(j).render(m.getBatch(), i);
					world.getGameObjects().get(j).render(m.getShapeRenderer(), i);
				}
			}
			m.getBatch().end();
			m.getShapeRenderer().end();
		}
	}
}
