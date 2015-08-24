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

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;

/**
 * {@link PackageManager#hasSystemFeature(String)} wrapper class
 *
 * @see PackageManager
 */
public final class FeaturesConfigProvider {
    @NonNull private final PackageManager mPackageManager;

    FeaturesConfigProvider(final Context context) {
        mPackageManager = context.getPackageManager();
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_BLUETOOTH}
     */
    @TargetApi(8)
    public boolean hasFeatureBluetooth() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_BLUETOOTH);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_CAMERA}
     */
    @TargetApi(8)
    public boolean hasFeatureCamera() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_CAMERA_AUTOFOCUS}
     */
    @TargetApi(8)
    public boolean hasFeatureCameraAutoFocus() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_AUTOFOCUS);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_CAMERA_FLASH}
     */
    @TargetApi(8)
    public boolean hasFeatureCameraFlash() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_LOCATION}
     */
    @TargetApi(8)
    public boolean hasFeatureLocation() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_LOCATION);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_LOCATION_GPS}
     */
    @TargetApi(8)
    public boolean hasFeatureLocationGps() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_LOCATION_GPS);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_LOCATION_NETWORK}
     */
    @TargetApi(8)
    public boolean hasFeatureLocationNetwork() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_LOCATION_NETWORK);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_MICROPHONE}
     */
    @TargetApi(8)
    public boolean hasFeatureMicrophone() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_MICROPHONE);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_SENSOR_COMPASS}
     */
    @TargetApi(8)
    public boolean hasFeatureSensorCompass() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_SENSOR_COMPASS);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_SENSOR_ACCELEROMETER}
     */
    @TargetApi(8)
    public boolean hasFeatureSensorAccelerometer() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_SENSOR_ACCELEROMETER);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_SENSOR_LIGHT}
     */
    @TargetApi(8)
    public boolean hasFeatureSensorLight() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_SENSOR_LIGHT);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_SENSOR_PROXIMITY}
     */
    @TargetApi(8)
    public boolean hasFeatureSensorProximity() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_SENSOR_PROXIMITY);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_TELEPHONY}
     */
    @TargetApi(8)
    public boolean hasFeatureTelephony() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_TELEPHONY);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_TELEPHONY_CDMA}
     */
    @TargetApi(8)
    public boolean hasFeatureTelephonyCdma() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_TELEPHONY_CDMA);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_TELEPHONY_GSM}
     */
    @TargetApi(8)
    public boolean hasFeatureTelephonyGsm() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_TELEPHONY_GSM);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_TOUCHSCREEN}
     */
    @TargetApi(8)
    public boolean hasFeatureTouchScreen() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_TOUCHSCREEN);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_TOUCHSCREEN_MULTITOUCH}
     */
    @TargetApi(8)
    public boolean hasFeatureTouchScreenMultitouch() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_TOUCHSCREEN_MULTITOUCH);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_TOUCHSCREEN_MULTITOUCH_DISTINCT}
     */
    @TargetApi(8)
    public boolean hasFeatureTouchScreenMultitouchDistinct() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_TOUCHSCREEN_MULTITOUCH_DISTINCT);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_LIVE_WALLPAPER}
     */
    @TargetApi(8)
    public boolean hasFeatureWallpaper() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_LIVE_WALLPAPER);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_WIFI}
     */
    @TargetApi(8)
    public boolean hasFeatureWifi() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_WIFI);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_NFC}
     */
    @TargetApi(9)
    public boolean hasFeatureNfc() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_NFC);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_AUDIO_LOW_LATENCY}
     */
    @TargetApi(9)
    public boolean hasFeatureAudioLowLatency() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_AUDIO_LOW_LATENCY);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_CAMERA_FRONT}
     */
    @TargetApi(9)
    public boolean hasFeatureCameraFront() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_FRONT);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_SIP}
     */
    @TargetApi(9)
    public boolean hasFeatureSip() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_SIP);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_SIP_VOIP}
     */
    @TargetApi(9)
    public boolean hasFeatureSipVoip() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_SIP_VOIP);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_SENSOR_BAROMETER}
     */
    @TargetApi(9)
    public boolean hasFeatureSensorBarometer() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_SENSOR_BAROMETER);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_SENSOR_GYROSCOPE}
     */
    @TargetApi(9)
    public boolean hasFeatureSensorGyroscope() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_SENSOR_GYROSCOPE);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_TOUCHSCREEN_MULTITOUCH_JAZZHAND}
     */
    @TargetApi(9)
    public boolean hasFeatureTouchScreenMultitouchJazzhand() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_TOUCHSCREEN_MULTITOUCH_JAZZHAND);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_FAKETOUCH}
     */
    @TargetApi(11)
    public boolean hasFeatureFakeTouch() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_FAKETOUCH);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_USB_HOST}
     */
    @TargetApi(12)
    public boolean hasFeatureUsbHost() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_USB_HOST);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_USB_ACCESSORY}
     */
    @TargetApi(12)
    public boolean hasFeatureUsbAccessory() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_USB_ACCESSORY);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_FAKETOUCH_MULTITOUCH_DISTINCT}
     */
    @TargetApi(13)
    public boolean hasFeatureFakeTouchMultitouchDistinct() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_FAKETOUCH_MULTITOUCH_DISTINCT);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_FAKETOUCH_MULTITOUCH_JAZZHAND}
     */
    @TargetApi(13)
    public boolean hasFeatureFakeTouchMultitouchJazzhand() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_FAKETOUCH_MULTITOUCH_JAZZHAND);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_SCREEN_PORTRAIT}
     */
    @TargetApi(13)
    public boolean hasFeatureScreenPortrait() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_SCREEN_PORTRAIT);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_SCREEN_LANDSCAPE}
     */
    @TargetApi(13)
    public boolean hasFeatureScreenLandscape() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_SCREEN_LANDSCAPE);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_WIFI_DIRECT}
     */
    @TargetApi(14)
    public boolean hasFeatureWifiDirect() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_WIFI_DIRECT);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_TELEVISION}
     * @deprecated use {@link #hasFeatureLeanback()} instead.
     */
    @Deprecated
    @TargetApi(16)
    public boolean hasFeatureTelevision() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_TELEVISION);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_CAMERA_ANY}
     */
    @TargetApi(17)
    public boolean hasFeatureCameraAny() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_HOME_SCREEN}
     */
    @TargetApi(18)
    public boolean hasFeatureHomeScreen() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_HOME_SCREEN);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_APP_WIDGETS}
     */
    @TargetApi(18)
    public boolean hasFeatureAppWidgets() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_APP_WIDGETS);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_INPUT_METHODS}
     */
    @TargetApi(18)
    public boolean hasFeatureInputMethods() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_INPUT_METHODS);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_BLUETOOTH_LE}
     */
    @TargetApi(18)
    public boolean hasFeatureBluetoothLE() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_CONSUMER_IR}
     */
    @TargetApi(19)
    public boolean hasFeatureConsumeIr() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_CONSUMER_IR);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_DEVICE_ADMIN}
     */
    @TargetApi(19)
    public boolean hasFeatureDeviceAdmin() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_DEVICE_ADMIN);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_NFC_HOST_CARD_EMULATION}
     */
    @TargetApi(19)
    public boolean hasFeatureNfcHostCardEmulation() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_NFC_HOST_CARD_EMULATION);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_SENSOR_STEP_COUNTER}
     */
    @TargetApi(19)
    public boolean hasFeatureSensorStepCounter() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_SENSOR_STEP_COUNTER);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_SENSOR_STEP_DETECTOR}
     */
    @TargetApi(19)
    public boolean hasFeatureSensorStepDetector() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_SENSOR_STEP_DETECTOR);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_BACKUP}
     */
    @TargetApi(20)
    public boolean hasFeatureBackup() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_BACKUP);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_CAMERA_EXTERNAL}
     */
    @TargetApi(20)
    public boolean hasFeatureCameraExternal() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_EXTERNAL);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_PRINTING}
     */
    @TargetApi(20)
    public boolean hasFeaturePrinting() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_PRINTING);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_WEBVIEW}
     */
    @TargetApi(20)
    public boolean hasFeatureWebView() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_WEBVIEW);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_AUDIO_OUTPUT}
     */
    @TargetApi(21)
    public boolean hasFeatureAudioOutput() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_AUDIO_OUTPUT);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_GAMEPAD}
     */
    @TargetApi(21)
    public boolean hasFeatureGamepad() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_GAMEPAD);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_LIVE_TV}
     */
    @TargetApi(21)
    public boolean hasFeatureLiveTv() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_LIVE_TV);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_MANAGED_USERS}
     */
    @TargetApi(21)
    public boolean hasFeatureManagedUsers() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_MANAGED_USERS);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_SECURELY_REMOVES_USERS}
     */
    @TargetApi(21)
    public boolean hasFeatureSecurelyRemovesUsers() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_SECURELY_REMOVES_USERS);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_SENSOR_AMBIENT_TEMPERATURE}
     */
    @TargetApi(21)
    public boolean hasFeatureSensorAmbientTemperature() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_SENSOR_AMBIENT_TEMPERATURE);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_SENSOR_HEART_RATE_ECG}
     */
    @TargetApi(21)
    public boolean hasFeatureSensorHeartRateECG() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_SENSOR_HEART_RATE_ECG);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_SENSOR_RELATIVE_HUMIDITY}
     */
    @TargetApi(21)
    public boolean hasFeatureSensorRelativeHumidity() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_SENSOR_RELATIVE_HUMIDITY);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_CAMERA_CAPABILITY_MANUAL_POST_PROCESSING}
     */
    @TargetApi(21)
    public boolean hasFeatureCameraCapabilityPostProcessing() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_CAPABILITY_MANUAL_POST_PROCESSING);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_CAMERA_CAPABILITY_MANUAL_SENSOR}
     */
    @TargetApi(21)
    public boolean hasFeatureCameraCapabilityManualSensor() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_CAPABILITY_MANUAL_SENSOR);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_CAMERA_CAPABILITY_RAW}
     */
    @TargetApi(21)
    public boolean hasFeatureCameraCapabilityRaw() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_CAPABILITY_RAW);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_CAMERA_LEVEL_FULL}
     */
    @TargetApi(21)
    public boolean hasFeatureCameraLevelFull() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_LEVEL_FULL);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_CONNECTION_SERVICE}
     */
    @TargetApi(21)
    public boolean hasFeatureLeanback() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_LEANBACK);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_OPENGLES_EXTENSION_PACK}
     */
    @TargetApi(21)
    public boolean hasFeatureOpenGLESExtensionPack() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_OPENGLES_EXTENSION_PACK);
    }

    /**
     * @return {@link PackageManager#hasSystemFeature(String)} with parameter value {@link PackageManager#FEATURE_VERIFIED_BOOT}
     */
    @TargetApi(21)
    public boolean hasFeatureVerifiedBoot() {
        return mPackageManager.hasSystemFeature(PackageManager.FEATURE_VERIFIED_BOOT);
    }
}
