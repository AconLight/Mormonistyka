package com.redarted.mormonistyka.game;

import com.redarted.mormonistyka.objects.SpriteObject;
import com.redarted.mormonistyka.screen.World;

public class GameWorld extends World{
	SpriteObject asd;
	public GameWorld() {
		asd = new SpriteObject(20, 20, null, 0);
		asd.addTexture("badlogic.jpg");
		
		addGameObject(asd);
	}
	
	@Override
	public void update(float delta) {
		super.update(delta);		
	}
}
