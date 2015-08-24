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
import android.provider.Telephony;
import android.support.annotation.NonNull;

/**
 * *ConfigProvider classes aggregator
 */
public final class DeviceInfoProvider {
    private static volatile DeviceInfoProvider sInstance;

    @NonNull private final BuildConfigProvider mBuildConfigProvider;
    @NonNull private final ConfigurationConfigProvider mConfigurationConfigProvider;
    @NonNull private final DisplayMetricsConfigProvider mDisplayMetricsConfigProvider;
    @NonNull private final FeaturesConfigProvider mFeaturesConfigProvider;
    @NonNull private final ProcessorConfigProvider mProcessorConfigProvider;
    @NonNull private final TelephonyConfigProvider mTelephonyConfigProvider;

    public static DeviceInfoProvider getInstance(final Context context) {
        if (sInstance == null) {
            synchronized (DeviceInfoProvider.class) {
                if (sInstance == null) {
                    sInstance = new DeviceInfoProvider(context);
                }
            }
        }

        return sInstance;
    }

    private DeviceInfoProvider(@NonNull final Context context) {
        final Context applicationContext = context.getApplicationContext();

        mBuildConfigProvider = new BuildConfigProvider();
        mConfigurationConfigProvider = new ConfigurationConfigProvider(applicationContext);
        mDisplayMetricsConfigProvider = new DisplayMetricsConfigProvider(applicationContext);
        mFeaturesConfigProvider = new FeaturesConfigProvider(applicationContext);
        mProcessorConfigProvider = new ProcessorConfigProvider();
        mTelephonyConfigProvider = new TelephonyConfigProvider(applicationContext);
    }

    @NonNull public ConfigurationConfigProvider getConfigurationConfigProvider() {
        return mConfigurationConfigProvider;
    }
    @NonNull public BuildConfigProvider getBuildConfigProvider() {
        return mBuildConfigProvider;
    }
    @NonNull public DisplayMetricsConfigProvider getDisplayMetricsConfigProvider() {
        return mDisplayMetricsConfigProvider;
    }
    @NonNull public FeaturesConfigProvider getFeaturesConfigProvider() {
        return mFeaturesConfigProvider;
    }
    @NonNull public ProcessorConfigProvider getProcessorConfigProvider() {
        return mProcessorConfigProvider;
    }
}
