package com.redarted.mormonistyka.myobjects;

import com.badlogic.gdx.math.Vector2;
import com.redarted.mormonistyka.objects.GameObject;
import com.redarted.mormonistyka.objects.SpriteObject;

public class Box extends PassiveObject{

	SpriteObject sprite;
	
	float time;
	
	public Box(float x, float y, GameObject parent, int id) {
		super(x, y, parent, id);
		time = 0;
		// TODO Auto-generated constructor stub
		sprite = new SpriteObject(0, 0, this, 0); 
		sprite.addTexture("badlogic.jpg"); 
		
		//sprite.setPosition(new Vector2(9, 0));
		addSprite(sprite);

	}
	
	public void updateLast(float delta, float vx, float vy) {
		super.updateLast(delta, vx, vy);
		
		
		time += delta;
		if(delta >=5){
			
		}
		
	}
	
}

