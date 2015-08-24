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
import android.os.Build;
import android.support.annotation.NonNull;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * {@link DisplayMetrics} wrapper class
 *
 * @see DisplayMetrics
 */
public final class DisplayMetricsConfigProvider {
    private static final String UNKNOWN = "UNKNOWN";

    private final Context mContext;

    DisplayMetricsConfigProvider(final Context context) {
        mContext = context;
    }

    /**
     * @return {@link DisplayMetrics#densityDpi}
     */
    public int getDensityDpi() {
        final DisplayMetrics metrics = getDisplayMetrics();
        return metrics.densityDpi;
    }

    @NonNull
    private DisplayMetrics getDisplayMetrics() {
        final WindowManager windowManager = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);
        final DisplayMetrics metrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            windowManager.getDefaultDisplay().getRealMetrics(metrics);
        } else {
            windowManager.getDefaultDisplay().getMetrics(metrics);
        }
        return metrics;
    }

    /**
     * @return String representation of DENSITY_* values from {@link DisplayMetrics} as resource
     * qualifiers (i.e. <i>xhdpi</i> for {@link DisplayMetrics#DENSITY_XHIGH})
     */
    @NonNull
    public String getDensityDpiString() {
        final DisplayMetrics metrics = getDisplayMetrics();
        switch (metrics.densityDpi) {
            case DisplayMetrics.DENSITY_LOW:
                return "ldpi";
            case DisplayMetrics.DENSITY_MEDIUM:
                return "mdpi";
            case DisplayMetrics.DENSITY_HIGH:
                return "hdpi";
            case DisplayMetrics.DENSITY_XHIGH:
                return "xhdpi";
            case DisplayMetrics.DENSITY_XXHIGH:
                return "xxhdpi";
            case DisplayMetrics.DENSITY_XXXHIGH:
                return "xxxhdpi";
            case DisplayMetrics.DENSITY_TV:
                return "tvdpi";
            case DisplayMetrics.DENSITY_400:
                return "400dpi";
            case DisplayMetrics.DENSITY_560:
                return "560dpi";
        }

        return UNKNOWN;
    }

    /**
     * @return {@link DisplayMetrics#scaledDensity}
     */
    public float getScaledDensity() {
        final DisplayMetrics displayMetrics = getDisplayMetrics();
        return displayMetrics.scaledDensity;
    }

    /**
     * @return {@link DisplayMetrics#xdpi}
     */
    public float getXDpi() {
        final DisplayMetrics displayMetrics = getDisplayMetrics();
        return displayMetrics.xdpi;
    }

    /**
     * @return {@link DisplayMetrics#ydpi}
     */
    public float getYDpi() {
        final DisplayMetrics displayMetrics = getDisplayMetrics();
        return displayMetrics.ydpi;
    }

    /**
     * @return {@link DisplayMetrics#density}
     */
    public float getDensity() {
        final DisplayMetrics displayMetrics = getDisplayMetrics();
        return displayMetrics.density;
    }

    /**
     * @return {@link DisplayMetrics#widthPixels}
     */
    public float getWidthPixels() {
        final DisplayMetrics displayMetrics = getDisplayMetrics();
        return displayMetrics.widthPixels;
    }

    /**
     * @return {@link DisplayMetrics#heightPixels}
     */
    public float getHeightPixels() {
        final DisplayMetrics displayMetrics = getDisplayMetrics();
        return displayMetrics.heightPixels;
    }
}
