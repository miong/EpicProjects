package common.testProject.ipojoPart;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Requires;
import org.apache.felix.ipojo.annotations.Validate;

/**
 * Fake an other service.
 * @author Bubul
 *
 */
@Component
@Instantiate
public class Other_Services {

	
	
	/**
	 * Method called when the service starts.
	 */
	@Validate
	void osgiStart()
	{
		new Thread(new Runnable() {
			
			public void run() {
				System.out.println("Say Hello ?");
				_helloService.printHello();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Say Goodbye ?");
				_helloService.printGoodBye();
			}
		}).start();
	}
	
	
	/** the hello service instance. */
	@Requires
	private HELLO_ServiceInterface _helloService;
}
