package common.testProject;

import com.badlogic.gdx.Game;

/**
 * Game Model to start the test game.
 * @author Bubul
 *
 */
public class GameModel extends Game{

	public static final int WIDTH = 800;
	public static final int HEIGHT = 400;

	public void create() {
		setScreen(new Screen());
	}

}
