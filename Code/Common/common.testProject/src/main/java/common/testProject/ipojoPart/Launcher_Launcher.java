package common.testProject.ipojoPart;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import common.testProject.gdxPart.GameModel;

public class Launcher_Launcher {

	public static void main(String[] args) {
		System.out.println("STARTING IPOJO SERVICES LAUNCHER");

		try {
			OPENGL_THREAD = Thread.currentThread();
			final byte[] buffer = new byte[512];

			File cacheDir = new File("./osgi/felix-cache");
			suppressDir(cacheDir);
			String cmd = "java -jar ./bin/felix.jar";
			Process proc = Runtime.getRuntime().exec(cmd, null, new File("./osgi"));
			final InputStream inStream = proc.getInputStream();
			final InputStream errStream = proc.getErrorStream();
			new Thread(new Runnable() {

				public void run() {
					// TODO Auto-generated method stub
					while (true) {
						try {
							Thread.sleep(500);
							if (inStream.available() > 0) {
								int readed = inStream.read(buffer);								
								System.out.print(new String(buffer,0,readed));
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}).start();
			new Thread(new Runnable() {

				public void run() {
					// TODO Auto-generated method stub
					while (true) {
						try {
							Thread.sleep(500);
							if (errStream.available() > 0) {
								int readed = inStream.read(buffer);								
								System.err.print(new String(buffer,0,readed));
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}).start();
			Thread.sleep(10000);
			System.out.println("-------------------------");
			System.out.println("END OF LAUNCHER - KILLING OSGI SERVER");
			proc.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void suppressDir(File cacheDir) {
		if (cacheDir.isDirectory()) {
			for (File file : cacheDir.listFiles()) {
				suppressDir(file);
			}
		}
		cacheDir.delete();
		System.out.println(cacheDir.getAbsolutePath() + " deleted [" + !cacheDir.exists() + "]");
	}

	/** The openGL thread. */
	public static Thread OPENGL_THREAD;

}
