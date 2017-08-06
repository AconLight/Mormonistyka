package com.redarted.mormonistyka.game;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;

public class InputHandler implements InputProcessor{

	private GameWorld world;
	public InputHandler(GameWorld world) {
		this.world = world;
	}
	
	@Override
	public boolean keyDown(int keycode) {
		
		switch(keycode) {
		case Keys.Q: {
			
			break;
		}
		case Keys.E: {
			
			break;
		}
		case Keys.A: {
			
			break;
		}
		case Keys.D: {
			
			break;
		}
		case Keys.SPACE: {
			
			break;
		}
		case Keys.F: {
			
			break;
		}
		}
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {

		switch(keycode) {
		case Keys.A: {
			
			break;
		}
		case Keys.D: {
			
			break;
		}
		}
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
