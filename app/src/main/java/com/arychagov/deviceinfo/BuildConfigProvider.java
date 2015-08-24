/***
 * Copyright (c) 2014 Anton Rychagov
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License" you may
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
import android.os.Build;

/**
 * {@link Build} wrapper class
 *
 * @see Build
 */
final class BuildConfigProvider {
    BuildConfigProvider() {
    }

    /**
     * @return {@link android.os.Build.VERSION#SDK_INT}
     */
    public int getSdkInt() {
        return Build.VERSION.SDK_INT;
    }

    /**
     * Retrieves SDK version name in lower case
     *
     * @return version name of sdk
     * @see android.os.Build.VERSION_CODES
     */
    public String getSdkName() {
        switch (Build.VERSION.SDK_INT) {
            case Build.VERSION_CODES.FROYO:
                return "froyo";
            case Build.VERSION_CODES.GINGERBREAD:
                return "gingerbread";
            case Build.VERSION_CODES.GINGERBREAD_MR1:
                return "gingerbread_mr1";
            case Build.VERSION_CODES.HONEYCOMB:
                return "honeycomb";
            case Build.VERSION_CODES.HONEYCOMB_MR1:
                return "honeycomb_mr1";
            case Build.VERSION_CODES.HONEYCOMB_MR2:
                return "honeycomb_mr2";
            case Build.VERSION_CODES.ICE_CREAM_SANDWICH:
                return "ice_cream_sandwich";
            case Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1:
                return "ice_cream_sandwich_mr1";
            case Build.VERSION_CODES.JELLY_BEAN:
                return "jelly_bean";
            case Build.VERSION_CODES.JELLY_BEAN_MR1:
                return "jelly_bean_mr1";
            case Build.VERSION_CODES.JELLY_BEAN_MR2:
                return "jelly_bean_mr2";
            case Build.VERSION_CODES.KITKAT:
                return "kitkat";
            case Build.VERSION_CODES.KITKAT_WATCH:
                return "kitkat_watch";
            case Build.VERSION_CODES.LOLLIPOP:
                return "lollipop";
            case Build.VERSION_CODES.LOLLIPOP_MR1:
                return "lollipop_mr1";
            default:
                return "unknown";
        }
    }

    /**
     * @return {@link android.os.Build#ID}
     */
    public String getBuildId() {
        return Build.ID;
    }

    /**
     * @return {@link android.os.Build#DISPLAY}
     */
    public String getDisplay() {
        return Build.DISPLAY;
    }

    /**
     * @return {@link android.os.Build#PRODUCT}
     */
    public String getProduct() {
        return Build.PRODUCT;
    }

    /**
     * @return {@link android.os.Build#DEVICE}
     */
    public String getDevice() {
        return Build.DEVICE;
    }

    /**
     * @return {@link android.os.Build#BOARD}
     */
    public String getBoard() {
        return Build.BOARD;
    }

    /**
     * @return {@link android.os.Build#CPU_ABI}
     */
    public String getCpuAbi() {
        return Build.CPU_ABI;
    }

    /**
     * @return {@link android.os.Build#CPU_ABI2}
     */
    public String getCpuAbi2() {
        return Build.CPU_ABI2;
    }

    /**
     * @return {@link android.os.Build#BRAND}
     */
    public String getBrand() {
        return Build.BRAND;
    }

    /**
     * @return {@link android.os.Build#MODEL}
     */
    public String getModel() {
        return Build.MODEL;
    }

    /**
     * @return {@link android.os.Build#BOOTLOADER}
     */
    public String getBootloader() {
        return Build.BOOTLOADER;
    }

    /**
     * @return {@link android.os.Build#RADIO}
     */
    public String getRadio() {
        return Build.RADIO;
    }

    /**
     * @return {@link Build#getRadioVersion()}
     */
    @TargetApi(14)
    public String getRadioVersion() {
        return Build.getRadioVersion();
    }

    /**
     * @return {@link android.os.Build#HARDWARE}
     */
    public String getHardware() {
        return Build.HARDWARE;
    }

    /**
     * @return {@link android.os.Build#TYPE}
     */
    public String getType() {
        return Build.TYPE;
    }

    /**
     * @return {@link android.os.Build#TAGS}
     */
    public String getTags() {
        return Build.TAGS;
    }

    /**
     * @return {@link android.os.Build#FINGERPRINT}
     */
    public String getFingerprint() {
        return Build.FINGERPRINT;
    }

    /**
     * @return {@link android.os.Build#MANUFACTURER}
     */
    public String getManufacturer() {
        return Build.MANUFACTURER;
    }
}
