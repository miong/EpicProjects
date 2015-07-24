package common.testProject.ipojoPart;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Invalidate;
import org.apache.felix.ipojo.annotations.Provides;
import org.apache.felix.ipojo.annotations.Validate;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import common.testProject.gdxPart.GameModel;


/**
 * The hello services provider.
 * 
 * @author Bubul
 *
 */
@Component
@Provides
@Instantiate
public class Hello_Service implements HELLO_ServiceInterface {

	/**
	 * 
	 */
	public void printHello() {
		System.out.println("Hello_Service:  Hello dear user !!! I'm an IPOJO service.");
	}

	/**
	 * 
	 */
	public void printGoodBye() {
		System.out.println("Hello_Service:  GoodBye!.");
	}

}
