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
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import com.arychagov.deviceinfo.DeviceInfoActivity;

import java.util.HashMap;
import java.util.Map;

public class DisplayMetricsConfigProvider extends ConfigProvider {
    public DisplayMetricsConfigProvider(final Context context) {
        super(context);
    }

    @Override
    public Map<String, String> provideConfiguration() {
        final Map<String, String> result = new HashMap<>();

        final DisplayMetrics metrics = mContext.getResources().getDisplayMetrics();
        ((DeviceInfoActivity) mContext).getWindowManager().getDefaultDisplay().getMetrics(metrics);

        final int orientation = mContext.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            result.put("width-landscape", String.valueOf(metrics.widthPixels));
            result.put("height-landscape", String.valueOf(metrics.heightPixels));
        } else {
            result.put("width-portrait", String.valueOf(metrics.widthPixels));
            result.put("height-portrait", String.valueOf(metrics.heightPixels));
        }
        String densityString = null;
        switch (metrics.densityDpi) {
            case DisplayMetrics.DENSITY_LOW:
                densityString = "ldpi";
                break;
            case DisplayMetrics.DENSITY_MEDIUM:
                densityString = "mdpi";
                break;
            case DisplayMetrics.DENSITY_HIGH:
                densityString = "hdpi";
                break;
            case DisplayMetrics.DENSITY_XHIGH:
                densityString = "xhdpi";
                break;
            case DisplayMetrics.DENSITY_XXHIGH:
                densityString = "xxhdpi";
                break;
            case DisplayMetrics.DENSITY_XXXHIGH:
                densityString = "xxxhdpi";
                break;
            case DisplayMetrics.DENSITY_TV:
                densityString = "tvdpi";
                break;
            case DisplayMetrics.DENSITY_400:
                densityString = "400dpi";
                break;
            case DisplayMetrics.DENSITY_560:
                densityString = "560dpi";
                break;
        }

        result.put("deviceDensity", densityString);
        return result;
    }
}
