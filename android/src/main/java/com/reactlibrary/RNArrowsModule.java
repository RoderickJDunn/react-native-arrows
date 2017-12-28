
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNArrowsModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNArrowsModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNArrows";
    }

    @ReactMethod
    public void createArrow() {
        Log.d(REACT_CLASS, "Creating an arrow ");
    }
}