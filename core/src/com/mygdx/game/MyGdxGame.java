package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	AdListener adListener;
	TestStage testStage;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		testStage = new TestStage(adListener);

	}

	public void setAdListener(AdListener adListener) {
		this.adListener = adListener;
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		testStage.draw();
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
