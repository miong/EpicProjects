package common.testProject;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	
	public static void main (String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width=GameModel.WIDTH; // sets window width
        config.height=GameModel.HEIGHT;  // sets window height
        new LwjglApplication(new GameModel(), config);
    }

}
