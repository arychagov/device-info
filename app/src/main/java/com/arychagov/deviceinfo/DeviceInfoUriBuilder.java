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
import android.net.Uri;
import android.support.annotation.NonNull;

public class DeviceInfoUriBuilder {
    private static final String BOARD = "board";

    @NonNull private final Uri.Builder mUriBuilder;
    @NonNull private final DeviceInfoProvider mDeviceInfoProvider;

    /**
     * Creates builder instance from uri string
     *
     * @param uri string uri
     * @see Uri#parse(String)
     * @see Uri#buildUpon()
     */
    public DeviceInfoUriBuilder(@NonNull final String uri, @NonNull final Context context) {
        this(Uri.parse(uri), context);
    }

    /**
     * Creates builder instance from uri
     *
     * @param uri uri
     * @see Uri#buildUpon()
     */
    public DeviceInfoUriBuilder(@NonNull final Uri uri, @NonNull final Context context) {
        this(uri.buildUpon(), context);
    }

    /**
     * Creates builder instance from uri builder.
     * Note, that passed builder object will be used as is.
     *
     * @param builder uri builder
     */
    public DeviceInfoUriBuilder(@NonNull final Uri.Builder builder, @NonNull final Context context) {
        //noinspection ConstantConditions
        if (builder == null) {
            throw new NullPointerException("Expected non-null builder!");
        }

        //noinspection ConstantConditions
        if (context == null) {
            throw new NullPointerException("Expected non-null context!");
        }

        mUriBuilder = builder;
        mDeviceInfoProvider = DeviceInfoProvider.getInstance(context);
    }

    public BuildConfigUriBuilder startBuildConfig() {
        return new BuildConfigUriBuilder(mDeviceInfoProvider.getBuildConfigProvider());
    }

    /**
     * Constructs a Uri with the current attributes.
     *
     * @return built uri
     * @see Uri.Builder#build()
     */
    @NonNull public Uri build() {
        return mUriBuilder.build();
    }

    /**
     * Returns nested uri builder for further building
     *
     * @return builder
     * @see Uri.Builder#buildUpon()
     */
    @NonNull public Uri.Builder buildUpon() {
        return mUriBuilder;
    }

    public class BuildConfigUriBuilder {
        @NonNull private final BuildConfigProvider mProvider;

        private BuildConfigUriBuilder(@NonNull final BuildConfigProvider provider) {
            mProvider = provider;
        }

        public BuildConfigUriBuilder board() {
            return board(BOARD);
        }

        public BuildConfigUriBuilder board(final String key) {
            mUriBuilder.appendQueryParameter(key, mProvider.getBoard());
            return this;
        }

        public DeviceInfoUriBuilder endBuildConfig() {
            return DeviceInfoUriBuilder.this;
        }
    }
}
