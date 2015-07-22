package common.testProject.gdxPart;

import com.badlogic.gdx.Game;

/**
 * Game Model to start the test game.
 * @author Bubul
 *
 */
public class GameModel extends Game{

	/**
	 *The width of the game window.
	 */
	public static final int WIDTH = 800;

	/**
	 *The height of the game window.
	 */
	public static final int HEIGHT = 400;

	public void create() {
		setScreen(new Screen());
	}

}
