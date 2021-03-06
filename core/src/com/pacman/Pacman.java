package com.pacman;

import com.badlogic.gdx.InputProcessor;

/**
 * Created by Joel on 4/18/17.
 */
public class Pacman extends Entity implements InputProcessor
{
	public Pacman(int hPos, int vPos, boolean isMoving)
	{
		super(hPos, vPos, isMoving);
	}

	/**
	 * Called when a key was pressed
	 *
	 * @param keycode one of the constants in Input.Keys
	 * @return whether the input was processed
	 */
	@Override
	public boolean keyDown(int keycode)
	{
		setDirection(keycode);

		return true;
	}

	/**
	 * Called when a key was released
	 *
	 * @param keycode one of the constants in Input.Keys
	 * @return whether the input was processed
	 */
	@Override
	public boolean keyUp(int keycode)
	{
//		if (Gdx.input.isKeyPressed(LEFT) && keycode != LEFT)
//			move(LEFT);
//		else if  (Gdx.input.isKeyPressed(RIGHT) && keycode != RIGHT)
//			move(RIGHT);
//		else if (Gdx.input.isKeyPressed(UP) && keycode != UP)
//			move(UP);
//		else if (Gdx.input.isKeyPressed(DOWN) && keycode != DOWN)
//			move(DOWN);
//		else
//			move(0);
//
		return false;
	}

	/**
	 * Called when a key was typed
	 *
	 * @param character The character
	 * @return whether the input was processed
	 */
	@Override
	public boolean keyTyped(char character)
	{
		return false;
	}

	/**
	 * Called when the screen was touched or a mouse button was pressed. The button parameter will be Buttons#LEFT on iOS.
	 *
	 * @param screenX The x coordinate, origin is in the upper left corner
	 * @param screenY The y coordinate, origin is in the upper left corner
	 * @param pointer the pointer for the event.
	 * @param button  the button
	 * @return whether the input was processed
	 */
	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button)
	{
		return false;
	}

	/**
	 * Called when a finger was lifted or a mouse button was released. The button parameter will be Buttons#LEFT on iOS.
	 *
	 * @param screenX
	 * @param screenY
	 * @param pointer the pointer for the event.
	 * @param button  the button   @return whether the input was processed
	 */
	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button)
	{
		return false;
	}

	/**
	 * Called when a finger or the mouse was dragged.
	 *
	 * @param screenX
	 * @param screenY
	 * @param pointer the pointer for the event.  @return whether the input was processed
	 */
	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer)
	{
		return false;
	}

	/**
	 * Called when the mouse was moved without any buttons being pressed. Will not be called on iOS.
	 *
	 * @param screenX
	 * @param screenY
	 * @return whether the input was processed
	 */
	@Override
	public boolean mouseMoved(int screenX, int screenY)
	{
		return false;
	}

	/**
	 * Called when the mouse wheel was scrolled. Will not be called on iOS.
	 *
	 * @param amount the scroll amount, -1 or 1 depending on the direction the wheel was scrolled.
	 * @return whether the input was processed.
	 */
	@Override
	public boolean scrolled(int amount)
	{
		return false;
	}
}
