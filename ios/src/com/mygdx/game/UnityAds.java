package com.mygdx.game;

import com.badlogic.gdx.backends.iosrobovm.IOSApplication;
import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.foundation.NSString;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Library;

/**
 * Created by white on 2017/2/9.
 */
@Library(Library.INTERNAL)
@NativeClass
public class UnityAds extends NSObject{
    static {
        ObjCRuntime.bind(UnityAds.class);
    }
    @Method(selector = "initialize:delegate:testMode:")
    public static native void initialize(NSString gameId, IOSApplication.Delegate delegate, boolean testMode);

    @Method(selector = "show:")
    public static native void show(UIViewController viewController);

}
