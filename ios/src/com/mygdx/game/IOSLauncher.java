package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.foundation.NSString;
import org.robovm.apple.uikit.UIApplication;

import com.badlogic.gdx.backends.iosrobovm.IOSApplication;
import com.badlogic.gdx.backends.iosrobovm.IOSApplicationConfiguration;
import org.robovm.apple.uikit.UIViewController;

public class IOSLauncher extends IOSApplication.Delegate implements AdListener {
    @Override
    protected IOSApplication createApplication() {
        IOSApplicationConfiguration config = new IOSApplicationConfiguration();
        MyGdxGame game = new MyGdxGame();
        game.setAdListener(this);
        UnityAds.initialize(new NSString("1359702"),this,true);
        return new IOSApplication(game, config);
    }

    public static void main(String[] argv) {
        NSAutoreleasePool pool = new NSAutoreleasePool();
        UIApplication.main(argv, null, IOSLauncher.class);
        pool.close();
    }

    @Override
    public void openAd() {
        UnityAds.show(getUIViewController());
    }


    private UIViewController getUIViewController() {
        return ((IOSApplication) Gdx.app).getUIViewController();
    }
}