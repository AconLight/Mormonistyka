package com.redarted.mormonistyka.screen;

import java.util.ArrayList;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;

public class InputHandler implements InputProcessor{

	private ArrayList<MyScreen> myScreens;
	
	public InputHandler(ArrayList<MyScreen> myScreens) {
		this.myScreens = myScreens;
	}
	
	@Override
	public boolean keyDown(int keycode) {
		for(MyScreen s : myScreens) {
			s.getScreenInputHandler().keyDown(keycode);
		}
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		for(MyScreen s : myScreens) {
			s.getScreenInputHandler().keyUp(keycode);
		}
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		for(MyScreen s : myScreens) {
			s.getScreenInputHandler().keyTyped(character);
		}
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		for(MyScreen s : myScreens) {
			s.getScreenInputHandler().touchDown(screenX, screenY, pointer, button);
		}
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		for(MyScreen s : myScreens) {
			s.getScreenInputHandler().touchUp(screenX, screenY, pointer, button);
		}
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		for(MyScreen s : myScreens) {
			s.getScreenInputHandler().touchDragged(screenX, screenY, pointer);
		}
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		for(MyScreen s : myScreens) {
			s.getScreenInputHandler().mouseMoved(screenX, screenY);
		}
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		for(MyScreen s : myScreens) {
			s.getScreenInputHandler().scrolled(amount);
		}
		return false;
	}

}
