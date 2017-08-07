package com.redarted.mormonistyka.screen;

import java.util.ArrayList;

import com.badlogic.gdx.InputProcessor;

public class ScreenInputHandler implements InputProcessor{

	private boolean isActive;
	
	private ArrayList<MyView> myViews;
	
	public ScreenInputHandler(ArrayList<MyView> myViews) {
		this.myViews = myViews;
	}
	
	@Override
	public boolean keyDown(int keycode) {
		for(MyView s : myViews) {
			s.getViewInputHandler().keyDown(keycode);
		}
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		for(MyView s : myViews) {
			s.getViewInputHandler().keyUp(keycode);
		}
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		for(MyView s : myViews) {
			s.getViewInputHandler().keyTyped(character);
		}
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		for(MyView s : myViews) {
			s.getViewInputHandler().touchDown(screenX, screenY, pointer, button);
		}
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		for(MyView s : myViews) {
			s.getViewInputHandler().touchUp(screenX, screenY, pointer, button);
		}
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		for(MyView s : myViews) {
			s.getViewInputHandler().touchDragged(screenX, screenY, pointer);
		}
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		for(MyView s : myViews) {
			s.getViewInputHandler().mouseMoved(screenX, screenY);
		}
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		for(MyView s : myViews) {
			s.getViewInputHandler().scrolled(amount);
		}
		return false;
	}

}
