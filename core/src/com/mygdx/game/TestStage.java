package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

/**
 * Created by white on 2017/3/24.
 */
public class TestStage extends Stage {
    Image image;
    public TestStage(final AdListener adListener) {
        super();
        Texture img = new Texture("badlogic.jpg");
        image = new Image(img);
        image.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Gdx.app.log("app", "点击");
                if (adListener!=null) adListener.openAd();
                super.clicked(event, x, y);
            }
        });
        addActor(image);
        Gdx.input.setInputProcessor(this);
    }

}
