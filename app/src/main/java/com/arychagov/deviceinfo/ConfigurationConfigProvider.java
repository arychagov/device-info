/***
 * Copyright (c) 2014 Anton Rychagov
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.arychagov.deviceinfo;

import android.content.Context;
import android.content.res.Configuration;
import android.support.annotation.NonNull;

/**
 * {@link Configuration} wrapper class
 *
 * @see Configuration
 */
final class ConfigurationConfigProvider {
    private static final String UNKNOWN = "UNKNOWN";

    @NonNull private final Context mContext;

    public ConfigurationConfigProvider(@NonNull final Context context) {
        mContext = context;
    }

    /**
     * @return String representation of KEYBOARD_* values from {@link Configuration}
     */
    @NonNull
    public String getKeyboardString() {
        final Configuration configuration = mContext.getResources().getConfiguration();

        final int keyboard = configuration.keyboard;
        switch (keyboard) {
            case Configuration.KEYBOARD_12KEY:
                return "KEYBOARD_12KEY";
            case Configuration.KEYBOARD_QWERTY:
                return "KEYBOARD_QWERTY";
            case Configuration.KEYBOARD_NOKEYS:
                return "KEYBOARD_NOKEYS";
            case Configuration.KEYBOARD_UNDEFINED:
                return "KEYBOARD_UNDEFINED";
        }

        return UNKNOWN;
    }

    /**
     * @return {@link Configuration#keyboard}
     */
    public int getKeyboard() {
        final Configuration configuration = mContext.getResources().getConfiguration();
        return configuration.keyboard;
    }

    /**
     * @return String representation of KEYBOARDHIDDEN_* values from {@link Configuration}
     */
    @NonNull
    public String getKeyboardHiddenString() {
        final Configuration configuration = mContext.getResources().getConfiguration();

        final int keyboardHidden = configuration.keyboardHidden;
        switch (keyboardHidden) {
            case Configuration.KEYBOARDHIDDEN_NO:
                return "KEYBOARDHIDDEN_NO";
            case Configuration.KEYBOARDHIDDEN_UNDEFINED:
                return "KEYBOARDHIDDEN_UNDEFINED";
            case Configuration.KEYBOARDHIDDEN_YES:
                return "KEYBOARDHIDDEN_YES";
        }

        return UNKNOWN;
    }


    /**
     * @return {@link Configuration#keyboardHidden}
     */
    public int getKeyboardHidden() {
        final Configuration configuration = mContext.getResources().getConfiguration();
        return configuration.keyboardHidden;
    }

    /**
     * @return String representation of HARDKEYBOARDHIDDEN_* values from {@link Configuration}
     */
    @NonNull
    public String getHardKeyboardHiddenString() {
        final Configuration configuration = mContext.getResources().getConfiguration();
        final int hardKeyboardHidden = configuration.hardKeyboardHidden;
        switch (hardKeyboardHidden) {
            case Configuration.HARDKEYBOARDHIDDEN_NO:
                return "HARDKEYBOARDHIDDEN_NO";
            case Configuration.HARDKEYBOARDHIDDEN_YES:
                return "HARDKEYBOARDHIDDEN_YES";
            case Configuration.HARDKEYBOARDHIDDEN_UNDEFINED:
                return "HARDKEYBOARDHIDDEN_UNDEFINED";
        }

        return UNKNOWN;
    }

    /**
     * @return {@link Configuration#hardKeyboardHidden}
     */
    public int getHardKeyboardHidden() {
        final Configuration configuration = mContext.getResources().getConfiguration();
        return configuration.hardKeyboardHidden;
    }

    /**
     * @return String representation of NAVIGATION_* values from {@link Configuration}
     */
    @NonNull
    public String getNavigationString() {
        final Configuration configuration = mContext.getResources().getConfiguration();

        final int navigation = configuration.navigation;
        switch (navigation) {
            case Configuration.NAVIGATION_DPAD:
                return "NAVIGATION_DPAD";
            case Configuration.NAVIGATION_NONAV:
                return "NAVIGATION_NONAV";
            case Configuration.NAVIGATION_TRACKBALL:
                return "NAVIGATION_TRACKBALL";
            case Configuration.NAVIGATION_WHEEL:
                return "NAVIGATION_WHEEL";
            case Configuration.NAVIGATION_UNDEFINED:
                return "NAVIGATION_UNDEFINED";
        }

        return UNKNOWN;
    }

    /**
     * @return {@link Configuration#navigation}
     */
    public int getNavigation() {
        final Configuration configuration = mContext.getResources().getConfiguration();
        return configuration.navigation;
    }

    /**
     * @return String representation of NAVIGATIONHIDDEN_* values from {@link Configuration}
     */
    @NonNull
    public String getNavigationHiddenString() {
        final Configuration configuration = mContext.getResources().getConfiguration();

        final int navigationHidden = configuration.navigationHidden;
        switch (navigationHidden) {
            case Configuration.NAVIGATIONHIDDEN_NO:
                return "NAVIGATIONHIDDEN_NO";
            case Configuration.NAVIGATIONHIDDEN_YES:
                return "NAVIGATIONHIDDEN_YES";
            case Configuration.NAVIGATIONHIDDEN_UNDEFINED:
                return "NAVIGATIONHIDDEN_UNDEFINED";
        }

        return UNKNOWN;
    }

    /**
     * @return {@link Configuration#navigationHidden}
     */
    public int getNavigationHidden() {
        final Configuration configuration = mContext.getResources().getConfiguration();
        return configuration.navigationHidden;
    }

    /**
     * @return String representation of TOUCHSCREEN_* values from {@link Configuration}
     */
    @NonNull
    public String getTouchscreenString() {
        final Configuration configuration = mContext.getResources().getConfiguration();

        final int touchscreen = configuration.touchscreen;
        switch (touchscreen) {
            case Configuration.TOUCHSCREEN_FINGER:
                return "TOUCHSCREEN_FINGER";
            case Configuration.TOUCHSCREEN_NOTOUCH:
                return "TOUCHSCREEN_NOTOUCH";
            case Configuration.TOUCHSCREEN_UNDEFINED:
                return "TOUCHSCREEN_UNDEFINED";
            case Configuration.TOUCHSCREEN_STYLUS:
                return "TOUCHSCREEN_STYLUS";
        }

        return UNKNOWN;
    }

    /**
     * @return {@link Configuration#touchscreen}
     */
    public int getTouchscreen() {
        final Configuration configuration = mContext.getResources().getConfiguration();
        return configuration.touchscreen;
    }
}