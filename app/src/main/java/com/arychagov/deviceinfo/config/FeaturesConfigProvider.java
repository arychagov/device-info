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

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

import java.util.HashMap;
import java.util.Map;

public class FeaturesConfigProvider extends ConfigProvider {
    public FeaturesConfigProvider(final Context context) {
        super(context);
    }

    @SuppressLint("InlinedApi")
    @Override
    public Map<String, String> provideConfiguration() {
        final Map<String, String> result = new HashMap<String, String>();
        final PackageManager pm = mContext.getPackageManager();
        switch (Build.VERSION.SDK_INT) {
            case Build.VERSION_CODES.LOLLIPOP:
                result.put("FEATURE_AUDIO_OUTPUT", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_AUDIO_OUTPUT)));
                result.put("FEATURE_GAMEPAD", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_GAMEPAD)));
                result.put("FEATURE_LIVE_TV", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_LIVE_TV)));
                result.put("FEATURE_MANAGED_USERS", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_MANAGED_USERS)));
                result.put("FEATURE_SECURELY_REMOVES_USERS", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_SECURELY_REMOVES_USERS)));
                result.put("FEATURE_SENSOR_AMBIENT_TEMPERATURE", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_SENSOR_AMBIENT_TEMPERATURE)));
                result.put("FEATURE_SENSOR_HEART_RATE_ECG", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_SENSOR_HEART_RATE_ECG)));
                result.put("FEATURE_SENSOR_RELATIVE_HUMIDITY", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_SENSOR_RELATIVE_HUMIDITY)));
            case Build.VERSION_CODES.KITKAT_WATCH:
                result.put("FEATURE_BACKUP", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_BACKUP)));
                result.put("FEATURE_PRINTING", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_PRINTING)));
            case Build.VERSION_CODES.KITKAT:
                result.put("FEATURE_CONSUMER_IR", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_CONSUMER_IR)));
                result.put("FEATURE_DEVICE_ADMIN", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_DEVICE_ADMIN)));
                result.put("FEATURE_NFC_HOST_CARD_EMULATION", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_NFC_HOST_CARD_EMULATION)));
                result.put("FEATURE_SENSOR_STEP_COUNTER", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_SENSOR_STEP_COUNTER)));
                result.put("FEATURE_SENSOR_STEP_DETECTOR", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_SENSOR_STEP_DETECTOR)));
            case Build.VERSION_CODES.JELLY_BEAN_MR2:
                result.put("FEATURE_HOME_SCREEN", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_HOME_SCREEN)));
                result.put("FEATURE_APP_WIDGETS", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_APP_WIDGETS)));
                result.put("FEATURE_BLUETOOTH_LE", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE)));
            case 16:
                result.put("FEATURE_TELEVISION", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_TELEVISION)));
            case 14:
                result.put("FEATURE_WIFI_DIRECT", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_WIFI_DIRECT)));
            case 13:
                result.put("FEATURE_FAKETOUCH_MULTITOUCH_DISTINCT", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_FAKETOUCH_MULTITOUCH_DISTINCT)));
                result.put("FEATURE_FAKETOUCH_MULTITOUCH_JAZZHAND", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_FAKETOUCH_MULTITOUCH_JAZZHAND)));
                result.put("FEATURE_SCREEN_PORTRAIT", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_SCREEN_PORTRAIT)));
                result.put("FEATURE_SCREEN_LANDSCAPE", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_SCREEN_LANDSCAPE)));
            case 12:
                result.put("FEATURE_USB_HOST", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_USB_HOST)));
                result.put("FEATURE_USB_ACCESSORY", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_USB_ACCESSORY)));
            case 11:
                result.put("FEATURE_FAKETOUCH", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_FAKETOUCH)));
            case 9:
                result.put("FEATURE_NFC", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_NFC)));
                result.put("FEATURE_AUDIO_LOW_LATENCY", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_AUDIO_LOW_LATENCY)));
                result.put("FEATURE_CAMERA_FRONT", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_CAMERA_FRONT)));
                result.put("FEATURE_SIP", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_SIP)));
                result.put("FEATURE_SIP_VOIP", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_SIP_VOIP)));
                result.put("FEATURE_SENSOR_BAROMETER", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_SENSOR_BAROMETER)));
                result.put("FEATURE_SENSOR_GYROSCOPE", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_SENSOR_GYROSCOPE)));
                result.put("FEATURE_TOUCHSCREEN_MULTITOUCH_JAZZHAND", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_TOUCHSCREEN_MULTITOUCH_JAZZHAND)));
            case 8:
                result.put("FEATURE_BLUETOOTH", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_BLUETOOTH)));
                result.put("FEATURE_CAMERA", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_CAMERA)));
                result.put("FEATURE_CAMERA_AUTOFOCUS", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_CAMERA_AUTOFOCUS)));
                result.put("FEATURE_CAMERA_FLASH", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH)));
                result.put("FEATURE_LOCATION", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_LOCATION)));
                result.put("FEATURE_LOCATION_GPS", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_LOCATION_GPS)));
                result.put("FEATURE_LOCATION_NETWORK", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_LOCATION_NETWORK)));
                result.put("FEATURE_MICROPHONE", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_MICROPHONE)));
                result.put("FEATURE_SENSOR_COMPASS", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_SENSOR_COMPASS)));
                result.put("FEATURE_SENSOR_ACCELEROMETER", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_SENSOR_ACCELEROMETER)));
                result.put("FEATURE_SENSOR_LIGHT", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_SENSOR_LIGHT)));
                result.put("FEATURE_SENSOR_PROXIMITY", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_SENSOR_PROXIMITY)));
                result.put("FEATURE_TELEPHONY", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_TELEPHONY)));
                result.put("FEATURE_TELEPHONY_CDMA", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_TELEPHONY_CDMA)));
                result.put("FEATURE_TELEPHONY_GSM", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_TELEPHONY_GSM)));
                result.put("FEATURE_TOUCHSCREEN", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_TOUCHSCREEN)));
                result.put("FEATURE_TOUCHSCREEN_MULTITOUCH", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_TOUCHSCREEN_MULTITOUCH)));
                result.put("FEATURE_TOUCHSCREEN_MULTITOUCH_DISTINCT", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_TOUCHSCREEN_MULTITOUCH_DISTINCT)));
                result.put("FEATURE_LIVE_WALLPAPER", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_LIVE_WALLPAPER)));
                result.put("FEATURE_WIFI", Boolean.toString(pm.hasSystemFeature(PackageManager.FEATURE_WIFI)));
        }
        return result;
    }
}
