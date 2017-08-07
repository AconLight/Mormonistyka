package com.redarted.mormonistyka.game;

import com.badlogic.gdx.Gdx;
import com.redarted.mormonistyka.screen.ViewInputHandler;
import com.redarted.mormonistyka.screen.World;

public class GameInputHandler extends ViewInputHandler{

	public GameInputHandler(World world) {
		super(world);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean keyDown(int keycode) {
		Gdx.app.log("GameInputHandler", "key down");
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
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
