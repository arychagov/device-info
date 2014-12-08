/***
 Copyright (c) 2014 Anton Rychagov

 Licensed under the Apache License, Version 2.0 (the "License"); you may
 not use this file except in compliance with the License. You may obtain
 a copy of the License at
 http://www.apache.org/licenses/LICENSE-2.0
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.arychagov.deviceinfo.config;

import android.content.Context;
import android.content.res.Configuration;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationConfigProvider extends ConfigProvider {
    public ConfigurationConfigProvider(final Context context) {
        super(context);
    }

    @Override
    public Map<String, String> provideConfiguration() {
        final Configuration configuration = mContext.getResources().getConfiguration();
        final Map<String, String> result = new HashMap<>();

        final int keyboard = configuration.keyboard;
        String keyboardString = null;
        switch (keyboard) {
            case Configuration.KEYBOARD_12KEY:
                keyboardString = "KEYBOARD_12KEY";
                break;
            case Configuration.KEYBOARD_QWERTY:
                keyboardString = "KEYBOARD_QWERTY";
                break;
            case Configuration.KEYBOARD_NOKEYS:
                keyboardString = "KEYBOARD_NOKEYS";
                break;
            case Configuration.KEYBOARD_UNDEFINED:
                keyboardString = "KEYBOARD_UNDEFINED";
                break;
        }
        result.put("keyboard", keyboardString);

        final int keyboardHidden = configuration.keyboardHidden;
        String keyboardHiddenString = null;
        switch (keyboardHidden) {
            case Configuration.KEYBOARDHIDDEN_NO:
                keyboardHiddenString = "KEYBOARDHIDDEN_NO";
                break;
            case Configuration.KEYBOARDHIDDEN_UNDEFINED:
                keyboardHiddenString = "KEYBOARDHIDDEN_UNDEFINED";
                break;
            case Configuration.KEYBOARDHIDDEN_YES:
                keyboardHiddenString = "KEYBOARDHIDDEN_YES";
                break;
        }
        result.put("keyboardHidden", keyboardHiddenString);

        final int hardKeyboardHidden = configuration.hardKeyboardHidden;
        String hardKeyboardHiddenString = null;
        switch (hardKeyboardHidden) {
            case Configuration.HARDKEYBOARDHIDDEN_NO:
                hardKeyboardHiddenString = "HARDKEYBOARDHIDDEN_NO";
                break;
            case Configuration.HARDKEYBOARDHIDDEN_YES:
                hardKeyboardHiddenString = "HARDKEYBOARDHIDDEN_YES";
                break;
            case Configuration.HARDKEYBOARDHIDDEN_UNDEFINED:
                hardKeyboardHiddenString = "HARDKEYBOARDHIDDEN_UNDEFINED";
                break;
        }
        result.put("hardKeyboardHidden", hardKeyboardHiddenString);

        final int navigation = configuration.navigation;
        String navigationString = null;
        switch (navigation) {
            case Configuration.NAVIGATION_DPAD:
                navigationString = "NAVIGATION_DPAD";
                break;
            case Configuration.NAVIGATION_NONAV:
                navigationString = "NAVIGATION_NONAV";
                break;
            case Configuration.NAVIGATION_TRACKBALL:
                navigationString = "NAVIGATION_TRACKBALL";
                break;
            case Configuration.NAVIGATION_WHEEL:
                navigationString = "NAVIGATION_WHEEL";
                break;
            case Configuration.NAVIGATION_UNDEFINED:
                navigationString = "NAVIGATION_UNDEFINED";
                break;
        }
        result.put("navigation", navigationString);


        final int navigationHidden = configuration.navigationHidden;
        String navigationHiddenString = null;
        switch (navigationHidden) {
            case Configuration.NAVIGATIONHIDDEN_NO:
                navigationHiddenString = "NAVIGATIONHIDDEN_NO";
                break;
            case Configuration.NAVIGATIONHIDDEN_YES:
                navigationHiddenString = "NAVIGATIONHIDDEN_YES";
                break;
            case Configuration.NAVIGATIONHIDDEN_UNDEFINED:
                navigationHiddenString = "NAVIGATIONHIDDEN_UNDEFINED";
                break;
        }
        result.put("navigationHidden", navigationHiddenString);

        final int touchscreen = configuration.touchscreen;
        String touchscreenString = null;
        switch (touchscreen) {
            case Configuration.TOUCHSCREEN_FINGER:
                touchscreenString = "TOUCHSCREEN_FINGER";
                break;
            case Configuration.TOUCHSCREEN_NOTOUCH:
                touchscreenString = "TOUCHSCREEN_NOTOUCH";
                break;
            case Configuration.TOUCHSCREEN_UNDEFINED:
                touchscreenString = "TOUCHSCREEN_UNDEFINED";
                break;
            case Configuration.TOUCHSCREEN_STYLUS:
                touchscreenString = "TOUCHSCREEN_STYLUS";
                break;
        }
        result.put("touchscreen", touchscreenString);

        return result;
    }
}
