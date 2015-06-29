package common.testProject;

import javax.swing.Popup;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.loaders.TextureAtlasLoader;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.Window;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;


public class Screen implements com.badlogic.gdx.Screen{

	public Screen() {
		TexturePacker.process(Gdx.files.internal("img").path(), Gdx.files.internal("packed").path(), "pack.atlas");
		TextureAtlas atlas = new TextureAtlas(Gdx.files.internal("packed/pack.atlas"));
		skin = new Skin(Gdx.files.internal("res/pack.json"),atlas);
		stage = new Stage();
		mainTable = new Table(skin);
		mainTable.setFillParent(true);
		tex = new Texture(Gdx.files.internal("img/test.png"));
		
	}
	
	public void dispose() {
		tex.dispose();
		stage.dispose();
		
	}

	public void hide() {
		stage.clear();
		
	}

	public void pause() {
		// TODO Auto-generated method stub
		
	}

	public void render(float arg0) {
		Gdx.gl.glClearColor(0,0,0,1); //sets clear color to black
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); //clear the batch
        stage.act(); //update all actors
        stage.draw(); //draw all actors on the Stage.getBatch()
		
	}

	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	public void resume() {
		// TODO Auto-generated method stub
		
	}

	public void show() {
		mainTable.add(new Image(tex)).fill().expand().row();
		final Label label = new Label("This is a demo of libgdx for Epic Projects", skin);
		mainTable.add(label).row();
		mainTable.setTouchable(Touchable.childrenOnly);
		final TextButton button = new TextButton("Button lol", skin);
		button.setDisabled(false);
		button.setDebug(true, true);
		button.setTouchable(Touchable.enabled);
		mainTable.add(button).fill().expand();
		button.addListener(new ClickListener(){
			@Override
			public void clicked(InputEvent event, float x, float y) {
				System.out.println("CLICKED");
				label.setVisible(!label.isVisible());
			}
		});
		label.addListener(new ClickListener(){
			@Override
			public void clicked(InputEvent event, float x, float y) {
				System.out.println("CLICKED");
				button.setVisible(!button.isVisible());
			}
		});
		stage.addActor(mainTable);
	}
	
	Stage stage;
	Table mainTable;
	Texture tex;
	Skin skin;

}
