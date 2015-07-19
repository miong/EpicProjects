package common.testProject.ipojoPart;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Launcher_Launcher {

	public static void main(String[] args) {
		System.out.println("STARTING IPOJO SERVICES LAUNCHER");

		try {
			
			byte[] buffer = new byte[512];
			
			String cmd = "java -jar ./bin/felix.jar";
			Process proc = Runtime.getRuntime().exec(cmd, null, new File("./osgi"));
			InputStream inStream = proc.getInputStream();
			InputStream errStream = proc.getErrorStream();
			OutputStream outStream = proc.getOutputStream();
			Thread.sleep(000);
			outStream.write("lb".getBytes());
			outStream.flush();
			Thread.sleep(2000);
			while (inStream.available() > 0) {
				inStream.read(buffer);
				System.out.print("out:  " + new String(buffer));
			}
			System.out.println("-------------------------");
			while (errStream.available() > 0) {
				errStream.read(buffer);
				System.out.print("err:  " + new String(buffer));
			}
			System.out.println("-------------------------");
			System.out.println("END OF LAUNCHER - TO KILL IPOJO USE WINDOWS TASK MANAGER");
			proc.waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
